
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String splitter = ",";
        
        String longestName = "";
        double sumOfBirths = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] dataOfPerson = input.split(splitter);
            String name = dataOfPerson[0];
            int yearOfBirth = Integer.valueOf(dataOfPerson[1]);
            
            sumOfBirths += yearOfBirth;
            count++;
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double)sumOfBirths / count));
        
        


    }
}
