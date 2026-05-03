
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account cuenta = new Account("Matthews account", 1000);
        Account cuenta2 = new Account("My account", 0);
        
        cuenta.withdrawal(100);
        cuenta2.deposit(100);
        
        System.out.println(cuenta);
        System.out.println(cuenta2);
        
    }
}
