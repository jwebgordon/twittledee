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
public class Portal {
    private String portalID;
    private String apiKey;
    private String oauthToken;
    private String companyName;
    private ArrayList<Blog> blogs;
    
    public Portal(){
        blogs = new ArrayList<Blog>();
    }
    
    public void addABlog(Blog b){
        blogs.add(b);
    }
    
    
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getOauthToken() {
        return oauthToken;
    }

    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
    }

    public String getPortalID() {
        return portalID;
    }

    public void setPortalID(String portalID) {
        this.portalID = portalID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(ArrayList<Blog> blogs) {
        this.blogs = blogs;
    }
    
    

}
