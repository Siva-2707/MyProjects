package com.siva.dp.abstractFactoryPattern;

import com.siva.dp.abstractFactoryPattern.FactoryCreator.bikeType;
import com.siva.dp.abstractFactoryPattern.BikeComponents.*;

 class BikeBuilder {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		createWithoutAbstractFactoryBuilder();
		
		createWithAbstractFactoryBuilder(bikeType.ROAD); //Inputs MOUNTAIN or ROAD 
		
		
	}
	
	public static void createWithoutAbstractFactoryBuilder() {
		
		MountainBikeHandleBar handleBar = new MountainBikeHandleBar();
		MountainBikeTyre frontTyre = new MountainBikeTyre();          //Tight Coupling. Not preferred.
		MountainBikeTyre backTyre = new MountainBikeTyre();
		handleBar.getDescription();
		frontTyre.getDescription();
		backTyre.getDescription();
		System.out.println();
		
		
	}
	public static void createWithAbstractFactoryBuilder(bikeType type) throws Exception {
		FactoryCreator factoryCreator = new FactoryCreator();
		BikeFactory bikeFactory = factoryCreator.createFactory(type);
		HandleBar handleBar =  bikeFactory.createHandleBar();
		Tyre frontTyre = bikeFactory.createTyre();               //Loose Coupling. Most preferred.
		Tyre backTyre = bikeFactory.createTyre();
		handleBar.getDescription();
		frontTyre.getDescription();
		backTyre.getDescription();
	}

}
