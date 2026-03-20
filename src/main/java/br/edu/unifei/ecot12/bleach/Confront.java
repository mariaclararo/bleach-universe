package br.edu.unifei.ecot12.bleach;

public class Confront {
    private Creature attacker;
    private Creature target;
    private String goal;
    private Ability attackerPower;
    public void action()
    {
        attacker.setReiatsu(attacker.getReiatsu() - attackerPower.getReiatsuCost());
        attackerPower.execute(target);
    }
    public Creature getAttacker() {
        return attacker;
    }
    public void setAttacker(Creature attacker) {
        this.attacker = attacker;
    }
    public Creature getTarget() {
        return target;
    }
    public void setTarget(Creature target) {
        this.target = target;
    }
    public String getGoal() {
        return goal;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }
    public Ability getAttackerPower() {
        return attackerPower;
    }
    public void setAttackerPower(Ability attackerPower) {
        this.attackerPower = attackerPower;
    }
    

}
