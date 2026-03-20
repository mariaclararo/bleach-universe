package br.edu.unifei.ecot12.bleach;

public class Human extends Shinigami{
    private boolean spiritualAwareness;
    private int physycalStrength;
    private String occupattion;
    public boolean isSpiritualAwareness() {
        return spiritualAwareness;
    }
    public void setSpiritualAwareness(boolean spiritualAwareness) {
        this.spiritualAwareness = spiritualAwareness;
    }
    public int getPhysycalStrength() {
        return physycalStrength;
    }
    public void setPhysycalStrength(int physycalStrength) {
        this.physycalStrength = physycalStrength;
    }
    public String getOccupattion() {
        return occupattion;
    }
    public void setOccupattion(String occupattion) {
        this.occupattion = occupattion;
    }
    
}
