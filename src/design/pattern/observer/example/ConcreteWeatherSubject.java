package design.pattern.observer.example;

import design.pattern.observer.Subject;

/**
 * @author zhangke
 * @version 1.0
 * @className ConcreteWeatherSubject
 * @description 具体的目标对象，负责把有关状态存入到相对应的观察者对象中
 * @date 2019/8/17 8:02 PM
 **/
public class ConcreteWeatherSubject extends WeatherSubject{

	//目标对象的状态
	private  String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObserver();
	}
}