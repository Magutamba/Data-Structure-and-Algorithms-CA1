/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

/**
 *
 * @author moise
 */
//interface for Priority Queue PQEnvironment
public interface PEInterface{
    public void enqueue(int iPriorityKey, Object theData);
    
    public int size();
    
    public boolean isEmpty();
    
    public Object frontData();
    
    public Object dequeue();
    
    public  String printPEQueue();
    
    public Object findByPriority(int inewPriority);
}
