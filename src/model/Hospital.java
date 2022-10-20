/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author akshb
 */
public class Hospital {

    private String hospitalName;
    private String hospitalAddress;
    private EncounterDirectory encounters;
    private Community community;
    private PersonDirectory persons; //only doctors

    public Hospital(String hospitalName, String hospitalAddress, EncounterDirectory encounters, Community community, PersonDirectory persons) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.encounters = encounters;
        this.community = community;
        this.persons = persons;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public EncounterDirectory getEncounters() {
        return encounters;
    }

    public void setEncounters(EncounterDirectory encounters) {
        this.encounters = encounters;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public PersonDirectory getPersons() {
        return persons;
    }

    public void setPersons(PersonDirectory persons) {
        this.persons = persons;
    }

}
