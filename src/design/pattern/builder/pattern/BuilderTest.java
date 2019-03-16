package design.pattern.builder.pattern;

/**
 * @author zhangke
 * @version 1.0
 * @className BuilderTest
 * @description TODO 在最后的BuilderTest类中，我们其实根本就不会知道具体是怎么造人的，
 * 因为这个过程让director给代劳了。然后，我们的SmartManBuilder类中才是真正的造人方法。director其实只是执行了这个过程
 * @date 2019/2/21 下午3:29
 **/
public class BuilderTest {
    public static void main(String[] args){
        Director director = new Director();
        Human human1 = director.createHumanByDirecotr(new SmartManBuilder());
        System.out.println(human1.toString());
        Human human2 = director.createHumanByDirecotr(new SportManBuilder());
        System.out.println(human2.toString());
    }

}
