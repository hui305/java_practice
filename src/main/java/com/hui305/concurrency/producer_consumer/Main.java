package com.hui305.concurrency.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2023/12/9 20:31
 */
public class Main {

    public static void main(String[] args) {

        BlockingQueue<Product> productBlockingQueue = new ArrayBlockingQueue<>(10);
        /*
        PV操作处理同步
        生产者，消费者，需要S0，S1，S2，3个信号量
        S0用于互斥，缓冲区queue同一时间，只能有一个线程操作。
        P(S0)
        V(S0)
        S1:表示放入产品数；如果产品数为0，则消费者需要等待；
        S2:空闲的空间数，库存空间；如果空闲仓位为0，即产品放满了，生产者需要等待。
        S1：生产者生产产品，放入缓冲队列，V(S1)； 消费者:P(S1); 消费者等待非空；
        S2：生产者等待非满 P(S2)，才能继续放入产品。满了就不能放，阻塞。
        消费者V(S2)表示空闲的资源+1；
         */
    }
}
