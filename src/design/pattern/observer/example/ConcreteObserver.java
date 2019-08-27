package design.pattern.observer.example;

/**
 * @author zhangke
 * @version 1.0
 * @className ConcreteObserver
 * @description 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * @date 2019/8/17 8:02 PM
 **/
public class ConcreteObserver implements Observer {

	//观察者的名字，是谁收到了这个消息，是谁
	private String observerName;

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

	//天气的内容情况
	private String weatherContent;
	//提醒的对象
	private String remindThing;

	/**
	 * 获取目标类的状态同步到观察者的状态中
	 *
	 * @param subject
	 */
	@Override
	public void update(WeatherSubject subject) {
		weatherContent=((ConcreteWeatherSubject)subject).getWeatherContent();
System.out.println(observerName+"收到了"+weatherContent+remindThing);

	}
}