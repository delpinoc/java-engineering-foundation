
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int lowerLimit = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int upperLimit = Integer.valueOf(scanner.nextLine());
        
        int result = 0;
        
        for (int i = lowerLimit; i <= upperLimit; i++) {
            result += i;
        }
        
        System.out.println("The sum is: " + result);

    }
}
