package Algorithm.zhangke.linkedTest;

import java.util.Stack;

/**
 * @author zhangke
 * @version 1.0
 * @className SingleLinkedList
 * @description TODO
 * @date 2019/2/14 下午2:56
 **/
public class SingleLinkedList {
    //链表的成员变量
    public Node firstNode;//每个链表都有一个头结点头结点
    public Node currentNode;//当前节点
    //1向链表中添加数据
    public void add(int data) {
        //判断链表为空的时候
        if (firstNode == null) {//如果头结点为空，说明这个链表还没有创建，那就把新的结点赋给头结点
            Node newNode=new Node(data);
            firstNode = newNode;
            currentNode = newNode;//将生成的节点个当前节点
        } else {
            //创建新的结点，放在当前节点的后面（把新的结点合链表进行关联）
            Node newNode=new Node(data);
            currentNode.next = newNode;//前一个节点的引用指向当前生成的节点
            //把链表的当前索引向后移动一位
            currentNode = currentNode.next; //此步操作完成之后，currentNode结点指向新添加的那个结点
        }
    }

    /**
     * 1、向链表中添加结点
     * @param node
     */
    public void addNode(Node node) {
        if (node == null) {
            return;
        }
        if (firstNode == null) {
            firstNode = node;
            currentNode = firstNode;
        } else {
            currentNode.next = node;
            currentNode = currentNode.next;
        }
    }

    /**
     *打印输出链表。
     * @param firstNode 方法的参数表示从节点node开始进行遍历（）
     */
    public void print(Node firstNode) {
        if (firstNode == null) {
            return;
        }
        currentNode = firstNode;
        while (currentNode != null) {
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;//把下一个节点个前一个当前节点
        }
    }

