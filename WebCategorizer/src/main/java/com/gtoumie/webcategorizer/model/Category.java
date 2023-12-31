package com.gtoumie.webcategorizer.model;

import com.gtoumie.webcategorizer.exceptions.TooManyKeywordsException;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a model Class representing the Category of a website
 * and is used to categorize websites and contains keywords
 *
 */
public class Category {

    String name;
    List<CategoryKeyword> keywords;

    /**
     * This is the basic constructor, name is mandatory,
     * the list of keywords in this case are initialized as empty List
     *
     * @param name of the Category
     */
    public Category(String name) {
        this.name = name;
        this.keywords = new ArrayList<>();
    }


    /**
     *  This method allows you to add keywords to the category
     * @param categoryKeyword instance of the CategoryKeyword that identifies this Category
     */

    public void addCategoryKeyword(CategoryKeyword categoryKeyword){
        if(this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        if(this.keywords.size()>1000){
            throw new TooManyKeywordsException();
        }
        this.keywords.add(categoryKeyword);
    }

    /**
     * this function gets a text (contents of a website)
     * and checks if it matches any keywords related to this category
     *
     * @param text contents to match against keywords
     * @return boolean value if this text matches against
     */
    public boolean matches(String text){
        if(this.keywords != null && !this.keywords.isEmpty()){
            for (CategoryKeyword categoryKeyword : this.keywords){
                if(categoryKeyword.existsIn(text)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This function returns all keywords related to this Category
     *
     * @return List of CategoryKeywords
     */
    public List<CategoryKeyword> getKeywords() {
        return keywords;
    }

    /**
     * This function returns the name of the category
     *
     * @return name of the category
     */
    public String getName() {
        return name;
    }
}
