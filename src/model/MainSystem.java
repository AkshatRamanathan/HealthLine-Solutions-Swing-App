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
    private ArrayList<Community> rootCommunityDirectory;
    private ArrayList<Admin> rootAdminDirectory;

    public MainSystem() {
        this.rootCityDirectory = new ArrayList<>();
        this.rootHospitalDirectory = new ArrayList<>();
        this.rootCommunityDirectory = new ArrayList<>();
        this.rootAdminDirectory = new ArrayList<>();
        populateCommunities();
        populateCities();
        populateHospitals();
        populateAdmins();

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
    
    public ArrayList<Admin> getRootAdminDirectory() {
        return rootAdminDirectory;
    }

    public void setRootAdminDirectory(ArrayList<Admin> rootAdminDirectory) {
        this.rootAdminDirectory = rootAdminDirectory;
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

    public City createCityFn(String cityName, String pincode) {
        City newCity = new City();
        newCity.setCityName(cityName);
        newCity.setPinCode(pincode);
        return newCity;
    }

    public City createCityFn(String cityName, String pincode, String comArea1, String comDistrict1) {
        City newCity = new City();
        newCity.setCityName(cityName);
        newCity.setPinCode(pincode);
        ArrayList<Community> newCommDirectory = new ArrayList<>();
        newCity.setCommunityDirectory(newCommDirectory);
        if ("Toronto".equals(cityName)) {
            newCommDirectory.add(rootCommunityDirectory.get(0));
            newCommDirectory.add(rootCommunityDirectory.get(1));
        } else {
            newCommDirectory.add(rootCommunityDirectory.get(2));
            newCommDirectory.add(rootCommunityDirectory.get(3));
        }
        return newCity;
    }

    public Doctor createDoctorFn(String name, String emailId, long phoneNumber, UUID personId, Community community, House house, City city, Hospital hospitalName) {
        Doctor newPerson = new Doctor();
        newPerson.setName(name);
        newPerson.setEmailId(emailId);
        newPerson.setPhoneNumber(phoneNumber);
        newPerson.setPersonId(personId);
        newPerson.setCommunity(community);
        newPerson.setHouse(house);
        newPerson.setCity(city);
        newPerson.setHospitalName(hospitalName);
        return newPerson;
    }

    public Patient createPatientFn(String name, String emailId, long phoneNumber, UUID personId, Community community, House house, City city) {
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
    
    public Admin createAdminFn(String name,String emailId,long phoneNumber,UUID personId,Community community,House house,City city, String type){
        Admin newAdmin = new Admin();
        newAdmin.setName(name);
        newAdmin.setEmailId(emailId);
        newAdmin.setPhoneNumber(phoneNumber);
        newAdmin.setPersonId(personId);
        newAdmin.setCommunity(community);
        newAdmin.setHouse(house);
        newAdmin.setCity(city);
        newAdmin.setType(type);
        return newAdmin;
    }

    public Encounter createEncounterFn(Doctor doctorEnc, Patient patientEnc) {
        Encounter newEnc = new Encounter();
        newEnc.setPatient(patientEnc);
        newEnc.setDoctor(doctorEnc);
        // not adding vital signs for now
        return newEnc;
    }

    private void populateCities() {
        City newCity1 = createCityFn("Toronto", "M4X 1W5", "Power St", "Brampton");
        City newCity2 = createCityFn("Montreal", "R4X 1W5", "A1", "D1");
        this.rootCityDirectory.add(newCity1);
        this.rootCityDirectory.add(newCity2);
    }

    private void populateHospitals() {
//      HOSPITAL 1
        Hospital newHospital = new Hospital();
        newHospital.setHospitalName("Alpha Hospital");
        City hospitalCity = rootCityDirectory.get(0);
        newHospital.setHospitalCity(hospitalCity);

        // community
        Community newCommunity = rootCommunityDirectory.get(0);
        newHospital.setHospitalCommunity(newCommunity);

        // doctor Dir
        DoctorDirectory newDoctorDirectory = new DoctorDirectory();
        newHospital.setDoctors(newDoctorDirectory);

        Community doc1Community = rootCommunityDirectory.get(0);
        House doc1House = createHouseFn(101,"Main s ");
        City doc1City = rootCityDirectory.get(0);
        

        Doctor doctorObj1 = createDoctorFn("Dr Paul", "paul.dr@gmail.com", 1234567890, UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24f4c"), doc1Community, doc1House, doc1City, newHospital);


        Community doc2Community = rootCommunityDirectory.get(1);
        House doc2House = createHouseFn(301,"DDD");
        City doc2City = rootCityDirectory.get(1);

        Doctor doctorObj2 = createDoctorFn("Dr Henry", "henry.dr@gmail.com", 452167890, UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24f4d"), doc2Community, doc2House, doc2City, newHospital);

        newDoctorDirectory.addDoctor(doctorObj1);
        newDoctorDirectory.addDoctor(doctorObj2);

//        -------------------------------------HOSPITAL 2-------------------------------------
        Hospital newHospital2 = new Hospital();
        newHospital2.setHospitalName("Global Hospital");
        // city
        City hospitalCity2 = rootCityDirectory.get(1);
        newHospital2.setHospitalCity(hospitalCity2);

        // community
        Community newCommunity2 = rootCommunityDirectory.get(2);
        newHospital2.setHospitalCommunity(newCommunity2);

        // doctor Dir
        DoctorDirectory newDoctorDirectory2 = new DoctorDirectory();
        newHospital2.setDoctors(newDoctorDirectory2);

//        Community doc3Community = createCommunityFn("XYZ St", "GMA");
        Community doc3Community = rootCommunityDirectory.get(2);
        House doc1House2 = createHouseFn(101,"Main s ");
        City doc3City = rootCityDirectory.get(1);

        Doctor doctorObj3 = createDoctorFn("Dr Vidhya", "vidhya.dr@gmail.com", 554567890, UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24f5c"), doc3Community, doc1House2, doc3City, newHospital2);

//        Community doc4Community = createCommunityFn("BBB St", "Uptown");
        Community doc4Community = rootCommunityDirectory.get(3);
         House doc2House2 = createHouseFn(301,"DDD");
        City doc4City = rootCityDirectory.get(1);

        Doctor doctorObj4 = createDoctorFn("Dr Nandhini", "nandhini.dr@gmail.com", 772167890, UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24f5d"), doc4Community, doc2House2, doc4City, newHospital2);

        newDoctorDirectory2.addDoctor(doctorObj3);
        newDoctorDirectory2.addDoctor(doctorObj4);

        this.rootHospitalDirectory.add(newHospital);
        this.rootHospitalDirectory.add(newHospital2);

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

    private void populateCommunities() {
        //toronto
        Community comm1 = new Community("Sherbourne St", "GTA");
        Community comm2 = new Community("AAA St", "Downtown");
        //montreal
        Community comm3 = new Community("XYZ St", "GMA");
        Community comm4 = new Community("BBB St", "Uptown");

        this.rootCommunityDirectory.add(comm1);
        this.rootCommunityDirectory.add(comm2);
        this.rootCommunityDirectory.add(comm3);
        this.rootCommunityDirectory.add(comm4);
    }
    
    private void populateAdmins() {
        Community adminCommunity = createCommunityFn("Sherbourne Admin St","GTA");
        House adminHouse = createHouseFn(101,"Main s ");
        City adminCity = createCityFn("Toronto","M4X ZZZ");
        
        Admin sysAdmin = createAdminFn("sysPerson","adminsystem@gmail.com",987654321,UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24aaa"),adminCommunity,adminHouse,adminCity, "System Admin");
        Admin hospAdmin = createAdminFn("hosPerson","adminhospital@gmail.com",987654321,UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24bbb"),adminCommunity,adminHouse,adminCity, "Hospital Admin");
        Admin commAdmin = createAdminFn("commPerson","admincommunity@gmail.com",987654321,UUID.fromString("5fc03087-d265-11e7-b8c6-83e29cd24ccc"),adminCommunity,adminHouse,adminCity, "Community Admin");
        
        this.rootAdminDirectory.add(sysAdmin);
        this.rootAdminDirectory.add(hospAdmin);
        this.rootAdminDirectory.add(commAdmin);
    }

}
