package design.pattern.observer.java;

import java.util.Observable;

/**
 * @author zhangke
 * @version 1.0
 * @className ConcreteWeatherSubject
 * @description
 * @date 2019/8/17 10:41 PM
 **/
public class ConcreteWeatherSubject extends Observable{

	//天气的情况
	private  String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//天气情况有了通知所有的观察者
		this.setChanged();
		//然后主动通知，推模型(带参数)，拉模型(无参)
		this.notifyObservers();
	}
}