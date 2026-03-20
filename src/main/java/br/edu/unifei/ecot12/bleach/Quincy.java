package br.edu.unifei.ecot12.bleach;

public class Quincy extends Human{
    private int reishAbsorption;
    private String spiritualWeapon;
    private int weaponLevel;
    public void useWeapon()
    {
        System.out.println(this.getName() + "using: " + spiritualWeapon);
    }
    public int getReishAbsorption() {
        return reishAbsorption;
    }
    public void setReishAbsorption(int reishAbsorption) {
        this.reishAbsorption = reishAbsorption;
    }
    public String getSpiritualWeapon() {
        return spiritualWeapon;
    }
    public void setSpiritualWeapon(String spiritualWeapon) {
        this.spiritualWeapon = spiritualWeapon;
    }
    public int getWeaponLevel() {
        return weaponLevel;
    }
    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }
    
}
