package com.xiaoyb.thread.producerconsumer1;

/**
 * 消费者线程，负责消费资源
 * 
 * @author XIAO
 *
 */
public class ConsumerThread implements Runnable {

	private PublicResource resource;

	public ConsumerThread(PublicResource resource) {
		super();
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.decreace();
		}
	}

}
