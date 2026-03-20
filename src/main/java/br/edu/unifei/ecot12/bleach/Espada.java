package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public class Espada extends Arrancar{
    private int number;
    private String tatooLocation;
    private String aspectOfDeath;
    private List<Hollow> subordinates = new ArrayList<>();
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getTatooLocation() {
        return tatooLocation;
    }
    public void setTatooLocation(String tatooLocation) {
        this.tatooLocation = tatooLocation;
    }
    public String getAspectOfDeath() {
        return aspectOfDeath;
    }
    public void setAspectOfDeath(String aspectOfDeath) {
        this.aspectOfDeath = aspectOfDeath;
    }
    public List<Hollow> getSubordinates() {
        return subordinates;
    }
    public void setSubordinates(List<Hollow> subordinates) {
        this.subordinates = subordinates;
    }
    
}
