
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String ruta = scanner.nextLine();
        
        try (Scanner scFile = new Scanner(Paths.get(ruta))) {
            while (scFile.hasNextLine()) {
                String row = scFile.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}
