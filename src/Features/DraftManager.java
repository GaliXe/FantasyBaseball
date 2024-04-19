package Features;
import java.util.ArrayList;
import java.util.Scanner;

import PlayerObjects.Batter;
import PlayerObjects.Pitcher;
import PlayerObjects.Team.Team;

public class DraftManager {
    Team TeamA;
    Team TeamB;
    Team TeamC;
    Team TeamD;
    Scanner input = new Scanner(System.in);
    static Database db = new Database();

    public void IDRAFT(String name){
        DRAFT("teama", name);
    }

    public void ODRAFT(String team, String name){
        DRAFT(team, name);
    }

    public void DRAFT(String team, String name){
        Team currentTeam;

        switch(team){
            case "teama":
                currentTeam = TeamA;
                break;
            case "teamb":
                currentTeam = TeamB;
                break;
            case "teamc":
                currentTeam = TeamC;
                break;
            case "teamd":
                currentTeam = TeamD;
                break;
            default: System.out.println("Invalid Team.");
                break;
        }
    }

    @SuppressWarnings("static-access")
    public void listPlayers(){
        System.out.print("Which database do you want to view? (P for Pitcher, B for Batter): ");
        String option = input.nextLine();
        option = option.toLowerCase();
        
        switch (option) {
            case "p": //List out Pitchers
                System.out.println("Rank | Name | Team | League | EVAL ");
                ArrayList<Pitcher> PcurrBase = db.pitcherDatabase;
                for(int i = 0; i < 20; i++){
                    Pitcher currPit = PcurrBase.get(i);
                    System.out.println(currPit.toStringEval() + " | " + currPit.getIP());
                }
                break;
            case "b": //List out Batters
            System.out.println("Rank | Name | Team | League | EVAL");
                ArrayList<Batter> BcurrBase = db.batterDatabase;
                for(int i = 0; i < 20; i++){
                    Batter currBat = BcurrBase.get(i);
                    System.out.println(currBat.toStringEval() + " | " + currBat.getBA());
                }
                break;
            default: System.out.println("Invalid Option. Try Again.");
                break;
        }
    }

    public void intializeDraftTeams(){
        TeamA = new Team("teama", new ArrayList<>());
        TeamB = new Team("teamb", new ArrayList<>());
        TeamC = new Team("teamc", new ArrayList<>());
        TeamD = new Team("teamd", new ArrayList<>());
    }
}
