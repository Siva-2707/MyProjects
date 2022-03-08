package com.siva.algorithms;

public class Sort implements SortingAlgorithms{

	public void bubbleSort() {
		System.out.println("Entering Bubble Sort");
		int arr[] = new int[] {5,8,10,4,2};	 
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted and Printing now");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Exiting Bubble sort");
	}
	
	public void selectionSort() {
		
		int arr[] = new int[] {5,8,10,4,2};	
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			int temp = arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex] = temp;
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	
	public void insersionSort() {
		int arr[] = new int[] {10,5,8,6,5};	
		for(int i=0; i<arr.length-1; i++) {
			int j=i+1;
			int current = arr[j];
			while(j>0 && current<arr[j-1]) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=current;
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
}
