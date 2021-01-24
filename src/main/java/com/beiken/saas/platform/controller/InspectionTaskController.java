package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.TaskItemRecordVO;
import com.beiken.saas.platform.biz.vo.TaskRecordVO;
import com.beiken.saas.platform.service.InspectionTaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * (InspectionTask)表控制层
 *
 * @author xiaobeixin
 * @since 2020-11-21 11:15:12
 */
@Api(value = "/task", description = "巡检任务相关接口", tags = "巡检任务")
@RestController
@RequestMapping("task")
public class InspectionTaskController {
    /**
     * 服务对象
     */
    @Resource
    private InspectionTaskService inspectionTaskService;

//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @ApiOperation("通过Id搜索巡检任务")
//    @GetMapping("selectOne")
//    public InspectionTask selectOne(Long id) {
//        return this.inspectionTaskService.queryById(id);
//    }

    @ApiOperation("通过Id查看巡检任务明细")
    @GetMapping("detail")
    public Result<List<TaskItemRecordVO>> queryDetail(Long id) {
        List<TaskItemRecordVO> list = new ArrayList<>();
        for(int i=0;i<10; i++){
            TaskItemRecordVO item = new TaskItemRecordVO();
            item.setCode("test");
            item.setRfid("rfid");
            item.setDescription("任务项描述1");
            item.setFeedBackOption("拍照,RFID打卡");
            item.setFeedBack("不合格");
            item.setId(Long.parseLong(String.valueOf(i)));
            list.add(item);
        }
        return Result.success(list);
    }

    /**
     * 根据用户id查看任务列表
     * @param id 用户id
     * @return
     */
    @ApiOperation("获取巡检任务列表")
    @GetMapping("getList")
    public Result<List<TaskRecordVO>> getTaskList(Long id) {

        List<TaskRecordVO> task = inspectionTaskService.getTask(id);
        return Result.success(task);
//        List<TaskRecordVO> data = new ArrayList<>();
//        for(int i =0; i<10; i++){
//            TaskRecordVO task = new TaskRecordVO();
//            task.setCode("test" + i);
//            task.setDemandTime(new Date());
//            task.setTitle("测试任务" + i);
//            task.setProcess(80);
//            task.setItemCount(i);
//            task.setRiskCount(i);
//            task.setFinishTime(new Date());
//            task.setStatus(0);
//            data.add(task);
//        }
//        return Result.success(data);
    }

}