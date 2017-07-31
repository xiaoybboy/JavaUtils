package com.xiaoyb.thread.producerconsumer2;

/**
 * 消费者线程
 * 
 * @author XIAO
 *
 */
public class ConsumerThread implements Runnable {

	private ChocolateBox box;

	public ConsumerThread(ChocolateBox box) {
		super();
		this.box = box;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			box.getChocolate();// 消费公共资源
		}
	}

}
