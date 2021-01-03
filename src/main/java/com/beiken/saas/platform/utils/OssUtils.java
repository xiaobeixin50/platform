package com.beiken.saas.platform.utils;

import com.aliyun.oss.HttpMethod;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.GeneratePresignedUrlRequest;
import com.aliyun.oss.model.PutObjectResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class OssUtils {

    private static final String BUCKET_NAME = "beiken-safety";
    private OSSClient ossClient = null;
    private static final long EXPIRE_LONG = 360000000000L;
    @Override
    protected void finalize(){
        if(this.ossClient != null){
            this.ossClient.shutdown();
            this.ossClient = null;
        }
    }
    public static OSS getOssClient(){
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4GBhunnonUkHFYwUnBC6";
        String accessKeySecret = "tXWF4cR9w1OyXLZhyzxdeenlLRq7wg";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        return ossClient;
    }


    public static String uploadFile(String objectName) throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4GBhunnonUkHFYwUnBC6";
        String accessKeySecret = "tXWF4cR9w1OyXLZhyzxdeenlLRq7wg";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传文件流。
        InputStream inputStream = new FileInputStream("<yourlocalFile>");
        PutObjectResult putObjectResult = ossClient.putObject(BUCKET_NAME, objectName, inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        return putObjectResult.getETag();
    }

    public static Map<String, Object> uploadFile(String objectName, MultipartFile uploadFile) throws Exception {
        Map result = new HashMap<String, String>();
        result.put("bucketName", BUCKET_NAME);
        result.put("success", false);

        // 创建OSSClient实例。
        OSS ossClient = getOssClient();

        InputStream is = null;
        try{
            is = uploadFile.getInputStream();
            PutObjectResult ossObject = ossClient.putObject(BUCKET_NAME, objectName, is);
            result.put("ETag", ossObject.getETag());
            String url = getSignedUrl(objectName, EXPIRE_LONG);
            result.put("url", url);
            result.put("success", true);
            result.put("objectName", objectName);
        }catch(IOException e){
            throw e;
        }finally {
            try{
                if(null != is){
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return result;
    }

    public static String getSignedUrl(String objectName, Long accessTime){
        Date expiration ;
        if(accessTime == null || accessTime <=0){
            expiration = new Date(System.currentTimeMillis() + (long)(3600*60));
        }else{
            expiration = new Date(System.currentTimeMillis() + accessTime);
        }
        OSS ossClient = getOssClient();
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(BUCKET_NAME, objectName, HttpMethod.GET);
        request.setExpiration(expiration);
        URL signedUrl = ossClient.generatePresignedUrl(request);
        return signedUrl.toString();
    }
}
