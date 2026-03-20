package br.edu.unifei.ecot12.bleach;

public class Cero extends Ability{
    private String color;
    private int chargeTime;
    private String range;
    public Cero(SkillCategory skillCategory){super(skillCategory);}
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getChargeTime() {
        return chargeTime;
    }
    public void setChargeTime(int chargeTime) {
        this.chargeTime = chargeTime;
    }
    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }
    
}
