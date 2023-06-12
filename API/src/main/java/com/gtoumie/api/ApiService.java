package com.gtoumie.api;

import com.gtoumie.urlextractor.UrlExtractor;
import com.gtoumie.webcategorizer.Runner;
import com.gtoumie.webcategorizer.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * WebPageTextService contains the webservice API implementation to read and Categorize website's content
 *
 * @author Ghassan Toumie
 */
@RestController
public class ApiService {
    /**
     * This is a GET REST API that gets a list of URLs as input
     * and returns a JSON object containing the URLs as keys
     * and textual content as body.
     *
     *
     * @param urls a comma-separated list of URLs
     * @return a JSON response whereas the key is the URL and the value is the website's text for each url supplied
     */
    @GetMapping("/website/text")
    public Map<String, String> getWebsiteText(@RequestParam List<String> urls)  {
        Map<String, String> result = UrlExtractor.readWebsiteList(urls);
        return result;
    }
    /**
     * This is a GET REST API that gets a list of URLs as input
     * and returns a JSON object containing the URLs as keys
     * and textual content as categories, if there are multiple categories they will be comma-separated.
     *
     *
     * @param urls a comma-separated list of URLs
     * @return a JSON response whereas the key is the URL and the value is the website's text for each url supplied
     */
    @GetMapping("/website/category")
    public Map<String, String> getWebsiteCategory(@RequestParam List<String> urls)  {
        Map<String, String> result = Runner.categorizeWebsites(urls);
        return result;
    }

}
