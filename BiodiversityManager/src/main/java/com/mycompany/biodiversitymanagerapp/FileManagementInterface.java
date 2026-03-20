/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

/**
 *
 * @author moise
 */
public interface FileManagementInterface {
    public void save(Object obj, String fileName);
    public <T> T load(String fileName , T adt);
    
}
