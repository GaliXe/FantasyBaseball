package Features;
import java.util.ArrayList;
import java.util.Scanner;

import PlayerObjects.Batter;
import PlayerObjects.Pitcher;
import PlayerObjects.Team.Team;

public class DraftManager {
    Scanner input = new Scanner(System.in);
    static Database db = new Database();

    public void IDRAFT(String name){
        DRAFT("teama", name);
    }

    public void ODRAFT(String team, String name){
        DRAFT(team, name);
    }

    public void DRAFT(String team, String name){
        
    }

    @SuppressWarnings("static-access")
    public void listPlayers(){
        System.out.print("Which database do you want to view? (P for Pitcher, B for Batter): ");
        String option = input.nextLine();
        option = option.toLowerCase();
        
        switch (option) {
            case "p": //List out Pitchers
                System.out.println("Rank | Name | Team | League | ERA | IP | WHIP | SO9");
                ArrayList<Pitcher> PcurrBase = db.pitcherDatabase;
                for(int i = 0; i < 20; i++){
                    System.out.println(PcurrBase.get(i));
                }
                break;
            case "b": //List out Batters
            System.out.println("Rank | Name | Team | League | BA | OBP | SLG | OPS");
                ArrayList<Batter> BcurrBase = db.batterDatabase;
                for(int i = 0; i < 20; i++){
                    System.out.println(BcurrBase.get(i));
                }
                break;
            default: System.out.println("Invalid Option. Try Again.");
                break;
        }
    }

    @SuppressWarnings("unused")
    public void intializeDraftTeams(){
        Team TeamA = new Team("teama", new ArrayList<>());
        Team TeamB = new Team("teamb", new ArrayList<>());
        Team TeamC = new Team("teamc", new ArrayList<>());
        Team TeamD = new Team("teamd", new ArrayList<>());
    }
}
