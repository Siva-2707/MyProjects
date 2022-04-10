package com.siva.dp.abstractFactoryPattern.BikeComponents;

public class MountainBikeHandleBar extends HandleBar {

	
private static final String type = "FLAT";
	
	@Override
	public void getDescription() {
		System.out.println("Mountain bike handlebar. Type: "+ type);
	}
}