    /**
     * 获取单链表的长度(时间复杂度为O（n）)
     * @param firstNode
     * @return
     */
    public int getLength(Node firstNode) {
        if (firstNode == null) {
            return 0;
        }
        int length = 0;
        Node current = firstNode;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    /**
     *查找单链表中的倒数第k个结点：(返回类型的是节点的值)(时间复杂度为O（n）)
     *普通思路：先将整个链表从头到尾遍历一次，计算出链表的长度size，得到链表的长度之后，
     * 就好办了，直接输出第(size-k)个节点就可以了（注意链表为空，k为0，k为1，k大于链
     * 表中节点个数时的情况）。时间复杂度为O（n），
     * @param index
     * @return
     */
    public int findLastNode1(int index) { //index代表的是倒数第index的那个结点
        int length=0;
        if (firstNode == null) {//第一次遍历，得到链表的长度size
            return -1;
        }
        currentNode = firstNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        currentNode = firstNode; //第二次遍历输出倒数第index个结点的数据
        for (int i = 0; i < length - index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    /**
     *返回类型的是节点(时间复杂度为O（n）)
     * 这里需要声明两个指针：即两个结点型的变量first和second，首先让first和second都指向第一个结点，
     * 然后让second结点往后挪k-1个位置，此时first和second就间隔了k-1个位置，然后整体向后移动这两个节点，
     * 直到second节点走到最后一个结点的时候，此时first节点所指向的位置就是倒数第k个节点的位置。时间复杂度为O（n）
     * @param head
     * @param index
     * @return
     */
    public Node findLastNode2(Node head, int index) {
        if (firstNode == null) {
            return null;
        }
        Node first = head;
        Node second = head;
        //让second结点往后挪index个位置
        for (int i = 0; i < index-1; i++) {
            second = second.next;
            if (second == null) { //说明k的值已经大于链表的长度了
                //throw new NullPointerException("链表的长度小于" + k); //我们自己抛出异常，给用户以提示
                return null;
            }
        }
        //让first和second结点整体向后移动，直到second结点为Null
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        //当second结点为空的时候，此时first指向的结点就是我们要找的结点
        return first;
    }

    /**
     *查找链表的中间结点(时间复杂度为O（n）)
     * 当n为偶数时，得到的中间结点是第n/2+1个结点。
     //比如链表有6个节点时，得到的是第4个节点。
     /*查找单链表中的中间结点：同样，面试官不允许你算出链表的长度，该怎么做呢？
     思路：和上面的第2节一样，也是设置两个指针first和second，只不过这里是，两个指针同时向前走，
     second指针每次走两步，first指针每次走一步，直到second指针走到最后一个结点时，此时first
     指针所指的结点就是中间结点。注意链表为空，链表结点个数为1和2的情况。时间复杂度为O（n）。
     * @param firstNode
     * @return
     */
    public Node findMidNode(Node firstNode) {
        if (firstNode == null) {
            return null;
        }
        Node first = firstNode;
        Node second = firstNode;
        //每次移动时，让second结点移动两位，first结点移动一位
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        //直到second结点移动到null时，此时first指针指向的位置就是中间结点的位置
        return first;
    }

    /**
     * 合并两个有序的单链表，合并之后的链表依然有序：时间复杂度为O (max(len1,len2))
     * 例如：链表1：1->2->3->4;链表2：2->3->4->5合并后：1->2->2->3->3->4->4->5
     * 解题思路：挨着比较链表1和链表2。这个类似于归并排序。尤其要注意两个链表都为空、和其中
     * 一个为空的情况。只需要O (1) 的空间。
     * @param head1 两个参数代表的是两个链表的头结点
     * @param head2 两个参数代表的是两个链表的头结点
     * @return 返回的是新链表的头结点
     */
    public Node mergeLinkList(Node head1, Node head2) {
        if (head1 == null && head2 == null) { //如果两个链表都为空
            return null;
        }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node newFisrtNode; //新链表的头结点
        Node currentNode; //current结点指向新链表
        // 一开始，我们让current结点指向head1和head2中较小的数据，得到head结点
        if (head1.data < head2.data) {
            newFisrtNode = head1;
            currentNode = head1;
            head1 = head1.next;
        } else {
            newFisrtNode = head2;
            currentNode = head2;
            head2 = head2.next;
        }
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                currentNode.next = head1; //新链表中，current指针的下一个结点对应较小的那个数据
                currentNode = currentNode.next; //current指针下移
                head1 = head1.next;
            } else {
                currentNode.next = head2;
                currentNode = currentNode.next;
                head2 = head2.next;
            }
        }
        //合并剩余的元素
        if (head1 != null) { //说明链表2遍历完了，是空的
            currentNode.next = head1;
        }
        if (head2 != null) { //说明链表1遍历完了，是空的
            currentNode.next = head2;
        }
        return newFisrtNode;
    }

    /**
     * 单链表的反转；时间复杂度为O（n）
     * 例如链表：1->2->3->4反转之后：4->2->2->1思路：
     * 从头到尾遍历原链表，每遍历一个结点，将其摘下放在新链表的最前端。
     * 注意链表为空和只有一个结点的情况。
     * @param firstNode
     * @return
     */
    public Node reverseList(Node firstNode) {
        //如果链表为空或者只有一个节点，无需反转，直接返回原链表的头结点
        if (firstNode == null || firstNode.next == null) {
            return firstNode;
        }
        Node currentNode = firstNode;//当前链表的头结点给当前节点
        Node nextNode  = null; //定义当前结点的下一个结点
        Node reversefistNode = null; //反转后新链表的表头
        while (currentNode != null) {
            nextNode  = currentNode.next; //暂时保存住当前结点的下一个结点，因为下一次要用
            currentNode.next = reversefistNode; //将current的下一个结点指向新链表的头结点，新链表的最后一个节点的指引为空
            reversefistNode = currentNode;//把当前节点给新链表的头结点，反向移动
            currentNode = nextNode ; // 操作结束后，current节点后移
        }
        return reversefistNode;
    }

    /**
     * 从尾到头打印单链表；时间复杂度为O（n）
     * 对于这种颠倒顺序的问题，我们应该就会想到栈，后进先出。所以，这一题要么自己使用栈，
     * 要么让系统使用栈，也就是递归。注意链表为空的情况。
     * 注：不要想着先将单链表反转，然后遍历输出，这样会破坏链表的结构，不建议。
     * @param firstNode
     */
    public void reversePrint(Node firstNode) {
        if (firstNode == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>(); //新建一个栈
        Node current = firstNode;
        //将链表的所有结点压栈
        while (current != null) {
            stack.push(current); //将当前结点压栈
            current = current.next;
        }
        //将栈中的结点打印输出即可
        while (stack.size() > 0) {
            System.out.print(stack.pop().data+"->"); //出栈操作
        }
    }
    //9.2：（使用系统的栈：递归，代码优雅简洁）
    public void reversePrint1(Node fisetNode) {
        if (fisetNode == null) {
            return;
        }
        reversePrint1(fisetNode.next);
        System.out.println(fisetNode.data+"->");
    }

    /**
     * 判断单链表是否有环：
     * 这里也是用到两个指针，如果一个链表有环，那么用一个指针去遍历，是永远走不到头的。
     * 因此，我们用两个指针去遍历：first指针每次走一步，second指针每次走两步，如果
     first指针和second指针相遇，说明有环。
     * @param head
     * @return
     */
    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node first = head;
        Node second = head;
        while (second != null) {
            first = first.next; //first指针走一步
            second = second.next.next;// second指针走两步
            if (first == second) { //一旦两个指针相遇，说明链表是有环的
                return true;
            }
        }
        return false;
    }

    /**
     * 删除节点:根据节点的个数删除；
     * @param firstNode
     * @param index
     * @return
     */
    public boolean deleteNode(Node firstNode,int index) {
        Node temp=null;
        if (index < 1 ) {
            return false;
        }
        if (index == 1) {
            temp=firstNode.next;
            firstNode = temp;
            return true;
        }else{
            int i = 2;
            Node preNode = firstNode;
            Node curNode = preNode.next;//curNode是要删除节点的前一个节点
            while (curNode != null) {
                if (i == index) {
                    preNode.next = curNode.next;
                    return true;
                }
//curNode是要删除节点的前一个节给preNode
                preNode = curNode;
                curNode = curNode.next;//curNode往后移动。
                i++;
            }
            return false;
        }
    }

    /**
     * 删除节点:根据节点的值删除。
     * @param firstNode
     * @param index
     * @return
     */
    public boolean deleteNode1(Node firstNode,int index) {
        Node temp=null;
        if (index < 1 ) {
            return false;
        }
        if (index == 1) {
            temp=firstNode.next;
            firstNode = temp;
            return true;
        }else{
            int i = 2;
            Node preNode = firstNode;
            Node curNode = preNode.next;//curNode是要删除节点的前一个节点
            while (curNode != null) {
                if (curNode.data == index) {
                    preNode.next = curNode.next;
                    return true;
                }
                preNode = curNode;//curNode是要删除节点的前一个节给preNode
                curNode = curNode.next;//curNode往后移动。
            }
            return false;
        }
    }

    /**
     * 13对链表进行排序;有没有返回值都无所，链表的头结点已经变了。
     * @param firstNode
     * @return
     */
    public Node orderList(Node firstNode) {
        Node nextNode = null;//下一个节点
        int tmp = 0;
        Node curNode = firstNode;//当前第一个节点i=1
        while (curNode.next != null) {
            nextNode = curNode.next;//当前下一个节点j=2
            while (nextNode != null) {
                //如果当前节点大于下一个节点，数据交换
                if (curNode.data > nextNode.data) {
                    tmp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = tmp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return firstNode;
    }

    /**
     * 14删除链表重复的节点
     * @param firstNode
     */
    public void deleteDuplecate(Node firstNode) {
        Node curNode = firstNode;
        Node nextNode = null;//下一个节点
        while (curNode != null) {
            nextNode = curNode;
            while (nextNode.next != null) {
                //nextNode.next为相同的节点
                if (curNode.data == nextNode.next.data) {
                    //把删除前一个节点的下一个指向要删除的节点的下一个
                    nextNode.next = nextNode.next.next;
                } else {
                    nextNode = nextNode.next;
                }
            }
                curNode = curNode.next;
        }
    }

        /**
         * 15在链表中指定位置插入节点;
         * @param index
         */
        public void insertNode ( int index){
            if (index < 1 || index > getLength(firstNode)) {
                return;
            }
            //如果头结点为空，说明这个链表还没有创建，那就把新的结点赋给头结点
            if (index == 1) {
                Node newNode = new Node(index);
                Node temp = firstNode;
                firstNode = newNode;
                firstNode.next = temp;
            } else {
                currentNode = firstNode;
                int count = 1;//计数
                while (currentNode.next != null) {
                    count++;
                    if (count == index) {//nextNode.next为相同的节点
                        Node newNode = new Node(index);
                        //a(i-1)和a(i)之间插入
                        //a(i-1)=currentNode，a(i)=currentNode.next
                        Node temp = currentNode.next;//先存a(i-1)
                        currentNode.next = newNode;//a(i-1).next=new
                        newNode.next = temp;//new.next=a(i)
                    }
                    currentNode = currentNode.next;
                }
            }
    }
}