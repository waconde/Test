package fanxing.method;

import java.util.*;

/**
 * @author zhangke
 * @version 1.0
 * @className method1
 * @description TODO 泛型方法
 * @date 2019/3/9 下午9:13
 **/
public class method1 {
    public static void main(String[] args) {

        //初始化对象为collection的实现类，list也是的。
        Set<String> result1 = new HashSet<>(Arrays.asList("tom", "didc", "harry"));
        Set<String> result2 = new HashSet<>(Arrays.asList("tom21", "afaf", "harry22"));
        Set<Integer> result3 = new HashSet<>(Arrays.asList(new Integer(1), new Integer(2), new Integer(3)));
        Set<Integer> result4 = new HashSet<>(Arrays.asList(new Integer(4), new Integer(5), new Integer(6)));
        Set<String> result5= union(result1, result2);
        Set<Integer> result6 = union2(result3, result4);
        for (String str : result5) {
            System.out.println(str);
        }
        for (Integer str : result6) {
            System.out.println(str.intValue());
        }
    }

    /**
     * 非泛型方法
     * @param s1
     * @param s2
     * @return
     */
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    /**
     * //泛型方法，既能写又能读
     *
     * @param s1
     * @param s2
     * @param <E>
     * @return
     */
    public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }


}