
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());
        
        int greaterNumber = 0;
        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal!");
        } else if (firstNumber > secondNumber) {
            greaterNumber = firstNumber;
            System.out.println("Greater number is: " + greaterNumber);
        } else {
            greaterNumber = secondNumber;
            System.out.println("Greater number is: " + greaterNumber);
        }

    }
}
