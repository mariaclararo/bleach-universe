package br.edu.unifei.ecot12.bleach;

public class Defense implements SkillCategory{
    private int reduceDemage;
    @Override
    public void applyEffect(Creature c)
    {
        c.setDefense(c.getDefense() + reduceDemage);
    }
    public int getReduceDemage() {
        return reduceDemage;
    }
    public void setReduceDemage(int reduceDemage) {
        this.reduceDemage = reduceDemage;
    }
    
}
