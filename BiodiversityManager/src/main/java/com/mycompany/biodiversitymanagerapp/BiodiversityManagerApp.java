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
        System.out.print("Running");
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
    }
}
