/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author akshb
 */
class VitalSigns {

    private int temperature;
    private int bloodPressure;
    private int pulse;
    private Date dateOfVitalEntry;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public Date getDateOfVitalEntry() {
        return dateOfVitalEntry;
    }

    public void setDateOfVitalEntry(Date dateOfVitalEntry) {
        this.dateOfVitalEntry = dateOfVitalEntry;
    }

    public VitalSigns(int temperature, int bloodPressure, int pulse, Date dateOfVitalEntry) {
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulse = pulse;
        this.dateOfVitalEntry = dateOfVitalEntry;
    }

}
