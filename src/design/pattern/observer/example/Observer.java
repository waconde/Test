package design.pattern.observer.example;

/**
 * @author zhangke
 * @description //观察者接口，定义一个更新的接口给那些在
 * 目标发生改变的时候被通知的对象
 * @date  2019/8/17
 * @return
 **/

public interface  Observer {
	/**
	 * 更新的接口
	 * @param subject 传入的目标对象，方便获取目标对象，也可以传递按需定制的内容
	 */

	public void update(WeatherSubject subject);
}
