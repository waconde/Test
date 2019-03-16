package Algorithm.zhangke.linkedTest;

/**
 * @author zhangke
 * @version 1.0
 * @className Node
 * @description TODO
 * @date 2019/2/14 下午2:52
 **/
public class Node {
    //注：此处的两个成员变量权限不能为private，因为private的权限是仅对本类访问。
    int data; //数据域
    Node next;//指针域
    public Node(int data) {
        this.data = data;
    }
}
