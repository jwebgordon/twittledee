/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.HashMap;
import entities.FormSubmission;
import java.util.ArrayList;

/**
 *
 * @author wgordon
 */
public class Lead {
    private String firstName;
    private String lastName;
    private String email;
    private String guid;
    private String twitter;
    private String userToken;
    private HashMap<String, FormSubmission> forms;
    private ArrayList<Tweet> tweets;
    private ArrayList<Tweet> filteredTweets;
    private String tweetCssClasses;
    
    public Lead(){
        tweets = new ArrayList<Tweet>();
        forms = new HashMap<String, FormSubmission>();
        filteredTweets = new ArrayList<Tweet>();
    }
    
    public void addFilteredTweet(Tweet tweet){
        filteredTweets.add(tweet);
    }

    public ArrayList<Tweet> getFilteredTweets() {
        return filteredTweets;
    }

    public void setFilteredTweets(ArrayList<Tweet> filteredTweets) {
        this.filteredTweets = filteredTweets;
    }
    
    public void removeFTweet(int i){
        if(i<filteredTweets.size()){
            filteredTweets.remove(i);
        }
        else
            return;
    }
    
    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }
    
    
   

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }
   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getTweetCssClasses() {
        return tweetCssClasses;
    }

    public void setTweetCssClasses(String tweetCssClasses) {
        this.tweetCssClasses = tweetCssClasses;
    }
    
    
    
}
