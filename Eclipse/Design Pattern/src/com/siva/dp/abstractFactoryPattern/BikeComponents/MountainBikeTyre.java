package com.siva.dp.abstractFactoryPattern.BikeComponents;

public class MountainBikeTyre extends Tyre {
	
private static final String width = "WIDE";
private static final String pressure = "MEDIUM";

	@Override
	public void getDescription() {
		System.out.println("Mountain bike tyre. Width: "+ width +"Pressure: "+pressure);
	}

}
