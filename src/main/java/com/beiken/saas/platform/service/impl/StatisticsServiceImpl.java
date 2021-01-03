package com.beiken.saas.platform.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.beiken.saas.platform.service.StatisticsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StatisticsServiceImpl implements StatisticsService {


    @Override
    public List<JSONObject> departmentCompare(Long depId, Date stateTime, Date endTime) {
        //mock数据
        List<JSONObject> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            //隐患数量
            item.put("depName", "北疆油服" + i);
            List<JSONObject> subItem = mockSub1();
            item.put("depStatics", subItem);
            list.add(item);
        }

        return list;
    }

    private List<JSONObject> mockSub1() {
        List<JSONObject> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            JSONObject item = new JSONObject();
            //隐患数量
            item.put("count", i);
            //隐患数量
            item.put("kind", "分类" + i);

            list.add(item);
        }
        return list;
    }


    @Override
    public List<JSONObject> hiddenDangerRank(Long depId, Date startTime, Date endTime) {
        //mock数据
        List<JSONObject> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            JSONObject item = new JSONObject();
            item.put("kind", "分类" + i);
            item.put("ratio", "10%");

            list.add(item);
        }
        return list;
    }

    @Override
    public List<JSONObject> departmentStatics(Long depId) {
        //mock数据
        List<JSONObject> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            item.put("depName", "北疆油服" + i);
            item.put("teamCount", i);
            item.put("danger", mockDangerList());
            item.put("teamList", mockTeamList());

            list.add(item);
        }
        return list;
    }
    private List<JSONObject> mockTeamList(){
        List<JSONObject> teamList = new ArrayList<>();
        JSONObject team1 = new JSONObject();
        team1.put("code", "H61W001井");
        team1.put("teamName", "12队");
        team1.put("manager","张三");
        team1.put("danger", mockDangerList());

        JSONObject team2 = new JSONObject();
        team2.put("code", "H61W001井");
        team2.put("teamName", "12队");
        team2.put("manager","张三");
        team2.put("danger", mockDangerList());
        teamList.add(team1);
        teamList.add(team2);

        return teamList;
    }
    private List<JSONObject> mockDangerList(){
        List<JSONObject> danger = new ArrayList<>();
        JSONObject danger1 = new JSONObject();
        danger1.put("level", "四级");
        danger1.put("count", 2);
        JSONObject danger2 = new JSONObject();
        danger2.put("level", "二级");
        danger2.put("count", 1);

        danger.add(danger1);
        danger.add(danger2);

        return danger;
    }

    @Override
    public List<JSONObject> taskStatics(Long depId, Date staticsDate) {
        //mock数据
        List<JSONObject> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            item.put("dailyTotal", 50);
            item.put("dailyCompleted", 48);

            item.put("monthlyTotal", 800);
            item.put("ratio",95);
            item.put("ratioOnTime",88);
            item.put("dangerCount", 20);

            item.put("depList", mockDepTask());
            list.add(item);

        }
        return list;
    }

    private List<JSONObject> mockDepTask(){
        List<JSONObject> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            item.put("name", "北京油服" + i);
            item.put("dailyTotal", 50);
            item.put("dailyCompleted", 48);

            item.put("monthlyTotal", 80);
            item.put("ratioOnTime",88);
            item.put("dangerCount", 20);
            list.add(item);
        }
        return list;
    }

    @Override
    public List<JSONObject> inspectorStatics(Long depId) {
        //mock数据
        List<JSONObject> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            item.put("name", "张三");
            item.put("mobile", "13010001000");
            item.put("depName", "北疆油服");
            item.put("place", "H20006井");
            item.put("completeCount", 18);
            item.put("uploadCount", 5);
            item.put("totalCount", 20);
            item.put("ratio", 90);

            list.add(item);
        }
        return list;
    }

    @Override
    public JSONObject singleInspectorStatics(Long depId, Long userId) {
        JSONObject result = new JSONObject();
        result.put("name", "张三");
        result.put("mobile", "13010001000");
        result.put("depName", "北疆油服");
        result.put("place", "H20006井");
        result.put("completeCount", 18);
        result.put("uploadCount", 5);
        //mock巡检任务数据
        List<JSONObject> taskList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            item.put("name", "XXX井常规巡检1019");
            item.put("inspector", "张三");
            item.put("finishTime", "2020-10-30 08:00");
            item.put("itemCount", 20);
            item.put("ratio", 60);
            item.put("dangerCount", 0);
            item.put("status", 0);
            taskList.add(item);
        }

        //mock安全隐患数据
        List<JSONObject> dangerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            item.put("name", "安全隐患010101");
            item.put("kind", "设备类");
            item.put("recordTime", "2020-10-10");
            item.put("place", "H61W001井");
            item.put("desc", "钻井泵压力没有在正常范围内");
            item.put("depName", "12队");
            item.put("level", "三级风险");
            item.put("status", 0);
            dangerList.add(item);
        }

        result.put("taskList", taskList);
        result.put("dangerList", dangerList);
        return result;
    }

    @Override
    public JSONObject managerFocus(Long depId, Long userId) {
        JSONObject result = new JSONObject();


        //mock待办事项数据
        List<JSONObject> todoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            item.put("name", "安全隐患010101");
            item.put("kind", "设备类");
            item.put("recordTime", "2020-10-10");
            item.put("place", "H61W001井");
            item.put("desc", "钻井泵压力没有在正常范围内");
            item.put("depName", "12队");
            item.put("level", "三级风险");
            item.put("status", 0);;


            todoList.add(item);
        }
        //mock重大风险数据
        List<JSONObject> dangerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject item = new JSONObject();
            item.put("name", "安全隐患010101");
            item.put("kind", "设备类");
            item.put("recordTime", "2020-10-10");
            item.put("place", "H61W001井");
            item.put("desc", "钻井泵压力没有在正常范围内");
            item.put("depName", "12队");
            item.put("level", "三级风险");
            item.put("status", 0);
            item.put("phase", "整改方案");
            item.put("manager", "李四");
            dangerList.add(item);
        }
        result.put("todoList", todoList);
        result.put("dangerList", dangerList);
        return result;
    }
}
