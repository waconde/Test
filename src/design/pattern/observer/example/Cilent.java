package design.pattern.observer.example;

/**
 * @author zhangke
 * @version 1.0
 * @className Cilent
 * @description
 * @date 2019/8/17 8:48 PM
 **/
public class Cilent {
	public static  void main(String [] args){
	    //1、创建一个目标
		ConcreteWeatherSubject weather= new ConcreteWeatherSubject();
		//2、创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("女朋友");
		observerGirl.setRemindThing("约会");

		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("老妈");
		observerMum.setRemindThing("购物");
		//3、注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);
		//4、目标发布天气
		weather.setWeatherContent("天气好，很晴朗");
	}
}