package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public class SoulSociety extends Dimension{
    private List<String> districts = new ArrayList<>();
    private List<Division> divisions = new ArrayList<>();
    private NormalShinigami captainComander;
    private static SoulSociety instance = new SoulSociety();
    private SoulSociety(){}
    public static SoulSociety getInstance(){return instance;}
    public List<String> getDistricts() {
        return districts;
    }
    public void setDistricts(List<String> districts) {
        this.districts = districts;
    }
    public List<Division> getDivisions() {
        return divisions;
    }
    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }
    public NormalShinigami getCaptainComander() {
        return captainComander;
    }
    public void setCaptainComander(NormalShinigami captainComander) {
        this.captainComander = captainComander;
    }
    
}
