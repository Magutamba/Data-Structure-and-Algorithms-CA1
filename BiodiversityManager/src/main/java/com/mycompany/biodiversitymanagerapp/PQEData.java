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
//code defines format of a Priority Environment Data, from the Priority Queue PQEnvironment

public class PQEData  implements Serializable {
    //variables
    private int iKey;
    private Object data;
    
    //default constructor sets PQEData fields
        public PQEData(int inPriority, Object inData) {
            this.iKey = inPriority;
            this.data = inData;
        }
        
           //setters
        public void setiKey(int inPriority) {
            this.iKey = iKey;
        }
        public void setData(Object data) {
            this.data = data;
        }

        //getters
        public int getiKey() {
            return iKey;
        }

        public Object getData() {
            return data;
        }
        
        //turn the data into String
        public String toString(){
           return data.toString();
        }
    
}

