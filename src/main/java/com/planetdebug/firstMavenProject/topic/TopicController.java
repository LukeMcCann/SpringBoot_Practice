package com.planetdebug.firstMavenProject.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Luke McCann
 * Date: 28/11/2019
 *
 *  When Spring creates an instance of this class it looks at all the member variables to see if any have a dependency
 *  to TopicService.
 *
 *  Spring sees the Service, creates a new instance and registers it. When it comes across AutoWired it sees
 *  the TopicService and Service tag corresponding - looks at its registry and sees an instance has already been created,
 *  It takes this instance and injects it.
 */

@RestController
public class TopicController
{
    // Autowired Declares the dependency, TopicService is marked as something which requires dependency injection.
    @Autowired
    private TopicService topicService;

    /**
     *
     * @return List of topics as JSON array.
     */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    // URI variable matching, receiving parameters from URI
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }
}
