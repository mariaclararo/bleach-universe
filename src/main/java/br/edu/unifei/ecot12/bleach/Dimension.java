package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public abstract class Dimension {
    private List<Creature> inhabtants = new ArrayList<>();

    public List<Creature> getInhabtants() {
        return inhabtants;
    }

    public void setInhabtants(List<Creature> inhabtants) {
        this.inhabtants = inhabtants;
    }
    
}
