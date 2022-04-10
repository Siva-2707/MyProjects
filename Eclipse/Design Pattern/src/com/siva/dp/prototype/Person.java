package com.siva.dp.prototype;

public class Person implements Prototype, Cloneable {
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Object getClone(){
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
	
	
}
