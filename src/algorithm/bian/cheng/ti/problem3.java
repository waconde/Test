package algorithm.bian.cheng.ti;

/**
 * @author zhangke
 * @version 1.0
 * @className problem3
 * @description TODO
 * 功能：（丢手帕问题）设编号为1,2，...n的n个人围坐一圈，约定编号为k（1<=k<+n）的人从一开始报数，数到m
 * 的那个人出列，它对的下一位又开始从1报数，数到m的哪一个人又出列，依次类推，知道所有的人
 * 全部出列为止，由此产生一个出队编号的序列
 * @date 2019/2/25 下午5:28
 **/
public class problem3 {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        CycLink cycLink = new CycLink();
        cycLink.setLen(5);
        cycLink.createLink();
        cycLink.setK(2);
        cycLink.setM(2);
        cycLink.show();
        cycLink.play();
    }
}

/**
 * 类是自身成员的时候，通常不能初始化，
 * 而仅仅是一个定义，在满足某些条件的时候，才去初始化
 */
class Child {
    //编号
    int no;
    //定义一个成员变量的引用类型指向下一个节点
    Child nextChild = null;
    public Child(int no) {
        //给出一个编号
        this.no = no;
    }
}

/**
 * 环形链表
 */
class CycLink {

    /**
     * 指向第一个小孩的引用不能动
     */
    Child firstChild = null;

    /**
     * 链表的长度，表示共有几个小孩
     */
    Child temp = null;

    /**
     * 链表的长度，表示共有几个小孩
     */
    int len = 0;

    /**
     * 设置从第几个人开始数数
     */
    int k = 0;

    /**
     * 数到 mge 人出列
     */
    int m = 0;

    public void setLen(int len) {
        this.len = len;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setM(int m) {
        this.m = m;
    }

    //开始play
    public void play() {
        Child temp = this.firstChild;
        //1、先找到开始数数的人，自己本身数一下
        for (int i = 1; i < k; i++){
            temp = temp.nextChild;
        }
        while (this.len != 1) {
            //2、数m下
            for (int i = 1; i < m; i++) {
                temp = temp.nextChild;
            }
            //找到要出圈的前一个小孩
            Child temp2 = temp;
            while (temp2.nextChild != temp) {
                temp2 = temp2.nextChild;
            }
            //3将数到m的小孩退出圈
            temp2.nextChild = temp.nextChild;
            System.out.println("当前出圈：" + temp.no);
            //让temp指向下一个要数数的小孩
            temp = temp.nextChild;
            this.len--;
        }
        //最后一个小孩
        System.out.println("最后出圈：" + temp.no);
    }

    /**
     * 初始化环形链表
     */
    public void createLink() {
        for (int i = 1; i <= len; i++) {
            if (i == 1) {
                //创建第一个小孩
                Child ch = new Child(i);
                //定义本身说第一个小孩的成员变量的引用为空
                this.firstChild = ch;
                this.temp = ch;
            } else {
                if (i == len) {
                    //创建最后一个小孩
                    Child ch = new Child(i);
                    //temp.nextChild是CycLink的Child类型的成员变量
                    temp.nextChild = ch;
                    //temp是是CycLink的Child类型的成员变量
                    temp = ch;
                    //如果为链表的最后一个节点，则其nextChild指向头结点
                    temp.nextChild = this.firstChild;
                } else {
                    //继续创建小孩
                    Child ch = new Child(i);
                    //temp.nextChild为第一个小孩的nextChil指向第二个小孩
                    temp.nextChild = ch;
                    //temp是CycLink的Child类型的成员变量
                    temp = ch;
                }

            }
        }
    }

    /**
     * 打印该环形链表
     */
    public void show() {
        //定义一个跑龙套
        Child temp = this.firstChild;
        do {
            System.out.print(temp.no + " ");
            //temp往下面走一个
            temp = temp.nextChild;
        } while (temp != this.firstChild);
    }
}