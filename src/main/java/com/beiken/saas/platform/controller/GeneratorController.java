package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.enums.DangerStatusEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: panboliang
 * Date: 21/3/3
 * Time: 下午12:38
 */
@Api(value = "/generator", description = "字典表", tags = "字典表")
@RestController
@RequestMapping("/generator")
public class GeneratorController {

    @ApiOperation("字典表")
    @ResponseBody
    @GetMapping(value = "/result")
    public Result list() {
        try {
            //PageBo<TaskVO> pageBo = taskManager.listByUser(inspectUserId);

            return Result.success(DangerStatusEnum.MAP);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }
}
