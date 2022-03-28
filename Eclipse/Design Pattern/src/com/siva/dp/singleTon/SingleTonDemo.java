package com.siva.dp.singleTon;

public class SingleTonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon st = SingleTon.getInstance();
		st.setValue(34);
		System.out.println(st.getValue());
		
		SingleTon st1 = SingleTon.getInstance();
		System.out.println(st1.getValue());
		
	}

}
