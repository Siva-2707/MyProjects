package com.siva.dp.abstractFactoryPattern;

import com.siva.dp.abstractFactoryPattern.BikeComponents.*;

public class MountainBikeFactory implements BikeFactory {

	@Override
	public Tyre createTyre() {
		return new MountainBikeTyre();
	}
	
	@Override
	public HandleBar createHandleBar() {
		return new MountainBikeHandleBar();
	}
	
	
}
