package com.siva.queue;

public class CircularQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue q = new CircularQueue(3);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(3);
	}

}
