package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public class HumanWorld extends Dimension{
    private int population;
    private List<String> cities = new ArrayList<>();
    private static HumanWorld instance = new HumanWorld();
    private HumanWorld(){}
    public static HumanWorld getInstance(){return instance;}
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public List<String> getCities() {
        return cities;
    }
    public void setCities(List<String> cities) {
        this.cities = cities;
    }
    
}
