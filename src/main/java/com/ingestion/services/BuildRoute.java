package com.ingestion.services;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

public class BuildRoute extends RouteBuilder {

    /**
     * Allow this route to be run as an application
     */
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    public void configure() {
     
    }
}
