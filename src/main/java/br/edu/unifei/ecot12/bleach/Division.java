package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public class Division{
    private int number;
    private String specialty;
    private NormalShinigami captain;
    private NormalShinigami lieutenant;
    private List<NormalShinigami> members = new ArrayList<>();
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public NormalShinigami getCaptain() {
        return captain;
    }
    public void setCaptain(NormalShinigami captain) {
        this.captain = captain;
    }
    public NormalShinigami getLieutenant() {
        return lieutenant;
    }
    public void setLieutenant(NormalShinigami lieutenant) {
        this.lieutenant = lieutenant;
    }
    public List<NormalShinigami> getMembers() {
        return members;
    }
    public void setMembers(List<NormalShinigami> members) {
        this.members = members;
    }
    
}
