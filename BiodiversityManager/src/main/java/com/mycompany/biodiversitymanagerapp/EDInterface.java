/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

/**
 *
 * @author moise
 */
//interface for Singly Linked List EnvironmentDataList
public interface EDInterface {
    public void add(int iPosition, Object theData);
    
    public void add(Object theData);
    
    public Object get(int iPosition);
    
    public void remove(int iPosition);
    
    public boolean isEmpty();
    
    public int size();
    
    public String printList();   
}
