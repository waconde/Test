package design.pattern.observer.example;

import design.pattern.observer.example.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangke
 * @description //目标对象，它知道观察者它的观察者，并提供注册
 * (添加)和删除观察者的接口
 * @date  2019/8/17
 * @return
 **/
//如果是因人而异的通知消息，需要设置为抽象类
public class WeatherSubject {


	private List<Observer> observers =new ArrayList<>();

//添加订阅天气的人
	public  void attach(Observer observer){
		observers.add(observer);
	}


	public  void detach (Observer observer){
		observers.remove(observer);

	}

	/**
	 * 通知所有注册的观察者对象
	 */
	protected  void notifyObserver(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

}
