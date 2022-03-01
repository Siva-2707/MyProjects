package com.siva.algorithims;

public class Algorithims {

	public static void bubbleSort() {
		
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
		for (int i : arr) {
			System.out.print(i+" ");
		}	
	}
	
	public static void selectionSort() {
		
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
	
	public static void insersionSort() {
		int arr[] = new int[] {5,8,10,4,2};	
		for(int i=0; i<arr.length-1; i++) {
			int j=i+1;
			int current = arr[i+1];
			while(j!=0 && arr[j-1]>current) {
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
