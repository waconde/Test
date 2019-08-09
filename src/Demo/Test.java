package Demo;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangke
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2019/8/8 10:11 PM
 **/
public class Test {
	public static  void main(String [] args){
		Node node1 = new Node("2019-08-02c 11;24:10", "1", "test1", "www.tkamc.cn", "A001", "1");
		Node node2= new Node("2019-08-02c 11;24:10", "1", "test1", "www.tkamc.cn", "A002", "1");
		Node node3 = new Node("2019-08-02c 11;24:11", "1", "test1", "www.tkamc.cn", "A003", "3");
		Node node4 = new Node("2019-08-02c 11;24:11", "1", "test1", "www.tkamc.cn", "A004", "4");
		Node node5 = new Node("2019-08-02c 11;24:12", "1", "test1", "www.tkamc.cn", "A005", "5");


		Node node6 = new Node("2019-08-02c 11;24:10", "1", "test1", "www.tkamc.cn");
		Node node7 = new Node("2019-08-02c 11;24:11", "1", "test1", "www.tkamc.cn");
		Node node8 = new Node("2019-08-02c 11;24:12", "1", "test1", "www.tkamc.cn");
		List<Node>  list1=new ArrayList<>();

		list1.add(node1);
		list1.add(node2);
		list1.add(node3);
		list1.add(node4);
		list1.add(node5);
		List<Node>  list2=new ArrayList<>();
		list2.add(node6);
		list2.add(node7);
		list2.add(node8);
		for (Node item2:list2) {
			ArrayList<buildList> arrayList = new ArrayList<>();
			for (Node item1:list1) {
				if(item2.getCreate_time().equals(item1.getCreate_time())){
					arrayList.add(new buildList(item1.getBuild_numbber(),item1.getBuild_id()));
				}
			}
			item2.setBuild_list(arrayList);
		}

		for (Node item3:list2) {
			System.out.println(item3.toString());

			for (buildList item4 :item3.getBuild_list()){
				System.out.println(item4.getBuild_id()+""+item4.getBuild_numbber());

			}

		}
	}
}