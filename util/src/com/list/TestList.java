package com.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xp
 * @create 2020-07-21 16:38
 */

public class TestList {
    public static void main(String[] args) {
        List list = new ArrayList();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println("list.contains(5) = " + list.contains(5));
        System.out.println("list.contains(11) = " + list.contains(11));
        System.out.println("list.contains(\"5\") = " + list.contains("5"));
    }
}
