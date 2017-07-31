package com.xiaoyb.thread.producerconsumer2;

/**
 * 生产者线程
 * 
 * @author XIAO
 *
 */
public class ProducerThread implements Runnable {

	private ChocolateBox box;

	public ProducerThread(ChocolateBox box) {
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
			box.putChocolate();// 生产公共资源
		}
	}

}
