package Features;
import java.util.ArrayList;
import java.util.Scanner;

import PlayerObjects.Batter;
import PlayerObjects.Pitcher;
import PlayerObjects.Team.Team;

public class DraftManager {
    Scanner input = new Scanner(System.in);
    static Database db = new Database();

    public void DRAFT(){
        
    }

    @SuppressWarnings("static-access")
    public void listPlayers(){

        System.out.print("Which database do you want to view? (P for Pitcher, B for Batter): ");
        String option = input.nextLine();
        option = option.toLowerCase();

        
        switch (option) {
            case "p":
                System.out.println("Rank | Name | Team | League | ERA | IP | WHIP | SO9");
                ArrayList<Pitcher> PcurrBase = db.pitcherDatabase;
                for(int i = 0; i < 50; i++){
                    System.out.println(PcurrBase.get(i));
                }
                break;
            case "b":
                ArrayList<Batter> BcurrBase = db.batterDatabase;
                for(int i = 0; i < 50; i++){
                    System.out.println(BcurrBase.get(i));
                }
                break;
            default: System.out.println("Invalid Option. Try Again.");
                break;
        }
    }

    @SuppressWarnings("unused")
    public void intializeDraftTeams(){
        Team TeamA = new Team("Team A", new ArrayList<>());
        Team TeamB = new Team("Team B", new ArrayList<>());
        Team TeamC = new Team("Team C", new ArrayList<>());
        Team TeamD = new Team("Team D", new ArrayList<>());
    }
}
