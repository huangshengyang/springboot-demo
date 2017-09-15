package com.alimy.sbmb.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

public class Utils {
    
    public static synchronized String getIdStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String timeStr = sdf.format(new Date());
        String str =  RandomStringUtils.randomAlphanumeric(2);
        return timeStr + str;
    }
    
}
