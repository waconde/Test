package ProducerConsumerProblem.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * @author zhangke
 * @version 1.0
 * @className Producer
 * @description TODO 生产者的形式
 * @date 2019/2/18 下午4:02
 **/
public class Producer implements Runnable {

    private BlockingQueue<String> blockingQueue;

    public Producer() {
    }

    public Producer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        try {
            String temp = "生产线程" + Thread.currentThread().getName();
            blockingQueue.put(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
