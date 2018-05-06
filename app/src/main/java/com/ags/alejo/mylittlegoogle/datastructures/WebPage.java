package com.ags.alejo.mylittlegoogle.datastructures;

import java.util.List;

/**
 * @author Alejandro Garcia Serna,Miguel Angel Velez
 */
public class WebPage implements Comparable<WebPage>{
    
    private String keyword;
    private List< String > urls;

    public WebPage(String keyword, List<String> urls) {
        this.keyword = keyword;
        this.urls = urls;
    }

    public WebPage(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
    
    
    

    @Override
    public int compareTo(WebPage o) {
        if(o.getKeyword().length() > keyword.length()) return 1;
        if(o.getKeyword().length() < keyword.length()) return -1;
        return 0;
    }
}
