/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

/**
 *
 * @author moise
 */
public class BiodiversityManager {
    
    //variable
    protected String scope, name, description;

    //overloaded constructor
    protected BiodiversityManager(String scope, String name, String description) {
        this.scope = scope; 
        this.name = name;
        this.description = description;
    }

    //setters
    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //getters

    public String getScope() {
        return scope;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    //error handling for common variables
    protected void validCommon(){
        if(scope==null || (!scope.equalsIgnoreCase("Country") && !scope.equalsIgnoreCase("City") && !scope.equalsIgnoreCase("Habitat")) ){
            throw new IllegalArgumentException(" Scope can only be 'Country', 'City', 'Habitat' ");
        }
        
        if(name==null || name==""){
            throw new IllegalArgumentException(" A name must be entered.");
        }
         if(description==null || description==""){
            throw new IllegalArgumentException(" A description must be entered.");
        }
        
    }
    //abstract validate methods, to be implemented in subclasses
    protected void validate(){
        validCommon();
    }
    
    //method for displaying details will be overwritten in subclasses
    public String printDetails(){
        return "Scope: "+scope+"\nName: "+name+"\nDescription: "+description;
    }
    
    //use my own toString() implementation rather than Java default toString() for objects
    @Override
    public String toString(){
        return printDetails();
    }
    
}
