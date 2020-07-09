package com.date;

import java.util.UUID;

public class UUIDUtil {

    //获取uuid
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
