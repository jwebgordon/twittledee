/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author wgordon
 */
public class Blog {
    private String id;
    private String title;
    private String URL;
    private ArrayList<BlogPost> posts; 
    
    public Blog(){
        posts = new ArrayList<BlogPost>(); 
    }
    
    
    public void addAPost(BlogPost p){
        posts.add(p);
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<BlogPost> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<BlogPost> posts) {
        this.posts = posts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
