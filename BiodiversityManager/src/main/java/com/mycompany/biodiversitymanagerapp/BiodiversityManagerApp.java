/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biodiversitymanagerapp;

/**
 *
 * @author moise
 */
public class BiodiversityManagerApp {

    public static void main(String[] args) {
        //initialise the main page GUI and set it to visible when app is started
        BiodiversityManagerGUI GUI=new BiodiversityManagerGUI();
        GUI.setVisible(true);
        /*
        //System.out.print("Running");
        /*
        //variable to use ClimateActionInterface
    private ClimateActionInterface myClimateAction;
    //variable to use FileManagementInterface
    private FileManagement fileManager;
         //initialize new FileManagement
        fileManager = new FileManagement();
        //new ClimateActionList, if the file exist load it otherwise default to a new Doubly Linked List ClimateActionList
        myClimateAction = fileManager.load("ClimateAction.dat", new ClimateActionList());
        String scope = scopeTF.getText();
        String name = nameTF.getText();
        String description = descriptionTF.getText();
        String result = resultTF.getText();*/
        
        /*
        EnvironmentData section
        */
        //initialize new EnvironmentDataList
        EDInterface myEnvironmentData=new EnvironmentDataList();
        try{
            Country country1=new Country( 0.85, 7.2, 45.5, 8.1, 7.9,"Country", "Botswana", "Mostly desert covering the country.");
            //validate data
            country1.validCommon();
            myEnvironmentData.add(country1);
            System.out.println(country1.getName()+" was added.");

            City city1=new City(32.5, 6.8, 25.3, 65.2,"City", "Tehran", "Capital city with water availability issues.");
            //validate data
            city1.validate();
            
            Habitat h1=new Habitat(0.99, 8.5, 89, 8.3, 8.9,"Habitat", "Bogs of Allen", "Large raised bog.");
            //validate data
            h1.validate();
            
            //get specific data at position 2 for example
            System.out.println("At position 2 there is \n"+myEnvironmentData.get(2));
            //alter existing data
            City cUpdate=(City)myEnvironmentData.get(2);//cast the data to City to get accsess to methods
            cUpdate.setWaterQualityIndex(85);
            //view updated Environment Data
            System.out.println("Update Environment Data  \n"+myEnvironmentData.get(2));
            myEnvironmentData.remove(1);
            System.out.println("Deleted Environment Data at position 1");
            
            //remove EnvironmentData
            
        //catch and display message for any failed validation
        }catch (IllegalArgumentException e) {
            System.out.println("Validation errors "+e.getMessage());
        }
            
            
    }

}
