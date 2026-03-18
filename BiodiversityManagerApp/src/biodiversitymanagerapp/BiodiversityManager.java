/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversitymanagerapp;

/**
 *
 * @author moise
 */
public class BiodiversityManager {

    //variable
    private String scope, name, description;

    //overloaded constructor
    public BiodiversityManager(String scope, String name, String description) {
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
    //method can be overwritten in subclasses
    public String printDetails(){
        return "Scope: "+scope+"\nName "+name+"\ndescription "+description;
    }
    
    //method for saving to the text can be overwriten to fit subclasses's need
    public String fileFormat(){
        return scope+","+name+","+description;
    }
}
