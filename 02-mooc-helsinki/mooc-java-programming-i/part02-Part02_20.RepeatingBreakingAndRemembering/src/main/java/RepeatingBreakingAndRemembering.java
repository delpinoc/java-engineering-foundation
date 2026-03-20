
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int numeroParaFinalizarBucle = -1;
        int totalSuma = 0;
        int totalNumerosIntroducidos = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            int numeroIntroducido = Integer.valueOf(scanner.nextLine());
            
            if(numeroIntroducido == numeroParaFinalizarBucle) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            totalSuma += numeroIntroducido;
            totalNumerosIntroducidos++;
            
            if (numeroIntroducido % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        double promedio = (double)totalSuma / totalNumerosIntroducidos;
        
        System.out.println("Sum: " + totalSuma);
        System.out.println("Numbers: " + totalNumerosIntroducidos);
        System.out.println("Average: " + promedio);
        System.out.println("Even: " + contadorPares);
        System.out.println("Odd: " + contadorImpares);
        
        

    }
}
