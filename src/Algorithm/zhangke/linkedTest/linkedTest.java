package Algorithm.zhangke.linkedTest;

/**
 * @author zhangke
 * @version 1.0
 * @className linkedTest
 * @description TODO
 * @date 2019/2/14 下午2:57
 **/
public class linkedTest {
    public static  void main(String [] args){
        //1、遍历链表-----------------------------------------------------------------
        SingleLinkedList list= new SingleLinkedList();//新建对象
        //向LinkList中添加数据
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("1、链表的遍历打印");
        list.print(list.firstNode);// 从firstNode节点开始遍历输出
        //------------------------------------------------------------------
        int length=list.getLength(list.firstNode);
        System.out.println("");
        System.out.println("2、链表的长度"+length);//链表的长度
        int index1=list.findLastNode1(2);
        System.out.println("查找单链表中的倒数第2个结点（方法1）："+index1);
        Node node=list.findLastNode2(list.firstNode,2);
        System.out.println("查找单链表中的倒数第2个结点（方法2）："+node.data);
        //链表合并------------------------------------------------------------------
        SingleLinkedList list1 = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();
        //向LinkList中添加数据
        for (int i = 0; i < 4; i++) {
            list1.add(i);
        }
        System.out.println("list1为");
        list1.print(list1.firstNode);
        for (int i = 3; i < 8; i++) {
            list2.add(i);
        }
        System.out.println("");
        System.out.println("链表的联合");
        System.out.println("list2为");
        list2.print(list2.firstNode);
        SingleLinkedList list3 = new SingleLinkedList();
        //将list1和list2合并，存放到list3中
        list3.firstNode = list3.mergeLinkList(list1.firstNode, list2.firstNode);
        System.out.println("");
        System.out.println("list1和list2合并为list3：");
        list3.print(list3.firstNode);
        //------------------------------------------------------------------
        //现在打印list1会出问题，合并过程导致的
        System.out.println("");
        System.out.println("合并过程导致的list1出错，list1为");
        list1.print(list1.firstNode);
        System.out.println("");
        //------------------------------------------------------------------
        System.out.println("反转前的链表list1为");
        list1.print(list1.firstNode);
        System.out.println("");
        SingleLinkedList reverselist1=new SingleLinkedList();
        reverselist1.firstNode=list1.reverseList(list1.firstNode);
        System.out.println("反转后的链表list1为");
        reverselist1.print(reverselist1.firstNode);
        //------------------------------------------------------------------
        System.out.println("");
        SingleLinkedList list5 = new SingleLinkedList();
        for (int i = 0; i < 10; i++) {
            list5.add(i);
        }
        System.out.println("list5链表反转前");
        list5.print(list5.firstNode);
        System.out.println("");
        System.out.println("list5链表反转后：");
        list5.reversePrint(list5.firstNode);
        //------------------------------------------------------------------
        SingleLinkedList list6 = new SingleLinkedList();
        //向LinkList中添加数据
        for (int i = 0; i < 10; i++) {
            list6.add(i);
        }
        System.out.println("");
        System.out.println("list6删除前");
        list6.print(list6.firstNode);
        boolean bo=list6.deleteNode(list6.firstNode,3);
        boolean bo1=list6.deleteNode1(list6.firstNode,7);
        System.out.println(bo);
        System.out.println("删除后");
        list6.print(list6.firstNode);
        //------------------------------------------------------------------
        System.out.println("");
        System.out.println("对列表进行排序");
        SingleLinkedList list7 = new SingleLinkedList();
        //向LinkList中添加数据
        for (int i = 1; i < 7; i++) {
            list7.add(i);
        }
        for (int i = 3; i < 5; i++) {
            list7.add(i);
        }
        list7.add(0);
        System.out.println("排序前");
        list7.print(list7.firstNode);
        System.out.println("");
        System.out.println("排序后");
        Node newhead=list7.orderList(list7.firstNode);
        list7.print(list7.firstNode);
        //------------------------------------------------------------------
        System.out.println("");
        System.out.println("删除重复的节点");
        SingleLinkedList list8= new SingleLinkedList();
        //向LinkList中添加数据
        for (int i = 1; i < 7; i++) {
            list8.add(i);
        }
        for (int i = 3; i < 5; i++) {
            list8.add(i);
        }
        list8.add(0);
        System.out.println("删除前");
        list8.print(list8.firstNode);
        System.out.println(" ");
        System.out.println("删除后");
        list8.deleteDuplecate(list8.firstNode);
        list8.print(list8.firstNode);
        //------------------------------------------------------------------
        System.out.println(" ");
        System.out.println("插入节点节点");
        SingleLinkedList  list9= new SingleLinkedList();
        //向LinkList中添加数据
        for (int i = 0; i < 9; i++) {
            list9.add(i);
        }
        System.out.println("插入前");
        list9.print(list9.firstNode);
        System.out.println(" ");
        System.out.println("插入后");
        list9.insertNode(3);
        list9.print(list9.firstNode);
    }
}
