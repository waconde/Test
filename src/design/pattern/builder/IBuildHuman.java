package design.pattern.builder;

/**
 * @author zhangke
 * @version 1.0
 * @className IBuildHuman
 * @description TODO 造人的标准
 * Builder（给出一个抽象接口，以规范产品对象的各个组成成分的建造。
 * 这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建）：
 * @date 2019/2/21 下午3:25
 **/
public interface IBuildHuman {
    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();
    public Human createHuman();
}
