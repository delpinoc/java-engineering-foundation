
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String rightAnswer = "true";
        System.out.println("Give a string:");
        String answer = scanner.nextLine();
        
        if (answer.equals(rightAnswer)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
