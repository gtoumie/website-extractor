package com.gtoumie.webcategorizer;

import com.gtoumie.urlextractor.UrlExtractor;
import com.gtoumie.webcategorizer.model.Category;
import com.gtoumie.webcategorizer.model.CategoryKeyword;

import java.io.IOException;
import java.util.*;

/**
 * This is the main class for Categorizing Websites
 */
public class Runner {
    /**
     * This is a constant that acts as a field separator between categories
     */
    private static final String FIELD_SEPERATOR = ",";



    private static List<Category> categories;

    /**
     * This is a private method, called to initialize the categories and the keywords that identifies them
     */
    protected static void initializeModel(){
        categories = new ArrayList<>();

        Category starWarsCategory = new Category("Star Wars");
        starWarsCategory.addCategoryKeyword(new CategoryKeyword("star war"));
        starWarsCategory.addCategoryKeyword(new CategoryKeyword("starwars"));
        starWarsCategory.addCategoryKeyword(new CategoryKeyword("starwar"));
        starWarsCategory.addCategoryKeyword(new CategoryKeyword("r2d2"));
        starWarsCategory.addCategoryKeyword(new CategoryKeyword("may the force be with you"));

        Category basketballCategory = new Category("Basketball");
        basketballCategory.addCategoryKeyword(new CategoryKeyword("basketball"));
        basketballCategory.addCategoryKeyword(new CategoryKeyword("nba"));
        basketballCategory.addCategoryKeyword(new CategoryKeyword("ncaa"));
        basketballCategory.addCategoryKeyword(new CategoryKeyword("lebron james"));
        basketballCategory.addCategoryKeyword(new CategoryKeyword("john stokton"));
        basketballCategory.addCategoryKeyword(new CategoryKeyword("anthony davis"));

        categories.add(starWarsCategory);
        categories.add(basketballCategory);
    }

    /**
     * This is a function that gets a list of URLs and returns for each URL,
     * a comma-separated list of matching categories
     *
     * @param urls List of URLs to identify their categories
     * @return Map containing the URLs as keys and comma-separated categories as value
     */
    public static Map<String, String> categorizeWebsites(List<String> urls){
        initializeModel();
        Map<String, String> categorizedUrls = new HashMap<>();

        for(String url: urls){
            try {
                String websiteText = UrlExtractor.readWebsite(url);
                String matchedCategories = categorizeWebsite(websiteText, categories);
                categorizedUrls.put(url, matchedCategories);
            } catch (IOException e) {
                System.out.println("ERROR: unable to parse URL: " + url);
                System.out.println(e.getLocalizedMessage());
            }
        }
        return categorizedUrls;
    }

    /**
     * This function gets a website content as a text and the list of categories
     * and returns the matching categories from the list provided
     *
     * @param text typically the website's content
     * @param categories list of categories to match against
     * @return String of comma-separated matching categories
     */
    protected static String categorizeWebsite(String text, List<Category> categories){
        StringBuilder matchedCategories = new StringBuilder("");
        for(Category category: categories){
            if(category.matches(text)){
                matchedCategories.append(FIELD_SEPERATOR);
                matchedCategories.append(category.getName());
            }
        }
        if (matchedCategories.length()>0){
            matchedCategories.deleteCharAt(0);
        }
        return matchedCategories.toString();
    }
    public static List<Category> getCategories() {
        return categories;
    }
}
