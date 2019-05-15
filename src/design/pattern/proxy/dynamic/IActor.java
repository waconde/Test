package design.pattern.proxy.dynamic;

/**
 * @author zhangke
 * @version 1.0
 * @className IActor
 * @description TODO jdk实现动态代理(基于接口的动态代理)
 * @date 2019/2/19 下午8:28
 **/
public interface IActor {
    public void perform(int money,String name);
    public void dangerPerform(int money);
}
