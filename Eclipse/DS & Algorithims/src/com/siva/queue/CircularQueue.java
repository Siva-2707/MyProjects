package com.siva.queue;

public class CircularQueue {
	
	private int head = -1, tail = -1;
	private int arr[];
	private int size;
	CircularQueue(int size){
		this.size = size;
		arr = new int[size];
	}
	
	
	public void  enqueue(int data) {
		if(tail == -1 && head == -1)
			head = 0;
		
		if(tail == size-1) {
			if(tail-head<size)
				tail = -1;
			else { 
				System.out.println("Queue is full");
				return;
			}
		}
		
		if(tail<head && head-tail == 1 ) {
			System.out.println("Queue is full");
			return;
		}
		
		arr[++tail] = data;	
		
		
	}
	
	public void dequeue() {
		boolean isEmpty = false;
		if(head == size -1) {
			System.out.println(arr[head]);
			head = 0;
			return;
		}
		if(head == tail && tail!= -1) {
			System.out.println(arr[head]);
			isEmpty = true;
			return;
		}
		if(!isEmpty)
		System.out.println(arr[head++]);
		
		
		
	}
	public void peek() {
		
	}

}
