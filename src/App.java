import java.io.IOException;
import java.util.Scanner;

import Features.Database;
import Features.DraftManager;

public class App {
    static Database db = new Database();
    static DraftManager dm = new DraftManager();

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        db.initalizeDatabase();
        dm.intializeDraftTeams();

        while(!quit)
        {
            String input = keyboard.nextLine();
            String[] values = input.split(" ");
            switch(values[0].toLowerCase()){
                case "list":
                    dm.listPlayers();
                    break;
                case "idraft":
                    if(values.length == 2){
                        String fname;
                        String lname;
                        String playerName;
                        
                    }
                    break;
                default: System.out.println("No command found. If you need help, type in HELP for a list of commands");
                    break;
            }
        }
        keyboard.close();
    }
}