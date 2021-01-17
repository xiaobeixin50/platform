package com.beiken.saas.platform.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface StatisticsService {

    //统计单位对比
    public List<JSONObject> departmentCompare(Long depId, Date startTime, Date endTime);

    //安全隐患排名
    public List<JSONObject> hiddenDangerRank(Long depId, Date startTime, Date endTime);

    //按生产单位分类统计
    public List<JSONObject> departmentStatics(Long depId);

    //巡检任务统计, 包含分公司和井队的数据？
    public JSONObject taskStatics(Long depId, Date staticsDate);

    //按井队查询巡检任务
    public JSONObject taskStaticsByTeam(Long depId, Date staticsDate);

    //监理人员统计
    public List<JSONObject> inspectorStatics(Long depId);

    //单个监理人员统计，包括巡检任务和安全隐患
    public JSONObject singleInspectorStatics(Long depId, Long userId);

    //重点关注，包括待办事项和重大风险
    public JSONObject managerFocus(Long depId, Long userId);
}
