package com.siva.dp.abstractFactoryPattern;
import com.siva.dp.abstractFactoryPattern.BikeComponents.*;

public class RoadBikeFactory implements BikeFactory {
	
	@Override
	public Tyre createTyre() {
		return new RoadBikeTyre();
	}
	
	@Override
	public HandleBar createHandleBar() {
		return new RoadBikeHandlebar();
	}


}
