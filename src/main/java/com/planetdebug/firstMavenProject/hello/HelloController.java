package com.planetdebug.firstMavenProject.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Luke McCann
 * Date: 28/11/2019
 *
 * In RestControllers handler methods return a JSON/XML response directly to client
 * rather than using view resolvers. It is a convenience annotation that is itself annotated
 * with @Controller and @ResponseBody.
 *
 * A request comes in to the Spring MVC framework, we write controllers to handle these requests. We write a method
 * annotated with the URI and the HTTP method.
 *
 * When a GET request comes in we write a method to handle the request, then annotate the method with Spring MVC annotations
 * mapping the method to the URI using a HTTP method.
 *
 * Spring MVC looks at both the URI and the HTTP Method (Get, Post, etc..) then it examines the list of available
 * controllers in the class path, if any of these methods have the URI and HTTP that map to the incoming request it
 * executes the corresponding method. Whatever the return type is is converted to a proper response and sent back.
 */
@RestController
public class HelloController
{

    /**
     * RequestMapping - maps request of of the url to the method (/hello is the url which is mapped to this method)
     * This annotation tells the spring framework that whenever there is a HTTP request to this application at the url "/hello"
     * we want this method to be executed.
     *
     * RequestMapping maps only map to GET by default, to map to other HTTP methods you have to specify it in the annotation.
     * In other words we map a request to a response.
     *
     * @return String
     */
    @RequestMapping("/hello")
    public String helloWorld()
    {
        return("Hello World!");
    }
}
