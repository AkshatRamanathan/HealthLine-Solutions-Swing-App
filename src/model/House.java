/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author akshb
 */
public class House {

    private int houseNumber;
    private String roadName;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getRoadName() {
        return roadName;
    }

    public House() {
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public House(int houseNumber, String roadName) {
        this.houseNumber = houseNumber;
        this.roadName = roadName;
    }

}
