package com.gtoumie.webcategorizer.model;

import com.gtoumie.webcategorizer.exceptions.TooManyWordsException;

/**
 * This class represents the keywords representing the categories
 */
public class CategoryKeyword {
    private static final String PHRASE_SPLIT_REGEX = "\\s";
    private String keyword;

    /**
     * This is the main constructor for keywords that represent a Category
     *
     * @param keyword the text of the keyword
     */
    public CategoryKeyword(String keyword) {

        if (keyword != null) {
            int wordCount = keyword.split(PHRASE_SPLIT_REGEX).length;
            if (wordCount > 0 && wordCount <= 6) {
                this.keyword = keyword;
            } else {
                throw new TooManyWordsException();
            }
        }
    }

    /**
     * This function checks if this keyword is contained within a given text
     *
     * @param text usually the contents of a website to match against this keyword instance
     * @return boolean true if keyword exists within the given text, and false otherwise
     */
    public boolean existsIn(String text) {
        return text.toLowerCase().contains(this.keyword.toLowerCase());
    }
}
