
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try (Scanner scFile = new Scanner(Paths.get(file))) {
            while (scFile.hasNextLine()) {
                String row = scFile.nextLine();
                
                String[] personalData = row.split(",");
                String name = personalData[0];
                int age = Integer.valueOf(personalData[1]);
                
                if (age == 1) {
                    System.out.println(personalData[0] + ", age: " + personalData[1] + " year");
                } else {
                    System.out.println(personalData[0] + ", age: " + personalData[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
