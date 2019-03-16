package DesignPatterns.builderPattern;

/**
 * @author zhangke
 * @version 1.0
 * @className Director
 * @description TODO 造人的动作
 * Director（调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，
 * 只负责保证对象各部分完整创建或按某种顺序创建）：
 * @date 2019/2/21 下午3:28
 **/
public class Director {
    /**
     * createHumanByDirecotr的参数是我们的造人标准的接口,
     * 只要是实现了我们的这个接口的类，就都可以作为参数，
     * @param bh
     * @return
     */
    public Human createHumanByDirecotr(IBuildHuman bh){
        bh.buildBody();
        bh.buildFoot();
        bh.buildHand();
        bh.buildHead();
        return bh.createHuman();
    }
}
