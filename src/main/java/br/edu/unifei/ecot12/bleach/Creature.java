package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public abstract class Creature {
    private int life;
    private int defense;
    private int reiatsu;
    private String appearance;
    private String name;
    private boolean alive;
    private int powerLevel;
    private Dimension home;
    private List<Ability> abilities = new ArrayList<>();

    public void useAbility(Ability a, Creature c)
    {
        if(abilities.contains(a))
        {
            a.execute(c);
            this.setReiatsu(this.getReiatsu() - a.getReiatsuCost());
        }
        else System.out.println("The creature doesn't have this ability.");
    }
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getReiatsu() {
        return reiatsu;
    }

    public void setReiatsu(int reiatsu) {
        this.reiatsu = reiatsu;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public Dimension getHome() {
        return home;
    }

    public void setHome(Dimension home) {
        this.home = home;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }
    
    
    
}
