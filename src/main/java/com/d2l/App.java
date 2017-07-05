package com.d2l;


import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("com.d2l.app");
		logger.setLevel(Level.INFO);
		logger.info("Hello D2L");
		
		Score a = new Score();
		System.out.println(a.addScore(1, 2));
	}

}
