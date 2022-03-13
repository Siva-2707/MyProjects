package com.siva.stack;

public class Stack {

	private int top = -1;
	private int arr[];
	private int size;
	
	Stack(int size){
		this.size = size;
		arr = new int[size];
	}
	
	public void push(int data) {
		if(top == size)
			System.out.println("Stack is full");
		else
		arr[++top] = data;
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("No elements in the stack");
		}
		System.out.println(arr[top--]);
	}
	public void peek() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		System.out.println(arr[top]);
		
	}
	
	
	
	
	
}
