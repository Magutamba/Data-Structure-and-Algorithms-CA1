/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

/**
 *
 * @author moise
 */
//interface for Doubly Linked List ClimateActionList
public interface ClimateActionInterface {
    public void add(int iPosition,Object data);
    
    public Object get(int iPosition);
    
    public void remove(int iPosition);
    
    public Object next();
    
    public Object prev();
    
    public int size();
    
    public boolean isEmpty();
    
    public String printList();
    
    //public String printListBwd();
}
