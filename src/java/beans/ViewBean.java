/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Lead;
import java.util.ArrayList;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlPanelGrid;

/**
 *
 * @author wgordon
 */
@ManagedBean(name="ViewBean")
@ViewScoped
public class ViewBean {
private HtmlPanelGrid theGrid;
    /**
     * Creates a new instance of ViewBean
     */
    private HashMap<String, Lead> leads;    
    private ArrayList<Lead> leadList;
    //@ManagedProperty("#{ModelBean}")
    private ModelBean modelBean;
    
    @PostConstruct
    public void init(){
        modelBean.getTheLeads();
        leads = modelBean.getLeads();
        leadList = modelBean.getLeadList();
    }
    
    public void setModelBean(ModelBean mb){
        this.modelBean = mb;
    }

    public ArrayList<Lead> getLeadList() {
        return leadList;
    }

    public void setLeadList(ArrayList<Lead> leadList) {
        this.leadList = leadList;
    }

    public HashMap<String, Lead> getLeads() {
        return leads;
    }

    public void setLeads(HashMap<String, Lead> leads) {
        this.leads = leads;
    }
    
    
    
    public ViewBean() {

    }
    
    
    
    
    
}
