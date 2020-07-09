package com.calendar;


public class CommonUtil {

    /**
     * url拼接
     * @param urlHead url头部
     * @param urlEnd  url尾部
     * @return
     */
    public static String concatUrl(String urlHead,String urlEnd){
        String tempUrl= urlHead + urlEnd;
        //替换windows反斜杠,以及重复斜杠
       return  tempUrl.replaceAll("\\\\","/").replaceAll("novasky//","novasky/");
    }

    public static void main(String[] args){
        System.out.print(concatUrl("http://192/168.1","\\f\\1.png"));
    }
}
