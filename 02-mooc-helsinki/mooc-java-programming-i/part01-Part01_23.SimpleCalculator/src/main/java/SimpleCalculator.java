
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        int suma = firstNumber + secondNumber;
        int resta = firstNumber - secondNumber;
        int multiplicacion = firstNumber * secondNumber;
        double division = (double)firstNumber/secondNumber;
        
        System.out.println(firstNumber + " + " + secondNumber + " = " + suma);
        System.out.println(firstNumber + " - " + secondNumber + " = " + resta);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplicacion);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
}
