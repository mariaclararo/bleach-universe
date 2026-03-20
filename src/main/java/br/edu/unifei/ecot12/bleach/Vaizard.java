package br.edu.unifei.ecot12.bleach;

public class Vaizard extends Shinigami{
    private String maskForm;
    private int timeWithMask;
    public void activateHollowMask()
    {
        this.setPowerLevel(this.getPowerLevel()+100);
        this.setDefense(this.getDefense()+30);
        this.setReiatsu(this.getReiatsu() + 100);
        this.setAppearance(this.getAppearance() + " ,hollow mask:" + this.maskForm);
    }
    public String getMaskForm() {
        return maskForm;
    }
    public void setMaskForm(String maskForm) {
        this.maskForm = maskForm;
    }
    public int getTimeWithMask() {
        return timeWithMask;
    }
    public void setTimeWithMask(int timeWithMask) {
        this.timeWithMask = timeWithMask;
    }
    

}
