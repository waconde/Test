package design.pattern.builder;

/**
 * @author zhangke
 * @version 1.0
 * @className SmartManBuilder
 * @description TODO 先造一个高智商的人
 * ConcreteBuilder（实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。
 * 在建造过程完成后，提供产品的实例）：
 * @date 2019/2/21 下午3:26
 **/
public class SmartManBuilder implements IBuildHuman {

    Human human;

    public SmartManBuilder(){
        human = new Human();
    }


    @Override
    public void buildHead() {
        human.setHead("聪明人：智商180的头脑");
    }

    @Override
    public void buildBody() {
        human.setBody("聪明人：新的身体");

    }

    @Override
    public void buildHand() {
        human.setHand("聪明人：新的手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("聪明人：新的脚");

    }

    @Override
    public Human createHuman() {
        return human;
    }

}
