/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biodiversitymanagerapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author moise
 */
public class FileManagement implements FileManagementInterface {

    //save method to save ADT data
    @Override
    public void save(Object obj, String fileName) {
        try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            //write data to file
            oStream.writeObject(obj);
            //catch error if there an issue saving file
        } catch (IOException e) {
            throw new RuntimeException("Failed to save file " + fileName + e.getMessage());
        }
    }

    //load meathod load the files with ADT data, using Java generic type to allow all ADT's to be saved,
    //<T> preserve the type when called
    //adt variable is returned if load fails so it can continue safely
    @SuppressWarnings("unchecked")//stop Java from warning me
    @Override
    public <T> T load(String fileName, T adt) {
        try (ObjectInputStream oStream = new ObjectInputStream(new FileInputStream(fileName))) {
            //read object from file
            return (T) oStream.readObject();

        } catch (FileNotFoundException e) {
            
            System.out.println("The data file " + fileName+", was not found. Save before loading a file.");
            return adt;
        
        }catch (ClassNotFoundException e) {
            System.out.println("An error occurred while reading the file. Ensure the class matches the saved data");
            return adt;
        } catch (IOException e) {
            //System.out.println("An error occurred while reading the file." + e.getMessage());
            return adt;

        }
    }
    
}
