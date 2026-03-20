/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

import java.io.Serializable;

/**
 *
 * @author moise
 */
public class PriorityEnvironment extends BiodiversityManager implements Serializable {

    //variable
    private String reason;
    
    //overloaded constructor sets PriorityEnvironment fields and calls the superclass constructor
    public PriorityEnvironment(String reason, String scope, String name, String description) {
        super(scope, name, description);
        this.reason = reason;
    }
    
    //setters

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    //getters

    public String getReason() {
        return reason;
    }
    
    //add reason validation to inherited validCommon method
    @Override
    public void validCommon(){
        super.validCommon();
        if(reason==null || reason.equals("") ){
            throw new IllegalArgumentException(" Scope can only be 'Country', 'City', 'Habitat' ");
        }
    }
    
    //override the method with the PriorityEnvironment variable
    @Override
    public String printDetails() {
        return super.printDetails()+"Reason for priority set: "+reason;
    } 
}
