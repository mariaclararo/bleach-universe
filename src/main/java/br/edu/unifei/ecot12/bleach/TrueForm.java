package br.edu.unifei.ecot12.bleach;

public class TrueForm implements ZampakutoState{
    private String realForm;
    private String powers;
    @Override
    public void changeForm(Zampakuto z, Creature c)
    {
        if(z.getPowerLevel()>=100 && c instanceof Hollow)
        {
            Resurreccion r = new Resurreccion();
            z.setState(r);
            r.setUserAppearance(", special resurrecion form");
            c.setAppearance(c.getAppearance() + r.getUserAppearance());
        }

        else if(z.getPowerLevel()>=100 && (c instanceof Shinigami || c instanceof SubstituteShinigami))
        {
            z.setState(new BankaiForm());
        }
        else if(z.getPowerLevel() < 100){z.setState(new BasicForm());}
    }
    public String getRealForm() {
        return realForm;
    }
    public void setRealForm(String realForm) {
        this.realForm = realForm;
    }
    public String getPowers() {
        return powers;
    }
    public void setPowers(String powers) {
        this.powers = powers;
    }
    
}
