package com.date;

 // import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author pengdan
 * @version DateTimeUtils, v0.1 2019/9/19 14:57
 */
public class DateTimeUtils {
    private DateTimeUtils(){
	}

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private static final SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMddHHmmss");

	/**
	 * 获取当前时间戳字符串，格式为yyyyMMddHHmmss
	 * @return
	 */
    public static String getCurrentTimeStamp() {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyyMMddHHmmss");
	}

	/**
	 * 根据指定的格式，生成当前时间戳字符串
	 *  @param pattern
	 * @return
	 */
    public static String getCurrentTimeStamp(String pattern) {
        Date now = new Date();
        return DateFormatUtils.format(now, pattern);
    }

	public static String getDate(String date) throws ParseException {
		Date strDate = new Date();
		try {
			strDate = new SimpleDateFormat("yyyyMMddHHmmss").parse(date);//先按照原格式转换为时间
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(strDate);//再将时间转换为对应格式字符串
		return str;
//		return dateFormat.format(dateFormat1.parse(date));
	}

	public static final Date dateTime(final String ts)
	{
		try
		{
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ts);
		}
		catch (ParseException e)
		{
			throw new RuntimeException(e);
		}
	}

	/**
	 * 取年 yyyy
	 *
	 * @return int
	 */
	public static int getYear( String time) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time );
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 取月 mm
	 *
	 * @return int
	 */
	public static int getMonth(  String time) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time );
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * 取日 dd
	 *
	 * @return int
	 */
	public static int getDay( String time) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time );
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 取小时 hh
	 *
	 * @return int
	 */
	public static int getHour(  String time) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time );
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 取分钟 mm
	 *
	 * @return int
	 */
	public static int getMinute(  String time) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time );
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 取秒钟 ss
	 *
	 * @return int
	 */
	public static int getSecond( String time) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time );
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}

	/**
	 * 判断给定的时间是否在时间区间内，忽略日期部分
	 * @param startTime
	 * @param endTime
	 * @param inputTime
	 * @return
	 */
	public static boolean isTimeInDuration(Date startTime, Date endTime, Date inputTime) {
		// 先构造Calendar实例
		Calendar start = Calendar.getInstance();
		start.setTime(startTime);

		Calendar end = Calendar.getInstance();
		end.setTime(endTime);

		Calendar input = Calendar.getInstance();
		input.setTime(inputTime);

		// 把起始时间的年月日设置成和要比较的日期相同，只比较时间部分
		start.set(Calendar.YEAR, input.get(Calendar.YEAR));
		start.set(Calendar.MONTH, input.get(Calendar.MONTH));
		start.set(Calendar.DATE, input.get(Calendar.DATE));

		end.set(Calendar.YEAR, input.get(Calendar.YEAR));
		end.set(Calendar.MONTH, input.get(Calendar.MONTH));
		end.set(Calendar.DATE, input.get(Calendar.DATE));

		return input.after(start) && input.before(end);
	}
}
