package com.siva.dp.abstractFactoryPattern.BikeComponents;

public class RoadBikeHandlebar extends HandleBar {

private static final String type = "DROP";
	
	@Override
	public void getDescription() {
		System.out.println("Road bike handlebar. Type: "+ type);
	}
	
}
