package com.joshuastringfellow.PackageTemplate;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HelloWorld {
	private final static Logger LOGGER = LogManager.getLogger(HelloWorld.class.getName());

	public static void main(String[] args) {
		String message = "Hello World!";
		System.out.println("Standard message : " + message);
		System.out.println("Capitalized by " + WordUtils.class.getName() + " : " + WordUtils.capitalizeFully(message)); 
		LOGGER.error("Hello World from Log4j, example error message");
	}
}
