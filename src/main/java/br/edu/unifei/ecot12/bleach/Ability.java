package br.edu.unifei.ecot12.bleach;

public abstract class Ability {
    private String name;
    private int reiatsuCost;
    private SkillCategory skillCategory;
    public Ability(SkillCategory skillCategory){this.skillCategory = skillCategory;}
    public void execute(Creature c)
    {
        skillCategory.applyEffect(c);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getReiatsuCost() {
        return reiatsuCost;
    }
    public void setReiatsuCost(int reiatsuCost) {
        this.reiatsuCost = reiatsuCost;
    }
    public SkillCategory getSkillCategory() {
        return skillCategory;
    }
    public void setSkillCategory(SkillCategory skillCategory) {
        this.skillCategory = skillCategory;
    }
    
}
