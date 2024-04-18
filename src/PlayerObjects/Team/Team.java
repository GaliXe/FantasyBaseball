package PlayerObjects.Team;

import java.util.ArrayList;

import PlayerObjects.Player;

public class Team {
    private String teamName;
    private ArrayList<Player> teamRoster = new ArrayList<>();

    public Team(String teamName, ArrayList<Player> teamRoster){
        this.teamName = teamName;
        this.teamRoster = teamRoster;
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public ArrayList<Player> getTeamRoster() {
        return teamRoster;
    }
    public void setTeamRoster(ArrayList<Player> teamRoster) {
        this.teamRoster = teamRoster;
    }
}
