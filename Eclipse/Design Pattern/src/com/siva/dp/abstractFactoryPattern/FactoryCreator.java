package com.siva.dp.abstractFactoryPattern;


public class FactoryCreator {
	public enum bikeType{
		MOUNTAIN,
		ROAD
	}
	
	
	
	public BikeFactory createFactory(bikeType type) throws Exception 
	{
		switch(type) {
		case MOUNTAIN: return new MountainBikeFactory(); 
		case ROAD:     return new RoadBikeFactory();
		default: throw new Exception();
		
		}
		
	}
}
