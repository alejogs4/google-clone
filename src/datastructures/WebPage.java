package datastructures;

import java.util.ArrayList;

/**
 * @author Alejandro Garcia Serna,Miguel Angel Velez
 */
public class WebPage implements Comparable<WebPage>{
    
    private String url;
    private ArrayList< String > keywords;

    public WebPage(String url, ArrayList<String> keywords) {
        this.url = url;
        this.keywords = keywords;
    }

    public WebPage(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public int compareTo(WebPage o) {
        if(o.getUrl().length() > url.length()) return 1;
        if(o.getUrl().length() < url.length()) return -1;
        return 0;
    }
}
