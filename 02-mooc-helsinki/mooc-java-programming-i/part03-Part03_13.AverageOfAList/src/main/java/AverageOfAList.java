
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            
            if (inputNumber == -1){
                break;
            }
            
            numbers.add(inputNumber);
        }
        
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int totalSum = 0;
        
        for (int currentNumber : numbers) {
            totalSum += currentNumber;
        }
        
        double average = (double)totalSum / numbers.size();
        
        System.out.println("Average: " + average);
        
        
    }
}
