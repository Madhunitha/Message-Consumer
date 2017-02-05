package com.ingestion.services;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer {
	private static final Logger logger = LoggerFactory
			.getLogger(Consumer.class);

	public void consumeMessage(Exchange exchange) {
		
			logger.info("message received -{}", exchange);
			//Do further processing with the received message
			
		}
	}
