package com.beiken.saas.platform.enums;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午6:21
 */
public class Constants {

    //key->0-任务上报,1-主动上报
    public static Map<Integer, Map<Integer, List<Integer>>> STATUS_MAP = Maps.newLinkedHashMap();
    private static Map<Integer, List<Integer>> TASK_REPORT_MAP = Maps.newLinkedHashMap();
    private static Map<Integer, List<Integer>> USER_REPORT_MAP = Maps.newLinkedHashMap();

    static {
        //参考dangerStatusEnum
        TASK_REPORT_MAP.put(0, Lists.newArrayList(4, 0));
        TASK_REPORT_MAP.put(1, Lists.newArrayList(1, 3, 4, 0));
        TASK_REPORT_MAP.put(2, Lists.newArrayList(1, 3, 4, 0));
        TASK_REPORT_MAP.put(3, Lists.newArrayList(1, 2, 4, 5, 0));

        USER_REPORT_MAP.put(0, Lists.newArrayList(10, 4, 0));
        USER_REPORT_MAP.put(1, Lists.newArrayList(10, 1, 3, 4, 0));
        USER_REPORT_MAP.put(2, Lists.newArrayList(10, 1, 3, 4, 0));
        USER_REPORT_MAP.put(3, Lists.newArrayList(10, 1, 2, 4, 5, 0));

        STATUS_MAP.put(0, TASK_REPORT_MAP);
        STATUS_MAP.put(1, USER_REPORT_MAP);
    }

    public static final String LIKE = "%";
    public static final String COMMON = ",";
    public static final String LINE = "-";
    public static final String INSPECT_USER = "监理";
    public static final String RIG_MANAGER = "井队长";

    public static final String ERROR = "ERROR";
    public static final Integer ZERO_INT = 0;
    public static final Long ZERO_LONG = 0L;
    public static final Integer ONE_INT = 1;
    public static final Integer TWO_INT = 2;

}
