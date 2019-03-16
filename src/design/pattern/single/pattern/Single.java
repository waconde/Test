package design.pattern.single.pattern;

/**
 * @author zhangke
 * @version 1.0
 * @className Single
 * @description TODO 自己写的
 * @date 2019/2/19 下午8:12
 **/
//饿汉式
public class Single {
    private Single(){};
    private static  Single single=null;

    public static Single getSingle() {
        if(single==null){
            single=new Single();
        }
        return single;
    }
}
//饿汉式 单锁机制
class Single2 {
    private Single2(){};
    private static  Single2 single2=null;

    public static synchronized Single2 getSingle() {
        if(single2==null){
            single2=new Single2();
        }
        return single2;
    }
}
//饿汉式，双锁的机制
class Single3 {
    private Single3(){};
    private static  Single3 single3=null;

    public static synchronized Single3 getSingle() {
        if(single3==null) {
            synchronized (Single3.class) {
                if (single3 == null) {
                    single3 = new Single3();
                }
            }
        }
        return single3;
    }
}
//静态内部类的机制
class Single4 {
    private Single4(){};

    private static class singleHolder {
        private final  static Single4 INSTANCE=new Single4();
    }
    public static final Single4 getSingle() {
        return singleHolder.INSTANCE;
    }

}