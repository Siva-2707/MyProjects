package com.siva.dp.abstractFactoryPattern;

import com.siva.dp.abstractFactoryPattern.BikeComponents.*;

public interface BikeFactory {
	
	Tyre createTyre();
	HandleBar createHandleBar();

}
