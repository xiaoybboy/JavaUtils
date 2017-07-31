package com.xiaoyb.thread.producerconsumer2;

public class ConsumerProducerTest {
	public static void main(String[] args) {
		ChocolateBox box = new ChocolateBox();// 临界区
		new Thread(new ProducerThread(box)).start();
		new Thread(new ConsumerThread(box)).start();
		new Thread(new ProducerThread(box)).start();
		new Thread(new ConsumerThread(box)).start();
		new Thread(new ProducerThread(box)).start();
		new Thread(new ConsumerThread(box)).start();
	}
}
