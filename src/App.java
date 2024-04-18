import java.io.IOException;

import Features.Database;

public class App {
    static Database db = new Database();

    public static void main(String[] args) throws IOException {
        db.initalizeDatabase();
    }
}