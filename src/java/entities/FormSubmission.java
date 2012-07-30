/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wgordon
 */
public class FormSubmission {
    private HashMap<String, String> submittedFields;
    private String formName;

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }
    
    public FormSubmission(String name) {
        submittedFields = new HashMap();
        formName = name;
    }

    public FormSubmission() {
        submittedFields = new HashMap();
    }
 
    public HashMap getSubmittedFields(){
        return submittedFields;
    }
    
    public void addSubmittedField(String key, String value){
        submittedFields.put(key, value);
    }
    
}
