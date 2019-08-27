package design.pattern.observer;
/**
 * @author zhangke
 * @description //观察者接口，定义一个更新的接口给那些在
 * 目标发生改变的时候被通知的对象
 * @date  2019/8/17
 * @return
 **/

public interface Observer {
	/**
	 * 更新的接口
	 * @param subject 传入的目标对象，方便获取目标对象
	 */

	public void update(Subject subject);
}
