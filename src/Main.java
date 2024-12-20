import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> main_menu_items = new ArrayList<>(
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

        Menu main_menu = new Menu(main_menu_items);

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
    }

    private static void listGames() {

    }

    private static void listUsers() {

    }

    private static void listPlayed() {

    }

    private static void addGame() {

    }

    private static void addUser() {

    }

    private static void addPlayed() {

    }
}