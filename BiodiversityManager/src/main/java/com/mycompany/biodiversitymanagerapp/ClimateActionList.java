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
//implementation for Doubly Linked List ClimateActionList
public class ClimateActionList implements ClimateActionInterface, Serializable {

    //variables
    private CANode head, last, currCANode;
    private int iSize;

    //default constructor set ClimateActionList fields
    ClimateActionList() {
        head = null;
        last = null;
        currCANode = head;
        iSize = 0;
    }

    @Override
    public void add(int iPosition, Object data) {
        CANode newNode = new CANode(data, null, null);
        //when the list is empty
        if (iSize == 0) {
            head = newNode;
            last = newNode;
        } //add newNode to the first position
        else if (iPosition == 1) {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else if (iPosition == iSize + 1) {
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;

        } else {
            //insert a newNode in the middle of the list at a specific position
            setCurrent(iPosition);
            newNode.setNext(currCANode);
            CANode prevCANode = currCANode.getPrev();
            newNode.setPrev(prevCANode);
            prevCANode.setNext(newNode);
            currCANode.setPrev(newNode);
        }
        //increment list size when new CANode is added
        iSize += 1;
    }

    //get a CANode at a specific position
    @Override
    public Object get(int iPosition) {
        //get the position of CANode
        setCurrent(iPosition);
        return currCANode;
    }

    //move to next CANode
    @Override
    public Object next() {
        //prevents moving if list is empty and moving past the list
        if (currCANode == null) {
            return null;
        }
        if (currCANode.getNext() != null) {
            currCANode = currCANode.getNext();
        }
        return currCANode.getData();
    }

    //move to previous CANode
    @Override
    public Object prev() {
        //prevents moving if list is empty and moving past the list
        if (currCANode == null) {
            return null;
        }
        if (currCANode.getPrev() != null) {
            currCANode = currCANode.getPrev();
        }
        return currCANode.getData();

    }

    //remove a CANode at a particular position
    @Override
    public void remove(int iPosition) {
        //ensures the list isn't empty
        if (iSize > 0) {
            if (iSize == 1) {
                head = null;
                last = null;
            } //remove head, head becomes the next CANode,
            else if (iPosition == 1) {
                head = head.getNext();
                head.setPrev(null);
                //remove the last CANode, last becomes previous CANode
            } else if (iPosition == iSize) {
                last = last.getPrev();
                last.setNext(null);
                //remove an element in the middle of the list
            } else {
                //set the current CANode position
                setCurrent(iPosition);
                //find prevCANode
                CANode prevCANode = currCANode.getPrev();

                //find nextCANode
                CANode nextCANode = currCANode.getNext();

                prevCANode.setNext(nextCANode);
                nextCANode.setPrev(prevCANode);
            }
            //decrement list size once a CANode is removed
            iSize -= 1;
        } else {
            System.out.print("There are no CANode's with climate action data to delete");
        }

    }

    //return the size of Doubly Linked List ClimateActionList
    @Override
    public int size() {
        return iSize;
    }

    //returns false if the Doubly Linked List ClimateActionList is empty
    @Override
    public boolean isEmpty() {
        return (iSize == 0);
    }

    //method to set the current position of a CANode
    public void setCurrent(int iPosition) {
        //starts from head the first position
        currCANode = head;
        //iterate through Doubly Linked List ClimateActionList until you get to iPosition
        for (int iCount = 1; iCount < iPosition; iCount++) {
            currCANode = currCANode.getNext();
        }
    }

    @Override
    public String printList() {
        //empty String to store Climate Action data
        String items = "";

        //iterate over Doubly Linked List ClimateActionList and print all Climate action data stored in each CANode
        for (CANode tempCANode = head; tempCANode != null; tempCANode = tempCANode.getNext()) {
            String tempItem = (tempCANode.getData().toString());
            items = items + tempItem + "\n";
        }
        return items;

    }

    //print theDoubly Linked List ClimateActionList backwards
//    @Override
//    public String printListBwd(){
//        String items="";
//        //start from last CANode to first CANode
//        for(CANode tempCANode=last; tempCANode!=null; tempCANode=tempCANode.getPrev()){
//            String tempItem=tempCANode.getData().toString();
//            items=items+tempItem+"\n";
//            
//        }
//        return items;
//        
//    }
}
