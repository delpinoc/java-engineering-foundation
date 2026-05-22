
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier?(empty will stop)");
            String id = scanner.nextLine();

            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            if (!items.contains(new Item(id, name))) {
                items.add(new Item(id, name));
            }

        }

        printItems(items);

    }

    public static void printItems(ArrayList<Item> items) {
        System.out.println("==Items==");
        for (Item actualItem : items) {
            System.out.println(actualItem);
        }
    }
}
