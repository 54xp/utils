package com.test;


/**
 * @author xp
 * @create 2020-05-11 8:51
 * 判断数组为空
 */

public class Test {
    public static void main(String[] args) {
        String[] str = {};
        if(!(str == null || str.length == 0)){
            System.out.println("\"数组为空\" = " + "数组为空");
        }
    }
}
