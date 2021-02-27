package com.beiken.saas.platform.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 上午11:17
 */
public class CastUtil {

    public static int intCast(String value) {
        return intCast(value, null);
    }

    public static Integer intCast(String value, Integer defaultvalue) {
        if (StringUtils.isNotBlank(value)) {
            try {
                return Integer.parseInt(value);
            } catch (Exception e) {
                return defaultvalue;
            }
        }
        return defaultvalue;
    }

    public static Long longCast(String value) {
        return longCast(value, null);
    }

    public static Long longCast(String value, Long defaultvalue) {
        if (StringUtils.isNotBlank(value)) {
            try {
                return Long.parseLong(value);
            } catch (Exception e) {
                return defaultvalue;
            }
        }
        return defaultvalue;
    }

    public static Double doubleCast(String value) {
        return doubleCast(value, null);
    }

    public static Double doubleCast(String value, Double defaultvalue) {
        if (StringUtils.isNotBlank(value)) {
            try {
                return Double.parseDouble(value);
            } catch (Exception e) {
                return defaultvalue;
            }
        }
        return defaultvalue;
    }

    public static Float floatCast(String value) {
        return floatCast(value, null);
    }

    public static Float floatCast(String value, Float defaultvalue) {
        if (StringUtils.isNotBlank(value)) {
            try {
                return Float.parseFloat(value);
            } catch (Exception e) {
                return defaultvalue;
            }
        }
        return defaultvalue;
    }

}
