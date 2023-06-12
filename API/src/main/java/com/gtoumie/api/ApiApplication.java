package com.gtoumie.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class is the SpringBoot bootstrap / Main class
 *
 * @author Ghassan Toumie
 */
@SpringBootApplication
public class ApiApplication {

    /**
     * This is the main method that runs Springboot and starts up the webservice
     * @param args arguments passed to the application on startup
     */

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
