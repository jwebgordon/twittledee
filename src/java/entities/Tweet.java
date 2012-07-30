/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author wgordon
 */
public class Tweet {
    private String msg;
    private String date;
    private boolean shouldDisplay;
    private String url;
    private String cssClass;
    private String progressClass;
    private double sliderVal;
    
    public Tweet(String s){
        this.msg = s;
        cssClass="";
                
    }
    public Tweet(String s, String t){
        this.msg = s;
        this.url = t;
        cssClass="";
    }

    public String getProgressClass() {
        return progressClass;
    }

    public void setProgressClass(String progressClass) {
        this.progressClass = progressClass;
    }

    public double getSliderVal() {
        return sliderVal;
    }

    public void setSliderVal(double sliderVal) {
        this.sliderVal = sliderVal;
    }
    
    

    public boolean isShouldDisplay() {
        return shouldDisplay;
    }

    public void setShouldDisplay(boolean shouldDisplay) {
        this.shouldDisplay = shouldDisplay;
    }
    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }
    
    
    
}
