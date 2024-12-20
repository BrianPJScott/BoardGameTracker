import java.util.*;

public class Menu {

    private List<String> menu_items = new ArrayList<>();

    public Menu() {
        this.menu_items.add("Exit");
    }

    public Menu(List<String> menu_items) {

        if (!menu_items.isEmpty()) {
            this.menu_items = menu_items;
        }
    }

    public String show() {

        int choice = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("Welcome to the game tracker");

        do {
            int item_index = 0;
            System.out.println("Choose an option:");
            System.out.println("***************************");
            for (String menu_item : menu_items) {
                //System.out.printf("%1$3:\n", menu_item);      // TODO: fix with formatted printf to properly pad numbers on left
                System.out.println(item_index++ + ". " + menu_item);
            }
            choice = keyboard.next().charAt(0) - 48;
            if (!isValidChoice(choice)){
                System.out.println("Invalid choice. Try again.");
            }
        } while (!isValidChoice(choice));

        return menu_items.get(choice);
    }

    private boolean isValidChoice(int choice){

        return choice >= 0 && choice <= 9 && choice <= menu_items.size() - 1;

    }

}
