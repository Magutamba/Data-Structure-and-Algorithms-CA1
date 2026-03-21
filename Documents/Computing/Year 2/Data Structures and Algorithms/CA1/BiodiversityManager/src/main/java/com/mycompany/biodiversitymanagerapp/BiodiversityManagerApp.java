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
        BiodiversityManagerGUI GUI = new BiodiversityManagerGUI();
        GUI.setVisible(true);

        //variable to use FileManagementInterface
        FileManagement fileManager = new FileManagement();

        /*
        EnvironmentData section
         */
        //initialize new Singly Linked List EnvironmentDataList
        EDInterface EnvironmentData = new EnvironmentDataList();
        try {
            //initialize new Country object with values for its variables
            Country country1 = new Country(0.85, 7.2, 45.5, 0.81, 7.9, "Country", "Botswana", "Mostly desert covering the country.");

            //validate data
            country1.validCommon();

            //add EnvironmentData to EnvironmentDataList
            EnvironmentData.add(country1);
            System.out.println("Environment Data " + country1.getName() + " has been added.");

            //initialize new City object with values for its variables
            City city1 = new City(32.5, 6.8, 25.3, 65.2, "City", "Tehran", "Capital city with water availability issues.");

            //validate data
            city1.validate();

            //add EnvironmentData to EnvironmentDataList
            EnvironmentData.add(city1);

            //initialize new Habitat objectwith values for its variables
            Habitat h1 = new Habitat(0.34, 8.5, 89, 0.4, 4, "Habitat", "Niger Delta", "Third Largest river delta in the world");

            //validate data
            h1.validate();
            EnvironmentData.add(h1);

            //get specific Environment data at position 2 for example
            System.out.println("At position 2 there is \n" + EnvironmentData.get(2));

            //alter existing data
            City cUpdate = (City) EnvironmentData.get(2);//cast the data to City to get access to methods
            cUpdate.setWaterQualityIndex(85);

            //view updated Environment Data
            System.out.println("Updated Environment Data  \n" + cUpdate.getName());

            //remove EnvironmentData at position 1
            EnvironmentData.remove(1);
            System.out.println("Deleted Environment Data at position 1");
            
            System.out.println("EnvironmentDataList:");

            //display updated EnvironmentDataList
            System.out.println(EnvironmentData.printList() + " \n");

            //check if EnvironmentDataist is empyt
            System.out.println(EnvironmentData.isEmpty());

            //catch and display message for any failed validation
        } catch (IllegalArgumentException e) {
            System.out.println("Validation errors " + e.getMessage());
        }

        System.out.println("*******************************");

        System.out.println("PriorityEnvironment Section");

        /*
        myPriorityEnvironment Section
         */
        //initialize a new Priority queue PQEnvironment
        PEInterface myPriorityEnvironment = new PQEnvironment();
        try {
            // initialize new myPriorityEnvironment object with values for its variables
            PriorityEnvironment peq1 = new PriorityEnvironment(
                    "Ever rising water levels",
                    "Country", "Fiji", "Island nation with little resources and necessary biodiversity.");
            //validate data
            peq1.validCommon();

            //enqueue  Priority Environment at priority of 1
            myPriorityEnvironment.enqueue(1, peq1);

            //cast the data to BiodiversityManager to get access to methods
            BiodiversityManager add1 = (BiodiversityManager) myPriorityEnvironment.frontData();

            //get the Priority Environment with the highest priority
            System.out.println("Added to the queue \n" + add1);

            //initialize new myPriorityEnvironment objectwith values for its variables
            PriorityEnvironment peq2 = new PriorityEnvironment(
                    "Second largest rainforest in the world, second longest river in Africa, megadiverse region.",
                    "Country", "Democratic Republic of Congo",
                    "Deforestation is threatening animals, livelihoods and the country's immense biodiversity");

            //validate data
            peq2.validCommon();

            //enqueue Priority Environment at priority of 2
            myPriorityEnvironment.enqueue(2, peq2);

            //cast the data to BiodiversityManager to get access to methods
            //check if the myPriorityEnvironment with priority 2 was add using findByPriority method which find Priority Environment based on priority
            BiodiversityManager search1 = (BiodiversityManager) myPriorityEnvironment.findByPriority(2);

            if (search1 != null) {

                System.out.println("The PriorityEnvironment " + search1.getName() + " has been added:"+search1);

            }

            //dequeue Priority Environment with
            BiodiversityManager delete1 = (BiodiversityManager) myPriorityEnvironment.dequeue();

            System.out.print("Deleted PriorityEnvironment with highest Priority \n" + delete1);

            //get the environment with the highest priority
            BiodiversityManager h1 = (BiodiversityManager) myPriorityEnvironment.frontData();

            System.out.println("The priority environment" + h1+" now as the highest priority.");

            //Display all Priority Environments stored
            System.out.println("The Priority Environments stored: " + myPriorityEnvironment.printPEQueue());

            //check if queue is empty
            System.out.println(myPriorityEnvironment.isEmpty());

        } //catch and display message for any failed validation //catch and display message for any failed validation
        catch (IllegalArgumentException e) {
            System.out.println("Validation errors " + e.getMessage());
        }
        System.out.println("*******************************");

        System.out.println("ClimateAction Section");

        /*
        ClimateAction Section
         */
        //initialize new Doubly Linked List EnvironmentDataList 
        ClimateActionInterface myClimateAction = new ClimateActionList();

        try {
            //initialize new ClimateAction object with values for its variables
            ClimateAction ca1 = new ClimateAction("Rewilding and pollinator friendly parks",
                    "City", "Limrick", "Improvement in habitats biodiversity.");

            //validate data
            ca1.validCommon();

            //add ClimateAction data at index 1
            myClimateAction.add(1, ca1);

            System.out.println("Climate Action data added at index 1 in ClimateActionList");

            //initialize new ClimateAction object with values for its variables
            ClimateAction ca2 = new ClimateAction("Reintroduction of 2500 species",
                    "Habitat", "Zinave National Park", "20% growth annual growth in wildlife.");

            //validate data
            ca2.validCommon();

            //add ClimateAction data at index 2
            myClimateAction.add(2, ca2);

            System.out.println("Climate Action data added at index 2 in ClimateActionList");

            //get ClimateAction data at index 2
            System.out.println("Climate Action data at index 2 is: \n" + myClimateAction.get(2));

            //navigation to next ClimateAction data in the list using next
            System.out.println("Next Climate Action data is: \n" + myClimateAction.next());

            //navigation to next ClimateAction data in the list using next
            System.out.println("Previous Climate Action data is: \n" + myClimateAction.prev());

            //delete Climate Action data at aspecific position
            myClimateAction.remove(1);
            System.out.println("ClimateAction data at position 1 as been removed.");

            //display all Climate Action Data
            System.out.println(myClimateAction.printList());

            System.out.println(myClimateAction.isEmpty());

        }//catch and display message for any failed validation//catch and display message for any failed validation
        catch (IllegalArgumentException e) {
            System.out.println("Validation errors " + e.getMessage());
        }

        System.out.println("**********************");
        System.out.println("File Management Section ");

        //
        try {
            //initialize new Doubly Linked List EnvironmentDataList 
            ClimateActionInterface cData = new ClimateActionList();
            //test data to save
            ClimateAction cla = new ClimateAction("Cleaning up oil spills", "City", "Harcourt",
                    "Slow progress has been made, wildlife and biodiversity suffering greatly.");

            //validate data
            cla.validCommon();

            //add ClimateAction data at index 2
            cData.add(1, cla);

            //save to file
            fileManager.save(cData, "TestFileManagement.dat");
            
             System.out.println("Data in ClimateActionList has been saved to 'TestFileManagement.dat' file");

            //load ClimateActionList from file, new ClimateActionList means if the file exist load it otherwise default to a new Doubly Linked List ClimateActionList
            ClimateActionInterface loadedData = fileManager.load("TestFileManagement.dat", new ClimateActionList());

            System.out.println("New ClimateActionList has been loaded from 'TestFileManagement.dat' file");

            //test if data as been loaded
            System.out.print(loadedData.printList());
        } //catch Exceptions 
        catch (Exception e) {
            System.out.println("An issue occurred " + e.getMessage());
        }

    }
}
