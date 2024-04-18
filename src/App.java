import java.io.IOException;

import Features.Database;
import Features.DraftManager;

public class App {
    static Database db = new Database();
    static DraftManager dm = new DraftManager();

    public static void main(String[] args) throws IOException {
        db.initalizeDatabase();
        dm.intializeDraftTeams();
        
        dm.listPlayers();
    }
}