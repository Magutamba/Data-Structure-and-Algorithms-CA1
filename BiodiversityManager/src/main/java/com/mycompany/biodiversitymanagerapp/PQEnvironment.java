/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author moise
 */
//implementation of Priority Queue PQEnvironment 
public class PQEnvironment implements PEInterface, Serializable {

    //declare and instantiate array list
    private ArrayList<PQEData> thePEQueue;

    //method to use ArrayList
    public PQEnvironment() {
        thePEQueue = new ArrayList<PQEData>();
    }

    //new data is given a key and added at the right position based on priority
    @Override
    public void enqueue(int inPriorityKey, Object theData) {
        int index;
        PQEData newData = new PQEData(inPriorityKey, theData);

        index = findInsertPosition(inPriorityKey);
        //lowest priority goes at the end
        if (index == size()) {
            thePEQueue.add(newData);
        } else {
            thePEQueue.add(index, newData);
        }
    }
    
    //get the PEQData with the highest priority
    @Override
    public Object frontData(){
        if(!thePEQueue.isEmpty()){
            return thePEQueue.get(0).getData();
        }else{
            return null;
        }
    }

    //remove the data with the highest priority
    @Override
    public Object dequeue() {
        return thePEQueue.remove(0).getData();
    }

    //method to get size of
    @Override
    public int size() {
        return thePEQueue.size();
    }

    //check if Priority Queue PQEnvironment is empty
    @Override
    public boolean isEmpty() {
        return thePEQueue.isEmpty();
    }
    
    //get based on priority for searchBtn
    @Override
    public Object findByPriority(int inewPriorityKey){
        for(int index=0; index<thePEQueue.size(); index++){
            PQEData curData=thePEQueue.get(index);
            if(curData.getiKey()==inewPriorityKey){
                return curData;
            }
        }
        return null;// if nothing found
        
        
    }

    //find the position to insert data based on the priority key
    private int findInsertPosition(int inewPriorityKey) {
        PQEData curData;
        int index;
        //if the new priority key is greater than currentData's key add new data at a position so it apears first
        for (index = 0; index < thePEQueue.size(); index++) {
            curData = thePEQueue.get(index);
            if (curData.getiKey() < inewPriorityKey) {
                break;
            }
        }
        return index;
    }

    //print the data in the PEQData of the Priority Queue PQEnvironment
    @Override
    public String printPEQueue() {
        PQEData curData;
        //empty string to append with Queue Content
        String msg = "";
        //iterate through Priority Queue PQEnvironment and get each data and it's priority
        for (int iCount = 0; iCount < thePEQueue.size(); iCount++) {
            curData = thePEQueue.get(iCount);
            msg = msg.concat("Priority = " + curData.getiKey() + 
                    "Data = " + curData.getData() + "\n");
        }
        return msg;
    }

}
