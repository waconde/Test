package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangke
 * @description //目标对象，它知道观察者它的观察者，并提供注册
 * (添加)和删除观察者的接口
 * @date  2019/8/17
 * @return
 **/

public class Subject {


	private List<Observer> observers =new ArrayList<>();


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
