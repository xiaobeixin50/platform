package com.beiken.saas.platform.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 上午12:19
 */
public class DateUtil {

    public static final String DEFAULT_PARTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DEFAULT_PARTERN_SIMPLE= "yyyyMMdd";
    public static final String DEFAULT_PARTERN_MONTH= "yyyy-MM";
    public static final String DEFAULT_PARTERN_DETAIL= "yyyyMMddHHmmss";

    public static final String KEYUTC = "T";
    public static final String TIMEZONEUTC  = "UTC";


    public static boolean isSameDay(Date date1, Date date2) {
        return StringUtils.equals(formatDate(date1, DEFAULT_PARTERN_SIMPLE), formatDate(date2, DEFAULT_PARTERN_SIMPLE));
    }

    public static Date getStartOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Date(calendar.getTime().getTime());
    }

    public static String formatDate(final Date date, String format) {
        return formatDate(date, format, null);
    }

    public static String formatDate(final Date date, String format, String defaultVal) {
        try {
            if (date == null || StringUtils.isBlank(format)) {
                 return defaultVal;
            }
            String s = new SimpleDateFormat(format).format(date);
            if (StringUtils.isBlank(s)) {
                return defaultVal;
            }
            return s;
        } catch (Exception e) {

        }
        return defaultVal;
    }

    public static Date parseDate(Object date, String df) {
        return parseDate(date, df, null);
    }

    public static Date parseDate(Object date, String df, Date defaultValue) {
        return parseDate(date, df, defaultValue, false);
    }

    public static Date parseDate(Object date, String df , Date defaultValue, boolean restrict) {
        try {
            if (date == null) {
                return defaultValue;
            }
            String s = date.toString();
            if (StringUtils.isBlank(s)) {
                return defaultValue;
            }
            SimpleDateFormat formatter = new SimpleDateFormat(df);
            if (df.contains(KEYUTC)) {
                formatter.setTimeZone(TimeZone.getTimeZone(TIMEZONEUTC));
            }
            if (restrict) {
                formatter.setLenient(false);
            }
            return formatter.parse(s);
        } catch (Exception e) {

        }
        return defaultValue;
    }

}
