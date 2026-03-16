
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int actualNumber = Integer.valueOf(scanner.nextLine());
            
            if (actualNumber == 0) {
                break;
            }
            
            if (actualNumber < 0 || actualNumber > 0) {
                totalNumbers++;
            }
        }
        
        System.out.println("Number of numbers: " + totalNumbers);

    }
}
