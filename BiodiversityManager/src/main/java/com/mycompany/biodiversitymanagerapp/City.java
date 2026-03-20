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
public class City extends BiodiversityManager implements Serializable {
    //variable
    private double urbanHeatTemperature, airQualityIndex;
    private double treeCoveragePercentage,waterQualityIndex;
    
    //overloaded constructor sets City fields and calls the superclass constructor
    public City(double urbanHeatTemperature, double airQualityIndex, double treeCoveragePercentage, double waterQualityIndex, String scope, String name, String description) {
        super(scope, name, description);
        this.urbanHeatTemperature = urbanHeatTemperature;
        this.airQualityIndex = airQualityIndex;
        this.treeCoveragePercentage = treeCoveragePercentage;
        this.waterQualityIndex = waterQualityIndex;
    }
    
     //setters

    public void setUrbanHeatTemperature(double urbanHeatTemperature) {
        this.urbanHeatTemperature = urbanHeatTemperature;
    }

    public void setAirQualityIndex(double airQualityIndex) {
        this.airQualityIndex = airQualityIndex;
    }

    public void setTreeCoveragePercentage(double treeCoveragePercentage) {
        this.treeCoveragePercentage = treeCoveragePercentage;
    }

    public void setWaterQualityIndex(double waterQualityIndex) {
        this.waterQualityIndex = waterQualityIndex;
    }
    
    //getters

    public double getUrbanHeatTemperature() {
        return urbanHeatTemperature;
    }

    public double getAirQualityIndex() {
        return airQualityIndex;
    }

    public double getTreeCoveragePercentage() {
        return treeCoveragePercentage;
    }

    public double getWaterQualityIndex() {
        return waterQualityIndex;
    }
    
    //error handling for treeCoveragePercentage
    public void validTreeCoveragePercentage(){
        if(treeCoveragePercentage<0 || treeCoveragePercentage>100){
            throw new IllegalArgumentException("Tree Coverage Percentage can only be between 0 and 100");
        }
    }
    
    //error handling for WaterQualityIndex
    public void validWaterQualityIndex(double waterQualityIndex){
        if(waterQualityIndex<0 || waterQualityIndex>100){
            throw new IllegalArgumentException("Water Quality Index can only be between 0 and 100");
        }
    }
    //override with City specific validation
    @Override
    protected void validate(){
        //error handling for UrbanHeatTemperature
        if(urbanHeatTemperature<0 || urbanHeatTemperature>50){
            throw new IllegalArgumentException("UrbanHeatTemperature must be greater than 1°C and 50°C");
        }
        
        //error handling for air quality index
        if(airQualityIndex<0 || airQualityIndex>10){
            throw new IllegalArgumentException("Air Quality  Index can only be between 0 and 10");
        }
        
        //error handling for treeCoveragePercentage
        if(treeCoveragePercentage<0 || treeCoveragePercentage>100){
            throw new IllegalArgumentException("Tree Coverage Percentage can only be between 0 and 100");
        }
        
        //error handling for WaterQualityIndex
        if(waterQualityIndex<0 || waterQualityIndex>100){
            throw new IllegalArgumentException("Water Quality Index can only be between 0 and 100");
        }
    }
    
    @Override
    public String toString() {
        //override to onto the method City variables
        return super.printDetails()+"\nUrban heat temperature: "+urbanHeatTemperature+"\nAir quality index: "+airQualityIndex+"\nTree coverage percentage: "+
                treeCoveragePercentage+"\nWater quality index: "+waterQualityIndex;
    }
}
