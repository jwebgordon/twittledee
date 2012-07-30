/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author wgordon
 */
public class Comment {
    private String msg;
    private String email;
    private String name;
    private Date date;
    private String cssClass;
    private String progressClass;
    private double sliderVal;
    
    public Comment(){
        cssClass = "normColumn";
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
    
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }
    
    
    
}
