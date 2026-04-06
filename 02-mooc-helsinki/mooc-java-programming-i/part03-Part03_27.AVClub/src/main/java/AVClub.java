
import java.util.Scanner;
import java.util.Arrays;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToSearch = "av";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] foundWords = input.split(" ");
            
            for (String currentWord : foundWords) {
                if (currentWord.contains(wordToSearch)) {
                    System.out.println(currentWord);
                }
            }
            
        }

    }
}
