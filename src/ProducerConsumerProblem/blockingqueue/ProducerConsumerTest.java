package ProducerConsumerProblem.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author zhangke
 * @version 1.0
 * @className ProducerConsumerTest
 * @description TODO
 * @date 2019/2/18 下午4:03
 **/
public class ProducerConsumerTest {

    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<String>(3);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        for(int i = 0; i < 5; i++){
            //生产者线程
            new Thread(producer).start();
            //消费者线程
            new Thread(consumer).start();
        }
    }
}
