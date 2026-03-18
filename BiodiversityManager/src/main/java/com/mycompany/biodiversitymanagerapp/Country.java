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
public class Country extends BiodiversityManager implements Serializable {
    //variable
    private double biodiversityIndex, airQualityIndex, treeCoveragePercentage, soilQualityIndex, waterQualityIndex; 
    
    //overloaded constructor sets Country fields and calls the superclass constructor
    public Country(double biodiversityIndex, double airQualityIndex, double treeCoveragePercentage, double soilQualityIndex, double waterQualityIndex, String scope, String name, String description) {
        super(scope, name, description);
        this.biodiversityIndex = biodiversityIndex;
        this.airQualityIndex = airQualityIndex;
        this.treeCoveragePercentage = treeCoveragePercentage;
        this.soilQualityIndex = soilQualityIndex;
        this.waterQualityIndex = waterQualityIndex;
    }
    
    //setters

    public void setBiodiversityIndex(double biodiversityIndex) {
        this.biodiversityIndex = biodiversityIndex;
    }

    public void setAirQualityIndex(double airQualityIndex) {
        this.airQualityIndex = airQualityIndex;
    }

    public void setTreeCoveragePercentage(double treeCoveragePercentage) {
        this.treeCoveragePercentage = treeCoveragePercentage;
    }

    public void setSoilQualityIndex(double soilQualityIndex) {
        this.soilQualityIndex = soilQualityIndex;
    }

    public void setWaterQualityIndex(double waterQualityIndex) {
        this.waterQualityIndex = waterQualityIndex;
    }
    
    //getters

    public double getBiodiversityIndex() {
        return biodiversityIndex;
    }

    public double getAirQualityIndex() {
        return airQualityIndex;
    }

    public double getTreeCoveragePercentage() {
        return treeCoveragePercentage;
    }

    public double getSoilQualityIndex() {
        return soilQualityIndex;
    }

    public double getWaterQualityIndex() {
        return waterQualityIndex;
    }
    
    //error handling for biodiversity index 
    public void validBiodiversityIndex(){
        if(biodiversityIndex<0 || biodiversityIndex>1){
            throw new IllegalArgumentException("Biodiversity Index can only be between 0 and 1");
        }
    }
    
    //error handling for air quality index
    public void validAirQualityIndex(){
        if(airQualityIndex<0 || airQualityIndex>10){
            throw new IllegalArgumentException("Air Quality  Index can only be between 0 and 10");
        }
    }
    
    //error handling for treeCoveragePercentage
    public void validTreeCoveragePercentage(){
        if(treeCoveragePercentage<0 || treeCoveragePercentage>100){
            throw new IllegalArgumentException("Tree Coverage Percentage can only be between 0 and 100");
        }
    }
    
    //error handling for SoilQualityIndex
    public void validSoilQualityIndex(){
        if(soilQualityIndex<0 || soilQualityIndex>1){
            throw new IllegalArgumentException("Soil Quality Index can only be between 0 and 1");
        }
    }
    
    //error handling for WaterQualityIndex
    public void validWaterQualityIndex(){
        if(waterQualityIndex<0 || waterQualityIndex>100){
            throw new IllegalArgumentException("Water Quality Index can only be between 0 and 100");
        }
    }
    
    //override to onto the method Country variables
    @Override
    public String printDetails(){
        return super.printDetails()+"\nBiodiversity index: "+biodiversityIndex+"\nAir quality index: "+airQualityIndex+"Tree coverage percentage: "+
                treeCoveragePercentage+"\nSoil quality index: "+soilQualityIndex+"\nWater quality index: "+waterQualityIndex;
    }
}
