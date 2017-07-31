package com.xiaoyb.thread.producerconsumer1;

public class PublicResource {
	private int number;// 公共资源的数量

	/**
	 * 增加公共资源
	 */
	public synchronized void increace() {
		while (number != 0) {// 如果临界区已经满了，有资源了
			try {
				this.wait();// 让生产者线程一直等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number++;
		System.out.println(number);
		this.notifyAll();// 唤醒消费者线程
	}

	/**
	 * 减少公共资源
	 */
	public synchronized void decreace() {
		while (number == 0) {// 如果临界区公共资源为空
			try {
				this.wait();// 线程一直等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number--;
		System.out.println(number);
		this.notifyAll();// 唤醒生产者线程
	}

}
