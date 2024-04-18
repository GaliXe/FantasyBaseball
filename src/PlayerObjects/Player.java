package PlayerObjects;

public class Player {
    int rank;
    String name;
    int age;
    String team;
    String league;

    public Player(int rank, String name, String team, String league){
        this.rank = rank;
        this.name = name;
        this.team = team;
        this.league = league;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String toString(){
        return String.format("%-30s%-30s%10d", rank, name, team, league);
    }
}

