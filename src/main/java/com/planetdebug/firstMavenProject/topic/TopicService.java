package com.planetdebug.firstMavenProject.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Luke McCann
 * Date: 30/11/2019
 *
 *  Business Service - in Spring these are typically singletons, when the application starts up spring creates
 *  an instance of this service, which is kept in memory registers.
 *
 *  We can add other classes/controllers which depend on this singleton making it a dependency.
 *
 *  Spring knows this is a dependency which it has created and injects it into the classes dependent on it.
 *
 * Service is a stereotype annotation - this marks the class as a Spring business service.
 */
@Service
public class TopicService
{
    // Note: never hard-code data in real apps, this is a experimental example.
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Guitar", "G127", "Guitar Instrumentation"),
            new Topic("Pokemon", "PKMN122", "Pokemon Anime and Games"),
            new Topic("The Flash", "DC19932", "The Flash Superhero")
    ));

    public List<Topic> getAllTopics()
    {
        return this.topics;
    }

    public Topic getTopic(String id)
    {
        // if(t.getId == id)
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic)
    {
        topics.add(topic);
    }
}
