package com.planetdebug.firstMavenProject.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Luke McCann
 * Date: 28/11/2019
 *
 *
 */

@RestController
public class TopicController
{
    @RequestMapping("/topics")
    public String getAllTopics()
    {
        return("All Topics");
    }
}
