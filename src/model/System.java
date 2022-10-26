/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author akshb
 */
public class System {

    private ArrayList<City> rootCityDirectory;
    private ArrayList<Hospital> rootHospitalDirectory;

    public System() {
        this.rootCityDirectory = new ArrayList<>();
        this.rootHospitalDirectory = new ArrayList<>();
        populateCities();
        populateHospitals();

    }

    public void addRootCity(City city) {
        this.rootCityDirectory.add(city);
    }

    public void addRootHospital(Hospital hospital) {
        this.rootHospitalDirectory.add(hospital);
    }

    public void deleteRootCity(City city) {
        this.rootCityDirectory.remove(city);
    }

    public void deleteRootHospital(Hospital hospital) {
        this.rootHospitalDirectory.remove(hospital);
    }

    public ArrayList<City> getRootCityDirectory() {
        return rootCityDirectory;
    }

    public void setRootCityDirectory(ArrayList<City> rootCityDirectory) {
        this.rootCityDirectory = rootCityDirectory;
    }

    public ArrayList<Hospital> getRootHospitalDirectory() {
        return rootHospitalDirectory;
    }

    public void setRootHospitalDirectory(ArrayList<Hospital> rootHospitalDirectory) {
        this.rootHospitalDirectory = rootHospitalDirectory;
    }

    private void populateHospitals() {
        // create 2 hospitals and add to rootHosp array with doctor dir (2), encDir, community, city
    }

    private void populateCities() {
        // create 2 cities and add to rootHosp array with cityName, pincode, communityDir
    }

}
