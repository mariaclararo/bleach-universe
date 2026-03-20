package br.edu.unifei.ecot12.bleach;

public class Hollow extends Creature{
    private String maskForm;
    private boolean canTalk;
    private int strenght;
    private String type;
    public String getMaskForm() {
        return maskForm;
    }
    public void setMaskForm(String maskForm) {
        this.maskForm = maskForm;
    }
    public boolean isCanTalk() {
        return canTalk;
    }
    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }
    public int getStrenght() {
        return strenght;
    }
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
