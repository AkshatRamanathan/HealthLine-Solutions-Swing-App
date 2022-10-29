/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author akshb
 */
public class Doctor extends Person {

    private Hospital hospitalName;

    public Hospital getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(Hospital hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    @Override
    public String toString() {
        return this.getHospitalName().getHospitalName().toString();
    }

}
