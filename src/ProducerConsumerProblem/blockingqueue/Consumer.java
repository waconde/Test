package ProducerConsumerProblem.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * @author zhangke
 * @version 1.0
 * @className Consumer
 * @description TODO 消费者
 * @date 2019/2/18 下午4:02
 **/
public class Consumer implements Runnable {

    private BlockingQueue<String> blockingQueue;

    public Consumer() {
    }

    public Consumer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        try {
            // 取出阻塞队列中的消息
            String temp = blockingQueue.take();
            // 打印结果消息
            System.out.println("消费线程"+Thread.currentThread().getName()+" 消费 "+temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
