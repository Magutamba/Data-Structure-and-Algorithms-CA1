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
//implementation of Singly Linked List EnvironmentDataList
public class EnvironmentDataList implements EDInterface, Serializable {

    //variables
    private ENode head, currENode, prevENode;
    private int iSize;

    //default construtor set EnvironmentDataList fields
    public EnvironmentDataList() {
        head = null;
        iSize = 0;
        currENode = null;
        prevENode = null;
    }

    //add method at specific positon in the Singly Linked List EnvironmentDataList
    @Override
    public void add(int iPosition, Object theData) {
        //add data to the head on the first position
        if (iPosition == 1) {
            ENode newENode = new ENode(theData, head);
            head=newENode;
        } else {
            //add newNode to position found by setCurrent method
            setCurrent(iPosition);
            ENode newENode = new ENode(theData, currENode);
            prevENode.setNext(newENode);
        }
        //increment the size counter when a new node is added
        iSize += 1;

    }
    //add data to the last position of the Singly Linked List EnvironmentDataList
    @Override
    public void add(Object theData) {
        ENode newENode= new ENode(theData, null);
        //if there nothing in the list newENode is the head
        if(head==null){
            head=newENode;
        }
        else{
            setCurrent(iSize);
            //set the next position of the current node to the new ENode
            currENode.setNext(newENode);
        }
        iSize+=1;
    }
    //get a particular ENode based on position in Singly Linked List EnvironmentDataList
    @Override
    public Object get(int iPosition){
        setCurrent(iPosition);
        return currENode;
    }
    
    //remove a ENode at a specified position
    @Override
    public void remove(int iPosition) {
        if(iSize==0){
            System.out.println("There is nothing to remove");
        }
        //remove the first ENode
        else if(iPosition==1){
            //the head will now be the next ENode
            head=head.getNext();
        }else{
            //find previous and current ENode
            setCurrent(iPosition);
            //set prevENode next position to be the ENode after the current ENode
            prevENode.setNext(currENode.getNext());
            
        }
        iSize-=1;
        
    }
    //method to see if Singly Linked List EnvironmentDataList is empty
    @Override
    public boolean isEmpty() {
        if(iSize == 0){
            return true;
        }else{
            return false;
        }
    }
    //return size of Singly Linked List EnvironmentDataList
    @Override
    public int size() {
        return iSize;

    }
    //method to set the current position of an ENode
    public void setCurrent(int iPosition) {
        //sets currENode to the node  at iPosition
        //sets prevENode to the node previous to currENode
        int iCount;
        prevENode = null;
        currENode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevENode = currENode;
            currENode = currENode.getNext();

        }
    }
    //method prints out the Environment data stored in the Singly Linked List ENode
    @Override
    public String printList() {
        ENode tempENode=head;
        String items="";
        //while loop continues from first position until it iterates through the whole list
        while(tempENode!=null){
            items+=(tempENode.toString()+"\n");
            tempENode=tempENode.getNext();
        }
        return items;
    }

}




