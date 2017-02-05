package com.ingestion.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Startup {
	
	private static final Logger logger = LoggerFactory.getLogger(Startup.class);

	public void init() {
		logger.info(":: BrokerStartup :: initialized!!!");
	}
}
