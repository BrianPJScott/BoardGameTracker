import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    private final List<String> MAIN_MENU_ITEMS = new ArrayList<>(
            Arrays.asList(
                    "List Games",
                    "List Users",
                    "List Games Played",
                    "Add Game",
                    "Add User",
                    "Add new Played Game",
                    "Exit"
            )
    );

    DBManager gameDB;

    public void run() {
        gameDB = new DBManager();
        gameDB.dbConnect();

        if (gameDB.isConnected()) {
            Menu main_menu = new Menu(MAIN_MENU_ITEMS);

            switch (main_menu.show()) {
                case "List Games":
                    listGames();
                    break;
                case "List Users":
                    listUsers();
                    break;
                case "List Games Played":
                    listPlayed();
                    break;
                case "Add Game":
                    addGame();
                    break;
                case "Add User":
                    addUser();
                    break;
                case "Add new Played Game":
                    addPlayed();
                    break;
                case "Exit":
                    System.exit(0);
            }
        } else {
            System.out.println("Database not connected");
        }
    }

    private void listGames() {

    }

    private void listUsers() {
        System.out.println("List of all Users: \n");
        for (List<String> s : gameDB.getAllUsers()){
            System.out.println(s);
        }
    }

    private void listPlayed() {

    }

    private void addGame() {

    }

    private void addUser() {

    }

    private void addPlayed() {

    }

}
