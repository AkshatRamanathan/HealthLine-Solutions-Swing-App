/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author akshb
 */
public class Person {

    private String name;
    private String emailId;
    private long phoneNumber;
    private String address;
    private long personId;
    private Community community;
    private String type;

    /**
     *
     * @param name
     * @param emailId
     * @param phoneNumber
     * @param address
     * @param personId
     * @param community
     */
    public Person(String name, String emailId, long phoneNumber, String address, long personId, Community community, String type) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.personId = personId;
        this.community = community;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

}
