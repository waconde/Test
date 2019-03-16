package ProducerConsumerProblem.Runnable;

/**
 * @author zhangke
 * @version 1.0
 * @className Consumer
 * @description TODO
 * @date 2019/2/18 下午4:14
 **/
public class Consumer implements Runnable {
    //定义仓库
    Repertory repertory=null;
    //构造方法初始化repertory(仓库)
    public Consumer(Repertory repertory) {
        this.repertory=repertory;
    }
    //实现run()方法,并将当前的线程名称传入.
    @Override
    public  void run() {
        while(true){
            repertory.pop(Thread.currentThread().getName());
        }
    }

}