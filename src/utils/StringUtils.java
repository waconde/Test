package utils;

import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhangke
 * @version 1.0
 * @className UnCommonStringUtils
 * @description TODO String工具类 常用的方法
 * @date 2019/1/17 下午2:20
 **/
public class StringUtils
{

    /**
     * 空字符串.
     */
    public static final String EMPTY_STRING = "";

    /**
     * TODO 去除字符串中的html标签.
     * <pre>
     * UnCommonStringUtils.replaceHtml(null)  = ""
     * UnCommonStringUtils.replaceHtml("")    = ""
     * UnCommonStringUtils.replaceHtml("<td>content</td>") = "content"
     * UnCommonStringUtils.replaceHtml("<>content</td>") = ""
     * </pre>
     * @param html 待处理的字符串，可以为 null
     * @return String 处理过的字符串，若输入为null则返回 null
     * @since 1.0
     */
    public static String replaceHtml(String html)
    {
        if (org.apache.commons.lang3.StringUtils.isBlank(html))
        {
            return UnCommonStringUtils.EMPTY_STRING;
        }
        String regEx = "<.+?>";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(html);
        String s = m.replaceAll(UnCommonStringUtils.EMPTY_STRING);
        return s;
    }

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


    /**
     * TODO 字符串转换为 Integer 数组.
     * UnCommonStringUtils.toIntegerArray(null, ",")     == []
     * UnCommonStringUtils.toIntegerArray("", ",")       == []
     * UnCommonStringUtils.toIntegerArray("  ", ",")     == []
     * UnCommonStringUtils.toIntegerArray("2,3,4", ",")  == [2,3,4]
     * @param val 字符串
     * @param regex 分隔符
     * @return Integer[] Integer数组
     * @exception NumberFormatException
     * @since 1.0
     */
    public static Integer[] toIntegerArray(String val, String regex) throws NumberFormatException
    {
        if (isBlank(val))
        {
            return new Integer[0];
        }
        else
        {
            String[] valArr = val.split(regex);
            int arrLen = valArr.length;
            Integer[] it = new Integer[arrLen];
            for (int i = 0; i < arrLen; i++)
            {
                it[i] = Integer.parseInt(valArr[i].trim());
            }
            return it;
        }
    }

    /**
     * TODO 数组转成字符串，可在打印日志的时候用.
     * @param args 内容数组
     * @return 转换结果（不同的数据项用半角逗号隔开）
     */
    public static String argsToString(Object[] args)
    {
        StringBuilder s = new StringBuilder("args:[");
        for (Object o : args)
        {
            s.append(o).append(",");
        }
        s.append("]");

        return s.toString();
    }

    /**
     * TODO 将每一个元素都为字符串的 list 转换为以逗号分割的字符串.
     * @param list 待处理的 list
     * @return String 处理过的以逗号分隔的字符串
     * @since 1.0
     */
    public static String argsToString(List<String> list)
    {
        StringBuilder s = new StringBuilder();
        if (list == null || list.size() == 0)
        {
            return UnCommonStringUtils.EMPTY_STRING;
        }
        else
        {
            s.append(list.get(0));
            for (int i = 1; i < list.size(); i++)
            {
                s.append(",").append(list.get(i));
            }
            return s.toString();
        }
    }

