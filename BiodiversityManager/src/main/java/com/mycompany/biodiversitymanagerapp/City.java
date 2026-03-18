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
    private double urbanHeatTemperature;
    private int airQualityIndex;
    private double treeCoveragePercentage,waterQualityIndex;
    
    //overloaded constructor sets City fields and calls the superclass constructor
    public City(double urbanHeatTemperature, int airQualityIndex, double treeCoveragePercentage, double waterQualityIndex, String scope, String name, String description) {
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

    public void setAirQualityIndex(int airQualityIndex) {
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

    public int getAirQualityIndex() {
        return airQualityIndex;
    }

    public double getTreeCoveragePercentage() {
        return treeCoveragePercentage;
    }

    public double getWaterQualityIndex() {
        return waterQualityIndex;
    }
    
    //error handling for UrbanHeatTemperature
    public void validUrbanHeatTemperature(){
        if(urbanHeatTemperature<0 || urbanHeatTemperature>50){
            throw new IllegalArgumentException("UrbanHeatTemperature must be greater than 1°C and 50°C");
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
    
    //error handling for WaterQualityIndex
    public void validWaterQualityIndex(){
        if(waterQualityIndex<0 || waterQualityIndex>100){
            throw new IllegalArgumentException("Water Quality Index can only be between 0 and 100");
        }
    }
    
    //override to onto the method City variables
    @Override
    public String printDetails() {
        return super.printDetails()+"\nUrban heat temperature: "+urbanHeatTemperature+"\nAir quality index: "+airQualityIndex+"Tree coverage percentage: "+
                treeCoveragePercentage+"\nWater quality index: "+waterQualityIndex;
    }
}
