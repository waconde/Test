package design.pattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangke
 * @version 1.0
 * @className ConcreteObserver
 * @description
 * @date 2019/8/17 10:45 PM
 **/
public class ConcreteObserver implements Observer {
	//观察者名称的变量
	private String observerName;

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	/**
	 * This method is called whenever the observed object is changed. An
	 * application calls an <tt>Observable</tt> object's
	 * <code>notifyObservers</code> method to have all the object's
	 * observers notified of the change.
	 *
	 * @param o   the observable object.
	 * @param arg an argument passed to the <code>notifyObservers</code>
	 */
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(observerName+"收到消息，目标是推送过来的"+arg);
		System.out.println(observerName+"收到消息，目标是拉过来的"+
				((ConcreteWeatherSubject)o).getWeatherContent() );
	}
}