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
public class EncounterDirectory {

    private ArrayList<Encounter> encounter;

    public ArrayList<Encounter> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.encounter = encounter;
    }

    public EncounterDirectory(ArrayList<Encounter> encounter) {
        this.encounter = encounter;
    }

}
