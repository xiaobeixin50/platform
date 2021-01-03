package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.HiddenDangerVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.utils.OssUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Api(value = "/file", description = "文件相关接口", tags = "文件上传")
@RestController
@RequestMapping("file")
public class FileUploadController {
    private static final String URL_PREFIX = "https://beiken-safety.oss-cn-beijing.aliyuncs.com/";

    @ApiOperation("文件上传")
    @ResponseBody
    @RequestMapping(value="/upload", method = {RequestMethod.POST})
    public Result<String> uploadFile(@RequestParam String type, @RequestParam MultipartFile uploadFile) {
        //根据type获得上传路径

        String originalName = uploadFile.getOriginalFilename();
        String objectName = "users/" + originalName;
        Map<String, Object> result = null;
        try{
            result = OssUtils.uploadFile(objectName, uploadFile);
            String resultUrl = URL_PREFIX + objectName;
            return Result.success(resultUrl);
        }catch (Exception e){
            return Result.failed("UPLOAD_FILE_ERROR", e.getMessage());
        }

    }

    @ApiOperation("多文件上传")
    @ResponseBody
    @RequestMapping(value="/multiupload", method = {RequestMethod.POST})
    public Result<String> multiUploadFile(@RequestParam String type, @RequestParam("files") MultipartFile[] files) {
        //根据type获得上传路径
        MultipartFile uploadFile = files[0];
        String originalName = uploadFile.getOriginalFilename();
        String objectName = "users/" + originalName;
        Map<String, Object> result = null;
        try{
            result = OssUtils.uploadFile(objectName, uploadFile);
            String resultUrl = URL_PREFIX + objectName;
            return Result.success(resultUrl);
        }catch (Exception e){
            return Result.failed("UPLOAD_FILE_ERROR", e.getMessage());
        }

    }

    @ApiOperation("多文件上传")
    @ResponseBody
    @RequestMapping(value="/multiupload2", method = {RequestMethod.POST})
    public Result<String> multiUploadFile2(HttpServletRequest request) {
        String uploadDir = request.getParameter("uploadDir");
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
        if(fileMap == null || fileMap.size() == 0){
            return Result.failed("UPLOAD_FILE_ERROR", "请上传文件,注意文件的name属性为file");
        }
        return null;
    }
}
