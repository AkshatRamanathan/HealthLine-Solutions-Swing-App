/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.UUID;

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

     public House createHouseFn(int houseNo, String roadName) {
        House newHouse = new House();
        newHouse.setRoadName(roadName);
        newHouse.setHouseNumber(houseNo);
        return newHouse;
    }
    
    public Community createCommunityFn(String area, String district) {
        Community newCommunity = new Community();
        newCommunity.setAreaName(area);
        newCommunity.setDistrict(district);
        return newCommunity;
    }
    
    public City createCityFn(String cityName, String pincode){
        City newCity = new City();
        newCity.setCityName(cityName);
        newCity.setPinCode(pincode);
        return newCity;
    }
    
    public City createCityFn(String cityName, String pincode, String comArea1, String comDistrict1){
        City newCity = new City();
        newCity.setCityName(cityName);
        newCity.setPinCode(pincode);
        ArrayList<Community> newCommDirectory = new ArrayList<>();
        newCity.setCommunityDirectory(newCommDirectory);
        
        Community newCityCommunity1 = createCommunityFn(comArea1,comDistrict1);
        Community newCityCommunity2 = createCommunityFn("A2","D2");
        
        newCommDirectory.add(newCityCommunity1);
        newCommDirectory.add(newCityCommunity2);
        System.out.println(newCity);
        
        return newCity;
    }
    
    public Doctor createDoctorFn(String name,String emailId,long phoneNumber,UUID personId,Community community,House house,City city){
        Doctor newPerson = new Doctor();
        newPerson.setName(name);
        newPerson.setEmailId(emailId);
        newPerson.setPhoneNumber(phoneNumber);
        newPerson.setPersonId(personId);
        newPerson.setCommunity(community);
        newPerson.setHouse(house);
        newPerson.setCity(city);
        return newPerson;
    }
    
     public Patient createPatientFn(String name,String emailId,long phoneNumber,UUID personId,Community community,House house,City city){
        Patient newPerson = new Patient();
        newPerson.setName(name);
        newPerson.setEmailId(emailId);
        newPerson.setPhoneNumber(phoneNumber);
        newPerson.setPersonId(personId);
        newPerson.setCommunity(community);
        newPerson.setHouse(house);
        newPerson.setCity(city);
        return newPerson;
    }
    
    public Encounter createEncounterFn(Doctor doctorEnc,Patient patientEnc){
        Encounter newEnc = new Encounter();
        newEnc.setPatient(patientEnc);
        newEnc.setDoctor(doctorEnc);
        // not adding vital signs for now
        return newEnc;
    }

    private void populateCities() {
        // create 2 cities and add to rootHosp array with cityName, pincode, communityDir
        City newCity1 = createCityFn("Toronto","M4X 1W5","Power St","Brampton");
        City newCity2 = createCityFn("Montreal","R4X 1W5","A1","D1");
        this.rootCityDirectory.add(newCity1);
        this.rootCityDirectory.add(newCity2);   
    }
    
    private void populateHospitals() {
        // create 2 hospitals and add to rootHosp array with doctor dir (2), encDir, community, city
//        HOSPITAL 1
        Hospital newHospital = new Hospital();
        newHospital.setHospitalName("Alpha Hospital");
        // city
        City hospitalCity = createCityFn("Toronto","M4X 1W5");
        newHospital.setHospitalCity(hospitalCity); 
        
        // community
        Community newCommunity = createCommunityFn("Sherbourne St","GTA");
        newHospital.setHospitalCommunity(newCommunity);
        
        // doctor Dir
        DoctorDirectory newDoctorDirectory = new DoctorDirectory();
        newHospital.setDoctors(newDoctorDirectory);
        Community doc1Community = createCommunityFn("Sherbourne St","GTA");
        // House doc1House = createHouseFn(101,"Main s ");
        City doc1City = createCityFn("Toronto","M4X ZZZ");
        
        Doctor doctorObj1 = createDoctorFn("Dr Paul","paul.dr@gmail.com",1234567890,UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24f4c"),doc1Community,null,doc1City);
        
        Community doc2Community = createCommunityFn("AAA St","Downtown");
        // House doc2House = createHouseFn(301,"DDD");
        City doc2City = createCityFn("Montreal","WW4XZ");
        
        Doctor doctorObj2 = createDoctorFn("Dr Henry","henry.dr@gmail.com",452167890,UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24f4d"),doc2Community,null,doc2City);
        
        newDoctorDirectory.addDoctor(doctorObj1);
        newDoctorDirectory.addDoctor(doctorObj2);
        
        
//        HOSPITAL 2
        Hospital newHospital2 = new Hospital();
        newHospital2.setHospitalName("Global Hospital");
        // city
        City hospitalCity2 = createCityFn("Vancouver","R4X 1W5");
        newHospital2.setHospitalCity(hospitalCity2); 
        
        // community
        Community newCommunity2 = createCommunityFn("Dundas St","Dundas");
        newHospital2.setHospitalCommunity(newCommunity2);
        
        // doctor Dir
        DoctorDirectory newDoctorDirectory2 = new DoctorDirectory();
        newHospital2.setDoctors(newDoctorDirectory2);
        Community doc3Community = createCommunityFn("Sherbourne St","GTA");
        // House doc1House = createHouseFn(101,"Main s ");
        City doc3City = createCityFn("Toronto","M4X ZZZ");
        
        Doctor doctorObj3 = createDoctorFn("Dr Vidhya","vidhya.dr@gmail.com",554567890,UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24f4c"),doc3Community,null,doc3City);
        
        Community doc4Community = createCommunityFn("AAA St","Downtown");
        // House doc2House = createHouseFn(301,"DDD");
        City doc4City = createCityFn("Montreal","WW4XZ");
        
        Doctor doctorObj4 = createDoctorFn("Dr Nandhini","nandhini.dr@gmail.com",772167890,UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24f4d"),doc4Community,null,doc4City);
        
        newDoctorDirectory2.addDoctor(doctorObj3);
        newDoctorDirectory2.addDoctor(doctorObj4);
        
        
        
//        // encounter Dir
//        EncounterDirectory newEncounterDirectory = new EncounterDirectory();
//        newHospital.setEncounters(newEncounterDirectory);
//        // encounter obj
//        // doctor
//        Community docCommunity = createCommunityFn("Sherbourne St","GTA");
//        House docHouse = createHouseFn(101,"Main s ");
//        City docCity = createCityFn("Toronto","M4X ZZZ");
//        
//        Doctor doctorEnc = createDoctorFn("Dr Paul","paul.dr@gmail.com",1234567890,UUID.randomUUID(),docCommunity,docHouse,docCity);
//        // patient
//        Community patientCommunity = createCommunityFn("Metty St","Peram");
//        House patientHouse = createHouseFn(255,"RMK ");
//        City patientCity = createCityFn("Toronto","M4X 1W5");
//        
//        Patient patientEnc = createPatientFn("Devadharshini","deva.n@gmail.com",987654321,UUID.randomUUID(),docCommunity,docHouse,docCity);
//
//        // enc obj
//        Encounter newEncounter = createEncounterFn(doctorEnc,patientEnc); 
//        System.out.println(newEncounter);
//        
//        newEncounterDirectory.addEncounter(newEncounter);
        
        
    }

}
