
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String splitter = ",";
        
        int oldest = -1;
        String nameOfOldestPerson = "";
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] dataOfPerson = input.split(splitter);
            int age = Integer.valueOf(dataOfPerson[1]);
            
            if (age > oldest) {
                oldest = age;
                nameOfOldestPerson = dataOfPerson[0];
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldestPerson);
        

    }
}
