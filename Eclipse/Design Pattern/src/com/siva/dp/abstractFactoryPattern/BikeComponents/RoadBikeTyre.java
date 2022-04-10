package com.siva.dp.abstractFactoryPattern.BikeComponents;

public class RoadBikeTyre extends Tyre{
	
	private static final String width = "NARROW";
	
	@Override
	public void getDescription() {
		System.out.println("Road bike tyre. Width: "+ width);
	}
	
	
}
