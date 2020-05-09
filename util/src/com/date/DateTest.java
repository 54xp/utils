package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xp
 * @create 2020-05-07 16:02
 * 字符串与时间戳之间的相互转换
 */

public class DateTest {
    // 将字符串转为时间戳
    public static String getTime(String alarmTime) {
        String re_time = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d;
        try {
            d = sdf.parse(alarmTime);
            long l = d.getTime();
            String str = String.valueOf(l);
            re_time = str.substring(0, 10);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return re_time;
    }

    // 将时间戳转为字符串
    public static String getStrTime(String cc_time) {
        String re_StrTime = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lcc_time = Long.valueOf(cc_time);
        re_StrTime = sdf.format(new Date(lcc_time * 1000L));
        return re_StrTime;
    }
}
