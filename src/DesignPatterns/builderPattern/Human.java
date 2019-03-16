package DesignPatterns.builderPattern;

/**
 * @author zhangke
 * @version 1.0
 * @className Human
 * @description TODO Product（要创建的复杂对象）：
 * @date 2019/2/21 下午3:24
 **/
public class Human {
    private String head;

    @Override
    public String toString() {
        return "Human{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", hand='" + hand + '\'' +
                ", foot='" + foot + '\'' +
                '}';
    }

    private String body;
    private String hand;
    private String foot;
    public String getHead() {
        return head;
    }
    public void setHead(String head) {
        this.head = head;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getHand() {
        return hand;
    }
    public void setHand(String hand) {
        this.hand = hand;
    }
    public String getFoot() {
        return foot;
    }
    public void setFoot(String foot) {
        this.foot = foot;
    }
}
