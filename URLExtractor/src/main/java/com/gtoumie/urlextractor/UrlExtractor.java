package com.gtoumie.urlextractor;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is the UrlExtractor class, containing logic to extract text from websites
 *
 * @author Ghassan Toumie
 */

public class UrlExtractor {

    /**
     * This function gets a list of URLs and retrieves the contents for each one
     *
     * @param urls list of URLs to get the contents for
     * @return HashMap containing keys as urls and values as the website's text
     */
    public static Map<String, String> readWebsiteList(List<String> urls) {
        HashMap<String, String> result = new HashMap<>();
        for (String url : urls) {
            try {
                String websiteText = readWebsite(url);
                result.put(url, websiteText);
            } catch (IOException ioe) {
                result.put(url, "ERROR: " + ioe.getLocalizedMessage());
            }
        }
        return result;
    }

    /**
     * This function gets a single URL and returns the website's content
     *
     * !! IMPORTANT !!
     * the below implementation could be more complicated and call to several helper functions
     * to use URL object to manually open a connection to a URL then using a buffered reader to read the contents
     * and remove all contents except the body using regex, removing script tag (in case within the body)
     * and removing all other formatting tags p, b , i and spans leaving only the text
     *
     * but as a faster approach and to not reinvent the wheel i decided to use a dependency to Jsoup library
     *
     * @param url of the website you want the contents of
     * @return String representing the website's content
     * @throws IOException in case there was an issue connecting to the website
     */
    public static String readWebsite(String url) throws IOException {
        String websiteText = Jsoup.connect(url).get().text();
        return websiteText;
    }
}
