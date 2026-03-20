package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public class HuecoMundo extends Dimension{
    private String dominantFaction;
    private static HuecoMundo instance = new HuecoMundo();
    private List<Creature> inhabtants = new ArrayList<>();
    private HuecoMundo(){}
    public static HuecoMundo getInstance(){return instance;}
    public String getDominantFaction() {
        return dominantFaction;
    }
    public void setDominantFaction(String dominantFaction) {
        this.dominantFaction = dominantFaction;
    }
    public List<Creature> getInhabtants() {
        return inhabtants;
    }
    public void setInhabtants(List<Creature> inhabtants) {
        this.inhabtants = inhabtants;
    }
    
}
