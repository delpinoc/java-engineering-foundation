
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String myWord = scanner.nextLine();
        
        printWord(myWord, 3);
        

    }
    
    public static void printWord(String word, int limit) {
        for (int i = 0; i < limit; i++) {
            System.out.print(word + "");
        }
    }
}
