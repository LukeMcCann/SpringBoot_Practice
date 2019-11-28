package com.planetdebug.firstMavenProject.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Luke McCann
 * Date: 28/11/2019
 *
 *
 */

@RestController
public class TopicController
{
    /**
     *
     * @return List of topics as JSON array.
     */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
                new Topic("Guitar", "G127", "Guitar Instrumentation"),
                new Topic("Pokemon", "PKMN122", "Pokemon Anime and Games"),
                new Topic("The Flash", "DC19932", "The Flash Superhero")
        );
    }
}
