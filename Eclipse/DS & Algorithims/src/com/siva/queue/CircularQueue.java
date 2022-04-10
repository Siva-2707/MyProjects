package com.siva.queue;

public class CircularQueue {
	
	private int head = -1, tail = -1;
	private int arr[];
	private int size;
	CircularQueue(int size){
		this.size = size;
		arr = new int[size];
	}
	private boolean firstEnqueue = true;
	
	
	public void  enqueue(int data) {
		if(firstEnqueue) {
			head = 0;
			arr[++tail] = data;
			firstEnqueue = false;
			return;
			
		}
		
		if(tail == size-1) {
				tail = -1;
		}
		
		if(tail == head -1) {
			System.out.println("Queue is full");
			return;
		}
		arr[++tail] = data;
	
	}
	private boolean isEmpty = false;
	
	public void dequeue() {
		
		if(isEmpty && head == tail ) {
			System.out.println("Queue is empty");
			return;
		}
		
		if(head == tail && !isEmpty) {
			System.out.println(arr[head]);
			isEmpty = true;
			return;
		}
		if(head != tail ){
			isEmpty = false;
		}
		
		if(!isEmpty) {
			
			System.out.println(arr[head]);
			
			if( head == size - 1 )
				head = 0; 
			else
				head++;
		}
		else{
			System.out.println("Queue is empty");
			
		}
			
	}
	public void peek() {
		
	}

}
