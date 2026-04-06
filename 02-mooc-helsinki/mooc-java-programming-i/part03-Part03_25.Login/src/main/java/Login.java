
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // users
        String[] usernames = {"alex", "emma"};
        
        // passwords
        String[] passwords = {"sunshine", "haskell"};
        
        System.out.println("Enter username:");
        String enteredUsername = scanner.nextLine();
        
        System.out.println("Enter password:");
        String enteredPassword = scanner.nextLine();
        
        if (login(usernames, passwords, enteredUsername, enteredPassword)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        

    }
    
    public static boolean login(String[] usernames, String[] passwords, String username, String password) {   
        boolean isCorrect = false;
        for (int i = 0; i < usernames.length; i++) {
            if (checkUsername(usernames[i], username) && checkPassword(passwords[i], password)) {
                isCorrect = true;
            }
        }
        return isCorrect;
    }

    public static boolean checkUsername(String realUsername, String enteredUsername) {
        return realUsername.equals(enteredUsername);
    }

    public static boolean checkPassword(String realPass, String enteredPass) {
        return realPass.equals(enteredPass);
    }
}
