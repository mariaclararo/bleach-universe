package br.edu.unifei.ecot12.bleach;

public class BankaiForm implements ZampakutoState{
    private String specialForm;
    private String bankaiPower;
    @Override
    public void changeForm(Zampakuto z, Creature c)
    {
        if(z.getPowerLevel() < 100 && z.getPowerLevel() > 50){ z.setState(new TrueForm());}
        else if(z.getPowerLevel() < 50) {z.setState(new BasicForm());}
    }
    public String getSpecialForm() {
        return specialForm;
    }
    public void setSpecialForm(String specialForm) {
        this.specialForm = specialForm;
    }
    public String getBankaiPower() {
        return bankaiPower;
    }
    public void setBankaiPower(String bankaiPower) {
        this.bankaiPower = bankaiPower;
    }
    
}
