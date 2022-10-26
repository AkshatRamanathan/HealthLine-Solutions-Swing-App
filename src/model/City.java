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
public class City {

    private String cityName;
    private String pinCode;
    private ArrayList<Community> communityDirectory;

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    public void addCommunity(Community comunity) {
        this.communityDirectory.add(comunity);
    }

    public void deleteComunity(Community comunity) {
        this.communityDirectory.remove(comunity);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public City(String cityName, String pinCode) {
        this.cityName = cityName;
        this.pinCode = pinCode;
        this.communityDirectory = new ArrayList<>();
    }
    
   public City() {
        
    }

}
