package br.edu.unifei.ecot12.bleach;

public class Resurreccion implements ZampakutoState{
    private String specialForm;
    private String specialPower;
    private String userAppearance;
    @Override
    public void changeForm(Zampakuto z, Creature c)
    {
        if(z.getPowerLevel() < 100 && z.getPowerLevel() > 50){ z.setState(new TrueForm());}
        else if(z.getPowerLevel() < 50) {z.setState(new BasicForm());}
    }

    public String getUserAppearance() {
        return userAppearance;
    }

    public void setUserAppearance(String userAppearance) {
        this.userAppearance = userAppearance;
    }

    public String getSpecialForm() {
        return specialForm;
    }

    public void setSpecialForm(String specialForm) {
        this.specialForm = specialForm;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }
    
    
}
