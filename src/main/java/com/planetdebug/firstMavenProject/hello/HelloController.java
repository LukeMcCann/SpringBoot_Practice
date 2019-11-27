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
     *
     * @return String
     */
    @RequestMapping("/hello")
    public String helloWorld()
    {
        return("Hello World!");
    }
}
