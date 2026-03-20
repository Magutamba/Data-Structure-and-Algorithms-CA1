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
public class ClimateAction extends BiodiversityManager implements Serializable {

    //variable
    private String result;

    //overloaded constructor sets ClimateAction fields and calls the superclass constructor
    public ClimateAction(String result, String scope, String name, String description) {
        super(scope, name, description);
        this.result = result;
    }

    //setter
    public void setResult(String result) {
        this.result = result;
    }

    //getter

    public String getResult() {
        return result;
    }
    
    /**
     *
     */
    @Override
    public void validCommon(){
        //inherit the validation from super class BiodiversityManager
        super.validCommon();
        if(result.equals(null) || result.equals("")){
            throw new IllegalArgumentException("A result must be entered.");
        }
    }
    
    //override the method with the ClimateAction variable
    @Override
    public String printDetails() {
        return super.printDetails()+"Result of solutions applied: "+result; 
    }  
}
