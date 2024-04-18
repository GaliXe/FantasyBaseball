package PlayerObjects;

public class Pitcher extends Player{
    private double ERA;
    private double IP;
    private double WHIP;
    private double SO9;

    public Pitcher(int rank, String name, String team, String league, double ERA, double IP, double WHIP, double SO9){
        super(rank,  name,  team,  league);
        this.ERA = ERA;
        this.IP = IP;
        this.WHIP = WHIP;
        this.SO9 = SO9;
    }

    public double getERA() {
        return ERA;
    }
    public void setERA(double eRA) {
        ERA = eRA;
    }
    public double getIP() {
        return IP;
    }
    public void setIP(double iP) {
        IP = iP;
    }
    public double getWHIP() {
        return WHIP;
    }
    public void setWHIP(double wHIP) {
        WHIP = wHIP;
    }
    public double getSO9() {
        return SO9;
    }
    public void setSO9(double sO9) {
        SO9 = sO9;
    }

    public String toString(){
        return getRank() + " | " + getName() + " | " + getTeam() + " | " + getLeague() 
                + " | " + getERA() + " | " + getIP() + " | " + getWHIP() + " | " + getSO9();
    }
}
