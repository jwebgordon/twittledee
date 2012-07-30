/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author wgordon
 */
public class BlogPost {
    private String id;
    private String title;
    private long timeStamp;
    private Date date;
    private String url;
    private ArrayList<Comment> comments;
    private String classString;
    
    public BlogPost(){
        comments = new ArrayList<Comment>();
        classString = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public void addComment(Comment c){
        comments.add(c);
    }
    
    public Comment getAComment(int i){
        return comments.get(i);
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public String getClassString() {
        return classString;
    }

    public void setClassString(String classString) {
        this.classString = classString;
    }
    
    public void appendCString(String s){
        classString = classString.concat(s);
    }
    
    
}
