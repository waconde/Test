package fanxing.fangxingClass;

/**
 * @author zhangke
 * @version 1.0
 * @className Generic
 * @description TODO 泛型类,T的类型由外部指定,只能是类类型（包括自定义类），不能是简单类型
 * @date 2019/2/23 上午12:02
 **/
public class Generic<T>{
    /**
     * key这个成员变量的类型为T,
     */
    private T key;

    /**
     * 泛型构造方法形参key的类型也为T，T的类型由外部指定
     * @param key
     */
    public Generic(T key) {
        this.key = key;
    }

    /**
     * 泛型方法getKey的返回值类型为T，T的类型由外部指定
     * @return
     */
    public T getKey(){
        return key;
    }
}