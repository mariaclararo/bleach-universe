package br.edu.unifei.ecot12.bleach;

public class Shinigami extends Creature{
    private String specialty;
    private boolean haveGigai;
    private boolean usingGigai = false;
    private Zampakuto zampakuto;
    public void activateGigai()
    {
        if(haveGigai && usingGigai == false) usingGigai = true;
    }
    public void desactivateGigai()
    {
        if(haveGigai && usingGigai == true) usingGigai = false;
    }
    public void useBankai()
    {
        if(zampakuto.getState() instanceof BankaiForm) System.out.println("BANKAI!!!!!!");
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public boolean isHaveGigai() {
        return haveGigai;
    }
    public void setHaveGigai(boolean haveGigai) {
        this.haveGigai = haveGigai;
    }
    public boolean isUsingGigai() {
        return usingGigai;
    }
    public void setUsingGigai(boolean usingGigai) {
        this.usingGigai = usingGigai;
    }
    public Zampakuto getZampakuto() {
        return zampakuto;
    }
    public void setZampakuto(Zampakuto zampakuto) {
        this.zampakuto = zampakuto;
    }
    
}
