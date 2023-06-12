package com.gtoumie.webcategorizer;

import  com.gtoumie.webcategorizer.Runner;
import com.gtoumie.webcategorizer.model.*;
import com.gtoumie.webcategorizer.model.CategoryKeyword;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.*;

import static org.junit.Assert.assertEquals;

public class RunnerTests {
    private static List<String> testUrls;

    @BeforeClass
    public static void setUp() {
        testUrls = Arrays.asList(
                "https://www.nba.com/",
                "https://www.starwars.com/",
                "https://www.google.com/",
                "https://www.imdb.com/find?q=star+wars&ref_=nv_sr_sm",
                "https://edition.cnn.com/sport"
        );
        Runner.initializeModel();
    }

    @Test
    public void testCategorizeWebsites() {
        Map<String, String> categorizedUrls = Runner.categorizeWebsites(testUrls);

        assertEquals("Basketball", categorizedUrls.get("https://www.nba.com/"));
        assertEquals("Star Wars", categorizedUrls.get("https://www.starwars.com/"));
        assertEquals("", categorizedUrls.get("https://www.google.com/"));
        assertEquals("Star Wars", categorizedUrls.get("https://www.imdb.com/find?q=star+wars&ref_=nv_sr_sm"));
        assertEquals("Basketball", categorizedUrls.get("https://edition.cnn.com/sport"));
    }

    @Test
    public void testCategorizeWebsite() {
        String text = "May the force be with you, Luke Skywalker!";

        List<Category> categories = Runner.getCategories();
        String matchedCategories = Runner.categorizeWebsite(text, categories);

        assertEquals("Star Wars", matchedCategories);
    }

    @AfterClass
    public static void tearDown() {
        testUrls = null;

    }
}