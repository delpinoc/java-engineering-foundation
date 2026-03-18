
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        for (int actualNumber = number; actualNumber <= 100; actualNumber++) {
            System.out.println(actualNumber);
        }

    }
}
