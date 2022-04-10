package com.siva.dp.singleTon;

public class SingleTon {  // Can create only one instance for this class
	
	private static SingleTon instance ;
	private static boolean isInstanceCreated = false ;
	private int sampleValue ;
	private SingleTon(){}  // Private constructor 
	
		public static SingleTon getInstance() {
			if(isInstanceCreated)
				return instance;
			else { 
				instance = new SingleTon();
				isInstanceCreated = true;
				return instance;
			}	
		}
			
		public int getValue() {
			return sampleValue;
			
		}
		public void setValue(int value) {
			this.sampleValue = value;
		}
		
		
	}
	
