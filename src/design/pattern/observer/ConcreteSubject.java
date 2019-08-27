package design.pattern.observer;

/**
 * @author zhangke
 * @version 1.0
 * @className ConcreteWeatherSubject
 * @description 具体的目标对象，负责把有关状态存入到相对应的观察者对象中
 * @date 2019/8/17 8:02 PM
 **/
public class ConcreteSubject  extends Subject{
	//目标对象的状态
	private  String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObserver();
	}
}