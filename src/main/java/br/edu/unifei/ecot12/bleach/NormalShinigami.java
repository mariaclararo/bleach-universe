package br.edu.unifei.ecot12.bleach;

public class NormalShinigami extends Shinigami{
    private String currentMission;
    private Division division;
    private String rank;
    public String getCurrentMission() {
        return currentMission;
    }
    public void setCurrentMission(String currentMission) {
        this.currentMission = currentMission;
    }
    public Division getDivision() {
        return division;
    }
    public void setDivision(Division division) {
        this.division = division;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    
}
