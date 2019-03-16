package utils;

import java.io.UnsupportedEncodingException;


/**
 * @author zhangke
 * @version 1.0
 * @className UnCommonStringUtils
 * @description TODO String工具类
 * @date 2019/1/17 下午2:20
 **/
public class UnCommonStringUtils {

    /**
     * 空字符串.
     */
    public static final String EMPTY_STRING = "";
    /**
     * TODO 缩进字符串（不区分中英文字符），在给定的 length 内取得字符串的缩进,当给定字符串的长度小于length则返回原字符串.
     *
     * <pre>
     * UnCommonStringUtils.abbr(null,1)  = ""
     * UnCommonStringUtils.abbr("",1)    = ""
     * UnCommonStringUtils.abbr("   ",1) = ""
     * UnCommonStringUtils.abbr("abc",5) = "ab..."
     * UnCommonStringUtils.abbr("abc",4) = "a..."
     * UnCommonStringUtils.abbr("ab",5)  = "ab"
     * </pre>
     *
     * @param str 目标字符串
     * @param length 截取长度，至少为4（包含...的长度）
     * @return 缩进以后的字符串
     */
    public static String abbr(String str, int length)
    {
        if (org.apache.commons.lang3.StringUtils.isBlank(str))
        {
            return UnCommonStringUtils.EMPTY_STRING;
        }
        try
        {
            StringBuilder sb = new StringBuilder();
            int currentLength = 0;
            for (char c : str.toCharArray())
            {
                currentLength += String.valueOf(c).getBytes("GBK").length;
                if (currentLength <= length - 3)
                {
                    sb.append(c);
                }
                else
                {
                    sb.append("...");
                    break;
                }
            }
            return sb.toString();
        }
        catch (UnsupportedEncodingException e) {
            System.out.println(e.getStackTrace());

        }
        return UnCommonStringUtils.EMPTY_STRING;
    }

}