    /**
     * TODO 判断字符串数组是否有字符串为空或者空字符串.
     * UnCommonStringUtils.isNullOrEmpty(null)             = true
     * UnCommonStringUtils.isNullOrEmpty(null, "foo")      = true
     * UnCommonStringUtils.isNullOrEmpty("", "bar")        = true
     * UnCommonStringUtils.isNullOrEmpty("bob", "")        = true
     * UnCommonStringUtils.isNullOrEmpty("  bob  ", null)  = true
     * UnCommonStringUtils.isNullOrEmpty(" ", "bar")       = false
     * UnCommonStringUtils.isNullOrEmpty("foo", "bar")     = false
     * @param str 需要验证的字符串
     * @return Boolean 若字符串数组中包含空或者空字符串，则返回true
     * @since 1.0
     */
    public static Boolean isNullOrEmpty(String... str)
    {
        if (ArrayUtils.isEmpty(str))
        {
            return true;
        }
        else
        {
            for (String s : str)
            {
                if (s == null || s.isEmpty())
                {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * TODO 判断字符串是否非空、非空字符串或者不仅仅由空白字符组成.
     * UnCommonStringUtils.isNotBlank(null)      = false
     * UnCommonStringUtils.isNotBlank("")        = false
     * UnCommonStringUtils.isNotBlank(" ")       = false
     * UnCommonStringUtils.isNotBlank("bob")     = true
     * UnCommonStringUtils.isNotBlank("  bob  ") = true
     * @param str 需要验证的字符串，可以为null
     * @return boolean 若非空、非空字符串或者不仅仅由空白字符组成，则返回true
     * @since 1.0
     */
    public static boolean isNotBlank(String str)
    {
        return org.apache.commons.lang3.StringUtils.isNotBlank(str);
    }

    /**
     * TODO 判断字符串是否为非空或者非空字符串.
     * UnCommonStringUtils.isNotEmpty(null)      = false
     * UnCommonStringUtils.isNotEmpty("")        = false
     * UnCommonStringUtils.isNotEmpty(" ")       = true
     * UnCommonStringUtils.isNotEmpty("bob")     = true
     * UnCommonStringUtils.isNotEmpty("  bob  ") = true
     * </pre>
     *
     * @param str 需要验证的字符串，可以为null
     * @return boolean 若非空或者非空字符串，则返回true
     * @since 1.0
     */
    public static boolean isNotEmpty(String str)
    {
        return org.apache.commons.lang3.StringUtils.isNotEmpty(str);
    }


    /**
     * TODO 判断字符串是否为空或者空字符串.
     * UnCommonStringUtils.isEmpty(null)      = true
     * UnCommonStringUtils.isEmpty("")        = true
     * UnCommonStringUtils.isEmpty(" ")       = false
     * UnCommonStringUtils.isEmpty("bob")     = false
     * UnCommonStringUtils.isEmpty("  bob  ") = false
     * @param str 需要验证的字符串
     * @return boolean 若字符串为空或者空字符串，返回true
     * @since 1.0
     */
    public static boolean isEmpty(String str)
    {
        return org.apache.commons.lang3.StringUtils.isEmpty(str);
    }

    /**
     *
     * TODO 判断字符串是否为空、空字符串或者仅由空白字符组成.
     * UnCommonStringUtils.isBlank(null)      = true
     * UnCommonStringUtils.isBlank("")        = true
     * UnCommonStringUtils.isBlank(" ")       = true
     * UnCommonStringUtils.isBlank("bob")     = false
     * UnCommonStringUtils.isBlank("  bob  ") = false
     * @param str 需要验证的字符串，可以为null
     * @return boolean 若为空、空字符串或者仅由空白字符组成，则返回true
     * @since 1.0
     */
    public static boolean isBlank(String str)
    {
        return org.apache.commons.lang3.StringUtils.isBlank(str);
    }

    /**
     * TODO 移除字符串开头和结尾的空白字符包括空格、制表符等.
     * UnCommonStringUtils.trim(null)          = null
     * UnCommonStringUtils.trim("")            = ""
     * UnCommonStringUtils.trim("     ")       = ""
     * UnCommonStringUtils.trim("abc")         = "abc"
     * UnCommonStringUtils.trim("    abc    ") = "abc"
     * @param str 需要处理的字符串，可以为空
     * @return String 处理过的字符串，若输入的字符串为空，则返回null
     * @since 1.0
     */
    public static String trim(String str)
    {
        return org.apache.commons.lang3.StringUtils.trim(str);
    }

    /**
     * TODO 比较两个字符串是否相等.
     * <pre>
     * UnCommonStringUtils.equals(null, null)   = true
     * UnCommonStringUtils.equals(null, "abc")  = false
     * UnCommonStringUtils.equals("abc", null)  = false
     * UnCommonStringUtils.equals("abc", "abc") = true
     * UnCommonStringUtils.equals("abc", "ABC") = false
     * </pre>
     * @param str1 第一个字符串
     * @param str2 第二个字符串
     * @return boolean 若两个字符串相等则返回true
     * @since 1.0
     */
    public static boolean equals(String str1, String str2)
    {
        return org.apache.commons.lang3.StringUtils.equals(str1, str2);
    }

    /**
     * TODO  忽略大小写,比较两个字符串是否相等,若相等则返回true,反之则返回false.
     * <pre>
     * UnCommonStringUtils.equalsIgnoreCase(null, null)   = true
     * UnCommonStringUtils.equalsIgnoreCase(null, "abc")  = false
     * UnCommonStringUtils.equalsIgnoreCase("abc", null)  = false
     * UnCommonStringUtils.equalsIgnoreCase("abc", "abc") = true
     * UnCommonStringUtils.equalsIgnoreCase("abc", "ABC") = true
     * </pre>
     * @param str1 第一个字符串
     * @param str2 第二个字符串
     * @return boolean 忽略大小写，若两个字符串相等，则返回ture
     * @since 1.0
     */
    public static boolean equalsIgnoreCase(String str1, String str2)
    {
        return org.apache.commons.lang3.StringUtils.equalsIgnoreCase(str1, str2);
    }

    /**
     * TODO 将字符串转化为大写.
     * <pre>
     * UnCommonStringUtils.upperCase(null)  = null
     * UnCommonStringUtils.upperCase("")    = ""
     * UnCommonStringUtils.upperCase("aBc") = "ABC"
     * </pre>
     * @param str 需要转化的字符串
     * @return String 转化后的字符串，若输入null则返回null
     * @since 1.0
     */
    public static String upperCase(String str)
    {
        return org.apache.commons.lang3.StringUtils.upperCase(str);
    }

    /**
     * TODO  将字符串转化为小写.
     *
     * <pre>
     * UnCommonStringUtils.lowerCase(null)  = null
     * UnCommonStringUtils.lowerCase("")    = ""
     * UnCommonStringUtils.lowerCase("aBc") = "abc"
     * </pre>
     *
     * @param str 需要转化的字符串
     * @return String 转化后的字符串，若输入null则返回null
     * @since 1.0
     */
    public static String lowerCase(String str)
    {
        return org.apache.commons.lang3.StringUtils.lowerCase(str);
    }

    /**
     * TODO  htmlEscape(html转义)
     *
     * @param content 待转义字符串
     * @return String 转义后字符串
     * @since 1.0
     */
    public static String htmlEscape(String content)
    {
        if (isNullOrEmpty(content))
        {
            return EMPTY_STRING;
        }
        String html = content;
        html = html.replaceAll("&amp;", "&");
        // "
        html = html.replace("&quot;", "\"");
        // 替换跳格
        html = html.replace("&nbsp;&nbsp;", "\t");
        // 替换空格
        html = html.replace("&nbsp;", " ");
        html = html.replace("&lt;", "<");
        html = html.replaceAll("&gt;", ">");
        return html;
    }
}
