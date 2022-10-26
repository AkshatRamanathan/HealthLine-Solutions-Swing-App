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
public class MainSystem {

    private ArrayList<City> rootCityDirectory;
    private ArrayList<Hospital> rootHospitalDirectory;

    public MainSystem() {
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
        Hospital newHospital1 = new Hospital();
        newHospital1.setHospitalName("Alpha Hospital");
        
    }
    
    private City getCity1(String cityName, String pincode, String comArea1, String comDistrict1, String comArea2, String comDistrict2){
        City newCity = new City();
        newCity.setCityName(cityName);
        newCity.setPinCode(pincode);
        ArrayList<Community> newCommDirectory = new ArrayList<>();
        newCity.setCommunityDirectory(newCommDirectory);
        
        Community newCityCommunity1 = new Community();
        newCityCommunity1.setAreaName(comArea1);
        newCityCommunity1.setDistrict(comDistrict1);
        
        Community newCityCommunity2 = new Community();
        newCityCommunity2.setAreaName(comArea2);
        newCityCommunity2.setDistrict(comDistrict2);
        
        newCommDirectory.add(newCityCommunity1);
        newCommDirectory.add(newCityCommunity2);
        return newCity;
    }

    private void populateCities() {
        // create 2 cities and add to rootHosp array with cityName, pincode, communityDir
        City newCity1 = getCity1("Toronto","M4X 1W5","Power St","Brampton","Sherbourne St","GTA");
        City newCity2 = getCity1("Montreal","R4X 1W5","A1","D1","A2","D2");
        System.out.println(newCity1);
        this.rootCityDirectory.add(newCity1);
        this.rootCityDirectory.add(newCity2);
        
    }

}
