
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube oSheajackson = new Cube(4);
        System.out.println(oSheajackson.volume());
        System.out.println(oSheajackson);
        
        System.out.println();
        
        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}
