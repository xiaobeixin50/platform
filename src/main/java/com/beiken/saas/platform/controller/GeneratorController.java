package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.Result;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
            Map<String, Map<Object, Object>> result = Maps.newHashMap();
            //result.put("DANGER_STATUS", DangerStatusEnum.MAP);
            //PageBo<TaskVO> pageBo = taskManager.listByUser(inspectUserId);
            return Result.success();
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }
}
