package design.pattern.observer;

/**
 * @author zhangke
 * @version 1.0
 * @className ConcreteObserver
 * @description 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * @date 2019/8/17 8:02 PM
 **/
public class ConcreteObserver implements Observer {
	/**
	 * 观察者的状态
	 */
	private  String observerState;
	/**
	 * 获取目标类的状态同步到观察者的状态中
	 *
	 * @param subject
	 */
	@Override
	public void update(Subject subject) {
		observerState=((ConcreteSubject)subject).getSubjectState();

	}
}