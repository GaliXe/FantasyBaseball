package PlayerObjects;

public class Batter extends Player {
    private double BA; //batting average
    private double OBP; //on base percentage
    private double SLG; //slugging percentage
    private double OPS;

    public Batter(int rank, String name, String team, String league, double BA, double OBP, double SLG, double OPS){
        super(rank,  name,  team,  league);
        this.BA = BA;
        this.OBP = OBP;
        this.SLG = SLG;
        this.OPS = OPS;
    }

    public double getBA() {
        return BA;
    }

    public void setBA(double bA) {
        BA = bA;
    }

    public double getOBP() {
        return OBP;
    }

    public void setOBP(double oBP) {
        OBP = oBP;
    }

    public double getSLG() {
        return SLG;
    }

    public void setSLG(double sLG) {
        SLG = sLG;
    }

    public double getOPS() {
        return OPS;
    }

    public void setOPS(double oPS) {
        OPS = oPS;
    }

    public String toString(){
        return getRank() + " | " + getName() + " | " + getTeam() + " | " + getLeague() 
                + " | " + getBA() + " | " + getOBP() + " | " + getSLG() + " | " + getOPS();
    }
}
