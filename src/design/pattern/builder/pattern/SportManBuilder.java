package design.pattern.builder.pattern;

/**
 * @author zhangke
 * @version 1.0
 * @className SmartManBuilder
 * @description TODO 先造一个高智商的人
 * @date 2019/2/21 下午3:26
 **/
public class SportManBuilder implements IBuildHuman {

    Human human;

    public SportManBuilder(){
        human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("运动员：的头脑");
    }

    @Override
    public void buildBody() {
        human.setBody("运动员：新的身体");

    }

    @Override
    public void buildHand() {
        human.setHand("运动员：新的手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("运动员：新的脚");

    }

    @Override
    public Human createHuman() {
        return human;
    }

}
