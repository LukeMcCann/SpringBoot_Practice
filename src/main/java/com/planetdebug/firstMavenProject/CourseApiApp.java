package com.planetdebug.firstMavenProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Define as a SpringBoot application
@SpringBootApplication
public class CourseApiApp
{
    /**
     * SpringApplication.run(classWithMain, argsInMain)
     * @param args
     */
    public static void main(String[] args)
    {
        // Start the application
        // Create a servlet container
        // Host this application in the servlet container
        SpringApplication.run(CourseApiApp.class, args);
    }
}
