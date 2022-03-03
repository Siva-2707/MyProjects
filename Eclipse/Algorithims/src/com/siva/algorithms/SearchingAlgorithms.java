package com.siva.algorithms;

public interface SearchingAlgorithms {
	
	public static int binarySearch(int num, int arr[]) {
		int n = arr.length;
		int start =0, end= n;
		while(true) {
			int mid=(start+end)/2;
			if(arr[mid]==num) {
				return mid;
			}
			if(arr[mid]>num) {
				end=mid;
			}
			else {
				start=mid;
			}
		}
	}
	
}
