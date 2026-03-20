package br.edu.unifei.ecot12.bleach;

public class Special extends Ability{
    private String specialEffect;
    public Special(SkillCategory skillCategory){super(skillCategory);}
    public String getSpecialEffect() {
        return specialEffect;
    }
    public void setSpecialEffect(String specialEffect) {
        this.specialEffect = specialEffect;
    }
    
}
