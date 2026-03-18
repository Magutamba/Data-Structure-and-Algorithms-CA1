/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

/**
 *
 * @author moise
 */
//code to make an Environment data node ENode
public class ENode {
    //variable
    private Object data;
    private ENode next;
    
    //overloaded constructor sets ENode fields

    public ENode(Object inData, ENode inENode) {
        this.data = inData;
        this.next = inENode;
    }
    
    //setter

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(ENode inENode) {
        this.next = inENode;
    }
    
    //getter

    public Object getData() {
        return data;
    }

    public ENode getNext() {
        return next;
    }
    
    // turn data into string
    public String toString(){
        return data.toString();
    }
    
}