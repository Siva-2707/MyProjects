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
			int min =arr[i];
			int index = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					min=arr[j];
					index = j;
				}
			int temp = arr[i];
			arr[i]=arr[index];
			arr[index] = temp;
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	
	
	
	
	
}
