package br.edu.unifei.ecot12.bleach;

public class Buff extends Ability{
    private String affectedAtribute;
    public Buff(SkillCategory skillCategory){super(skillCategory);}
    public String getAffectedAtribute() {
        return affectedAtribute;
    }
    public void setAffectedAtribute(String affectedAtribute) {
        this.affectedAtribute = affectedAtribute;
    }
    
}
