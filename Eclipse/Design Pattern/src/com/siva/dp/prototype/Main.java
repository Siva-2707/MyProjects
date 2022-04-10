package com.siva.dp.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.setAge(10);
		d1.setOwner("Siva");
		System.out.println(d1);
		Dog d2 = (Dog) d1.getClone();
		d2.setAge(12);
		d2.getOwner().setName("Shree");
		
		System.out.println(d1);
		System.out.println(d2);
		
	}

}
