package com.hejia.api.utils;

/**
 * 混淆数据工具
 */
public class Encryption {

    private static boolean isNotBlank(String str) {
        return str != null && str.length() > 0;
    }

    /**
     * 混淆身份证
     */
    public static String obfuscated(String str, int prefix, int suffix) {
        if (isNotBlank(str) && prefix >= 0 && suffix >= 0 && str.length() > (prefix + suffix)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i < prefix || (str.length() - i) <= suffix) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append('*');
                }
            }
            str = sb.toString();
        }
        return str;
    }

    /**
     * 混淆姓名
     */
    public static String obfuscatedName(String str) {
        if (isNotBlank(str)) {
            if (str.length() == 2) {
                str = "*" + str.substring(1);
            } else if (str.length() > 2) {
                str = Encryption.obfuscated(str, 1, 1);
            }
        }
        return str;
    }
    /**
     * 混淆手机号
     */
    public static String obfuscatedMobile(String str) {
        if (isNotBlank(str)) {
            StringBuilder sb = new StringBuilder(str);
            if (sb.length() > 7) {
                sb = sb.replace(3, 7, "****");
            }
            str = sb.toString();
        }
        return str;
    }

}
