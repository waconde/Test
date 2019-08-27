package design.pattern.template;
/**
 * @author zhangke
 * @description  测试类
 * @date  2019/8/19
 * @return 
 **/

public class Test {

	public static void main(String[] args) {

		System.out.println("制备咖啡...");
		RefreshBeverage b1 = new Coffee();
		b1.prepareBeverageTemplate();
		System.out.println("咖啡好了！");

		System.out.println("\n******************************************");

		System.out.println("制备茶...");
		RefreshBeverage b2 = new Tea();
		b2.prepareBeverageTemplate();
		System.out.println("茶好了！");

	}

}
