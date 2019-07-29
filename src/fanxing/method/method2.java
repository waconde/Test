package fanxing.method;

import java.util.*;

/**
 * @author zhangke
 * @version 1.0
 * @className method1
 * @description TODO 泛型方法
 * @date 2019/3/9 下午9:13
 **/
public class method2 {

    public static void main(String[] args) {
        //通配符测试
        List<String> l1 = new ArrayList<>();
        l1.add("aa");
        l1.add("bb");
        l1.add("cc");
        printList(l1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(22);
        l2.add(33);
        printList(l2);

        //通配符上边界测试
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        System.out.println(sumOfList(list1));
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        System.out.println(sumOfList(list2));

        //通配符下边界测试
        List<Object> list3= new ArrayList<>();
        addNumbers(list3);
        System.out.println(list3);
        List<Number> list4 = new ArrayList<>();
        addNumbers(list4);
        System.out.println(list4);
        List<Double> list5 = new ArrayList<>();
        // addNumbers(list5); // 编译报错

    }
    /**
     * 泛型通配符
     *
     * @param list
     */
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    /**
     * 固定上边界的通配符的使用(<? extends E>,),E(Number)及其子类, 这里传入的可能是Integer, 也可能是Double
     * 特性：你可以将该对象当做一个只读对象;
     * @param list 基本类型的包装类型都继承了该抽象类Number
     * @return
     */
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            // 注意这里得到的n是其上边界类型的, 也就是Number, 需要将其转换为double.
            s += n.doubleValue();
        }
        return s;
    }

    /**
     * 固定下边界通配符的使用(<? super E>),而传入的list不管是什么, 都一定是Integer或其父类Object泛型的List
     * 特性：你可以将该对象当做一个只能写入的对象;
     * @param list
     */
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }


}