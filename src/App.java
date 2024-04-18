import java.io.IOException;

public class App {
    static Database db = new Database();

    public static void main(String[] args) throws IOException {
        db.initalizeDatabase();
        System.out.println(db.batterDatabase.get(1).toString());
    }
}