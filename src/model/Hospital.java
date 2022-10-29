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
    private City hospitalCity;
    private Community hospitalCommunity;
    private EncounterDirectory encounters;
    private DoctorDirectory doctors;

    public String getHospitalName() {
        return hospitalName;
    }

    public Hospital() {
        this.doctors = new DoctorDirectory();
        this.encounters = new EncounterDirectory();
        this.hospitalCity = new City();
        this.hospitalCommunity = new Community();
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public City getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(City hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public Community getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(Community hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

    public EncounterDirectory getEncounters() {
        return encounters;
    }

    public void setEncounters(EncounterDirectory encounters) {
        this.encounters = encounters;
    }

    public DoctorDirectory getDoctors() {
        return doctors;
    }

    public void setDoctors(DoctorDirectory doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return hospitalName;
    }

}
