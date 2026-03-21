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
// code to make an ClimateAction node
public class CANode  implements Serializable {
    //variables
    private Object data;
    private CANode next,prev;
    
    //overloaded constructor set CANode fiels

    public CANode(Object inData, CANode inNext, CANode inPrevious) {
        this.data = inData;
        this.next = inNext;
        this.prev = inPrevious;
    }
    
    //setters
    public void setData(Object inData) {
        this.data = inData;
    }

    public void setNext(CANode inNext) {
        this.next = inNext;
    }

    public void setPrev(CANode inPrevious) {
        this.prev = inPrevious;
    }
    
    //getters
    public Object getData() {
        return data;
    }

    public CANode getNext() {
        return next;
    }

    public CANode getPrev() {
        return prev;
    }  
    
}
