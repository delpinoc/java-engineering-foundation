
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPositiveNumbers = 0;
        int totalPositiveSum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                totalPositiveNumbers++;
                totalPositiveSum += number;
            }
            
            
        }
        if (totalPositiveNumbers > 0) {
            double avg = totalPositiveSum / (double) totalPositiveNumbers;
            System.out.println(avg); 
        } else {
            System.out.println("Cannot calculate the average");
        }
        

    }
}
