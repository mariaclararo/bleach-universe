package br.edu.unifei.ecot12.bleach;

public class SubstituteShinigami extends Human{
    private String currentAppearance;
    private Zampakuto zampakuto;
    public void transformationShinigami()
    {
        currentAppearance = this.getAppearance();
        this.setAppearance(this.getAppearance() + " .Spiritual Form");
    }
    public void returnToHumanBody()
    {
        this.setAppearance(currentAppearance);
    }
    public void useBankai()
    {
        if(zampakuto.getState() instanceof BankaiForm) System.out.println("BANKAI!!!!!!");
    }
    public Zampakuto getZampakuto() {
        return zampakuto;
    }
    public void setZampakuto(Zampakuto zampakuto) {
        this.zampakuto = zampakuto;
    }
    

}
