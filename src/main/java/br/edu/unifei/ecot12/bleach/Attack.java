package br.edu.unifei.ecot12.bleach;

public class Attack implements SkillCategory{
    private int damageAmout;
    @Override
    public void applyEffect(Creature c)
    {
        int blocked = damageAmout - c.getDefense();
        c.setLife(c.getLife() - blocked);
        if(c.getLife() <= 0)
        {
            c.setLife(0);
            c.setAlive(false);
        }
    }
    public int getDamageAmout() {
        return damageAmout;
    }
    public void setDamageAmout(int damageAmout) {
        this.damageAmout = damageAmout;
    }
    
}
