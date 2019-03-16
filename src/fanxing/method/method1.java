package fanxing.method;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangke
 * @version 1.0
 * @className method1
 * @description TODO 泛型方法
 * @date 2019/3/9 下午9:13
 **/
public class method1 {
    public  static Set union (Set s1,Set s2){
        Set result =new HashSet(s1);
        result.addAll(s2);
        return result;
    }
    //泛型方法
    public  static <E> Set<E> union2 (Set<E> s1,Set<E> s2){
        Set<E> result =new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }
    public static  void main(String [] args){
        //初始化对象为collection的实现类，list也是的。
        Set<String> result1 =new HashSet<String>(Arrays.asList("tom","didc","harry"));
        Set<String> result2 =new HashSet<String>(Arrays.asList("tom21","afaf","harry22"));
        Set<String> result =union2(result1,result2);
        for(String str: result){
            System.out.println(str);
        }

    }
}