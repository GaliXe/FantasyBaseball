package Features;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import PlayerObjects.Batter;
import PlayerObjects.Pitcher;
import Features.Database;

public class Database {
    static ArrayList<Batter> batterDatabase = new ArrayList<Batter>();
    static ArrayList<Pitcher> pitcherDatabase = new ArrayList<Pitcher>();
    private String line;

    public void initalizeDatabase() throws IOException
    {
        try {
            BufferedReader batreader = new BufferedReader(new FileReader("statfiles/2023 MLB Player Stats - Batting.csv"));
            BufferedReader pitreader = new BufferedReader(new FileReader("statfiles/2023 MLB Player Stats - Pitching.csv"));
            batreader.readLine(); //Read the header first
            pitreader.readLine(); //Read the header first

            //Import Batters
            while((line = batreader.readLine()) != null)
            {
                String [] values = line.split(";");
                batterDatabase.add(new Batter(Integer.parseInt(values[0]), values[1], values[3], values[4], Double.parseDouble(values[18]), 
                                    Double.parseDouble(values[19]), Double.parseDouble(values[20]), Double.parseDouble(values[21])));
            }

            //Import Pitchers
            while((line = pitreader.readLine()) != null)
            {
                String [] values = line.split(";");
                pitcherDatabase.add(new Pitcher(Integer.parseInt(values[0]), values[1], values[3], values[4], Double.parseDouble(values[8]), 
                                    Double.parseDouble(values[15]), Double.parseDouble(values[29]), Double.parseDouble(values[33])));
            }

            batreader.close();
            pitreader.close();
        } catch (NumberFormatException e) {
            e.printStackTrace();;
        }
    }
}
