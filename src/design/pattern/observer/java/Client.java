package design.pattern.observer.java;

/**
 * @author zhangke
 * @version 1.0
 * @className Client
 * @description
 * @date 2019/8/17 10:54 PM
 **/
public class Client {
	public static  void main(String [] args){
		//1、创建一个目标
		ConcreteWeatherSubject subject= new ConcreteWeatherSubject();
		//2、创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("女朋友");


		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("老妈");

	    subject.addObserver(observerGirl);
		subject.addObserver(observerMum);
		subject.setWeatherContent("天气晴，很好");
	}
}