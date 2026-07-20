
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            System.out.println("");
            
            if (input.equals("quit")) {
                break;
            }
            
            // dividido en comando y cantidad
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            } else if (command.equals("move")) {
                first.move(amount, second);
            } 

        }
    }


}
