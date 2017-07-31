package com.xiaoyb.thread.producerconsumer2;

import java.util.LinkedList;

/**
 * 临界区，可存放多个产品
 * 
 * @author XIAO
 *
 */
public class ChocolateBox {
	private final int MAX_SIZE = 10; // 临界区最多能存放10个产品

	// 存放巧克力的盒子
	private LinkedList<Chocolate> chocolates = new LinkedList<>();// 临界区

	/**
	 * 向盒子中放入num个巧克力
	 */
	public synchronized void putChocolate() {
		while (chocolates.size() + 1 > MAX_SIZE) {// 如果盒子满了
			try {
				this.wait();// 让生产者线程等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 生产条件满足情况下，放入一个产品
		chocolates.add(new Chocolate());
		System.out.println(chocolates.size());
		this.notifyAll();// 唤醒其他线程
	}

	/**
	 * 从盒子中拿出产品
	 */
	public synchronized void getChocolate() {
		while (chocolates.size() < 1) {// 如果盒子空了
			try {
				this.wait();// 让消费者线程等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 消费条件满足情况下，消费一个产品
		chocolates.remove();
		System.out.println(chocolates.size());
		this.notifyAll();// 唤醒其他线程
	}

}
