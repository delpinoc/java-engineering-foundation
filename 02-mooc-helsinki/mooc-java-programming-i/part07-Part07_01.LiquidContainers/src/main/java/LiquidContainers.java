
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        final int MAX_LITROS = 100;

        while (true) {
            System.out.println("First: " + first + "/" + MAX_LITROS);
            System.out.println("Second: " + second + "/" + MAX_LITROS);
            System.out.println("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            }

            // dividido en comando y cantidad
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                int freeSpace = MAX_LITROS - first;

                if (amount > 0) {
                    
                }

            } else if (command.equals("move")) {
                int freeSpace = MAX_LITROS - second;
                if (amount > 0 && first > 0) {
                    if (amount < first) {
                        first -= amount;
                        second += amount;
                    } else if (amount >= first) {
                        second += first;
                        first = 0;
                    }

                    if (second > MAX_LITROS) {
                        second = MAX_LITROS;
                    }
                }
                
            } else if (command.equals("remove")) {
                if (amount > 0 && second > 0) {
                    if (amount < second) {
                        second -= amount;
                    } else if (amount >= second) {
                        second = 0;
                    }
                }
            }

        }
    }

}
