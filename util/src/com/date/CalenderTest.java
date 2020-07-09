package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author xp
 * @create 2020-05-21 11:50
 */

// 获取从今天(包括今天)开始往前的一个月
public class CalenderTest {

    public static void main(String[] args) {
        Calendar   cal=Calendar.getInstance();
        int year  = cal.get(Calendar.YEAR);
        int moths=cal.get(Calendar.MONTH);
        int day =cal.get(Calendar.DAY_OF_MONTH);
        for(int k=30;k>0;k--)
        {
            String Cudate=  getCurrentDate(year,moths,day,k-1);
            System.out.println(Cudate);
        }
    }


    public static String getCurrentDate(int year, int month, int day, int beDay) {
        GregorianCalendar newCal = new GregorianCalendar(year, month, day);
        long milSec = newCal.getTimeInMillis() - beDay * 24 * 3600 * 1000;
        GregorianCalendar other = new GregorianCalendar();
        other.setTimeInMillis(milSec);
        String newYear = String.valueOf(other.get(GregorianCalendar.YEAR));
        String newMonth = String.valueOf(other.get(GregorianCalendar.MONTH) + 1);
        newMonth = newMonth.length() == 1 ? "0" + newMonth : newMonth;
        String newDay = String.valueOf(other.get(GregorianCalendar.DAY_OF_MONTH));
        newDay = newDay.length() == 1 ? "0" + newDay : newDay;
        String date = newYear + "-" + newMonth + "-" + newDay;
        return date;
    }

}
