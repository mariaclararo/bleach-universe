package br.edu.unifei.ecot12.bleach;

public class BasicForm implements ZampakutoState{
    private int sizeOfBlade;
    @Override
    public void changeForm(Zampakuto z,Creature c)
    {
        if(z.getPowerLevel() > 50){z.setState(new TrueForm());}
    }
    public int getSizeOfBlade() {
        return sizeOfBlade;
    }
    public void setSizeOfBlade(int sizeOfBlade) {
        this.sizeOfBlade = sizeOfBlade;
    }
    
}
