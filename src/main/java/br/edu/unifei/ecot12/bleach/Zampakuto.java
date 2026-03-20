package br.edu.unifei.ecot12.bleach;

public class Zampakuto {
    private String name;
    private String actionCall;
    private int powerLevel;
    private ZampakutoState state = new BasicForm();
    public void liberation(Creature c)
    {
        state.changeForm(this,c);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getActionCall() {
        return actionCall;
    }
    public void setActionCall(String actionCall) {
        this.actionCall = actionCall;
    }
    public int getPowerLevel() {
        return powerLevel;
    }
    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }
    public ZampakutoState getState() {
        return state;
    }
    public void setState(ZampakutoState state) {
        this.state = state;
    }
    

}
