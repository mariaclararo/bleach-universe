package br.edu.unifei.ecot12.bleach;

public class Kido extends Ability{
    private String type;
    private int level;
    private boolean requiresIncantation;
    private String affectedArea;
    public Kido(SkillCategory skillCategory){super(skillCategory);}
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public boolean isRequiresIncantation() {
        return requiresIncantation;
    }
    public void setRequiresIncantation(boolean requiresIncantation) {
        this.requiresIncantation = requiresIncantation;
    }
    public String getAffectedArea() {
        return affectedArea;
    }
    public void setAffectedArea(String affectedArea) {
        this.affectedArea = affectedArea;
    }
    
}
