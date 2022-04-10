package com.siva.dp.prototype;

public class Dog implements Prototype, Cloneable {
	
	public enum Breed{
		INDIAN, AMERICAN, MEXICAN
	}
	
	private Breed breed;
	private int age;
	private Person owner;
	
	Dog(){
		
	}
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(String name) {
		this.owner = new Person();
		this.owner.setName(name);
	}
	

	public Object getClone() {
		try {
			Object obj =  super.clone();
			Dog dObj = (Dog) obj;
			dObj.owner = (Person)this.owner.getClone();
			return obj;
		}
		catch(CloneNotSupportedException e) {
			throw new AssertionError();
		}
				
	}
	
	@Override
	public String toString() {
		return "Dog [age=" + age + ", owner=" + owner.getName() + "]";
	}
	
	
	
	
}
