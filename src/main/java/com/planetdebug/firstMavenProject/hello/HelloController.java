package com.planetdebug.firstMavenProject.hello;

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
}
