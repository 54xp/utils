package com.date;

import com.novasky.common.utils.StringUtils;

/**
 * @Author ilongsay
 * @Date: Create in 2019/9/23 15:40
 * @Description: don't bb,show you code
 */
public class UnderlineToCamel {
    private static final String UNDERLINE = "_";
    /**
     * 将下划线的字符串转换为驼峰命名
     * @param line 需要转换的参数
     *
     * @return java.lang.String
     * @date 2019/9/23 15:44
     * @author ilongsay
     */
    public static String underline2Camel(String line) {
        String str = "";

        if(StringUtils.isBlank(line)){
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            String [] strArr;
            // 不包含下划线，且第二个参数是空的
            if(!line.contains(UNDERLINE)){
                sb.append(line);
                str = sb.toString();
            } else if (line.contains(UNDERLINE)) {
                strArr = line.split("_");
                for (String s : strArr) {
                    sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
                }
                str = sb.toString();
            }
        }
        return str;
    }

    public static void main(String[] args) {
        UnderlineToCamel underlineToCamel = new UnderlineToCamel();
        String en_sc_cdc_cds = underlineToCamel.underline2Camel("IFPS");
        System.out.println(en_sc_cdc_cds);
    }
}
