package com.planetdebug.firstMavenProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: Luke McCann
 * Date: 27/11/2019
 *
 * Notes:
 * SpringBoot favours convention over configuration.
 * The default configuration addresses 80% of use cases.
 *
 * We "plug-in" code into SpringBoot by creating custom classes and annotating them with intent.
 * e.g. of we create a business service - we create a class annotating it with AddServiceAnnotation,
 * if we create a Controller we do the same but annotate it with the Controller annotation.
 *
 * Spring looks at the classes and depending on the marker added treats it correspondingly.
 *
 * When building a REST API it is important to think about what the resources of the REST API are.
 * Once this is defined you can look at the ways which the consumers may access the resource. The resources of the
 * Course API are: Topic, Course, Lesson
 *
 * HTTP Methods allow us to access these resources in different ways, while a HTTP method defines what we do with the
 * resource, the resource itself are constants (entities/nouns of the system).
 */
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
        //Sets up default configuration
        // Starts Spring application context
        // Performs class path scan
        // Starts Tomcat server
        SpringApplication.run(CourseApiApp.class, args);
    }
}
