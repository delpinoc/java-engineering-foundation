
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greatestNumber = number1;
        
        if (number2 > greatestNumber) {
            greatestNumber = number2;
        }
        
        if (number3 > greatestNumber) {
            greatestNumber = number3;
        }
        
        return greatestNumber;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
