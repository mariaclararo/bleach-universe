package br.edu.unifei.ecot12.bleach;

public class Healing implements SkillCategory{
    private int healAmount;
    @Override
    public void applyEffect(Creature c)
    {
        c.setLife(c.getLife() + healAmount);
    }
    public int getHealAmount() {
        return healAmount;
    }
    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }
    
}
