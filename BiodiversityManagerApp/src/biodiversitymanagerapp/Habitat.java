/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversitymanagerapp;

import java.io.Serializable;

/**
 *
 * @author moise
 */
public class Habitat extends Country implements Serializable {
    //overloaded constructor
    public Habitat(double biodiversityIndex, double airQualityIndex, double treeCoveragePercentage, double soilQualityIndex, double waterQualityIndex, String scope, String name, String description) {
        super(biodiversityIndex, airQualityIndex, treeCoveragePercentage, soilQualityIndex, waterQualityIndex, scope, name, description);
    }  
}
