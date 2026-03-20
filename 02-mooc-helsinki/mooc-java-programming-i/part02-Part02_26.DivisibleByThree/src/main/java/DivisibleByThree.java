
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the lower limit:");
        int lowerLimit = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter the upper limit:");
        int upperLimit = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(lowerLimit, upperLimit);
        
    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
