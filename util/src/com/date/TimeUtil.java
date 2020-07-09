package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author ilongsay
 * @Date: Create in 2019/9/26 8:43
 * @Description: don't bb,show you code
 */
public class TimeUtil {

    /**
     * 判断当前时间是否是有效时间内
     * @param startTime
	 * @param endTime
     *
     * @return boolean
     * @date 2019/9/26 8:45
     * @author ilongsay
     */
    public static boolean isEffectiveDate(Date startTime, Date endTime) {

        //当前时间
        Date now = new Date();
        Date nowTime =null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(now);

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        try {
            nowTime = dateFormat1.parse(format+" 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 开始时间大于结束时间，就是错误
     * @param startTime 开始时间
	 * @param endTime 结束时间
     *
     * @return boolean
     * @date 2019/9/26 9:16
     * @author ilongsay
     */
    public static boolean isTimeError(Date startTime, Date endTime) {
        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (startTime.getTime() == endTime.getTime()) {
            return true;
        }
        if (begin.after(end)) {
            return false;
        } else {
            return true;
        }
    }
}
