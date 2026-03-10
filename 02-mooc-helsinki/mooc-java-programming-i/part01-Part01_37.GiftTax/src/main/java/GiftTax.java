
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int tramoInferior1 = 5000;
        int tramoInferior2 = 25000;
        int tramoInferior3 = 55000;
        int tramoInferior4 = 200_000;
        int tramoInferior5 = 1_000_000;
        
        System.out.println("Value of the gift?");
        int valorDelRegalo = Integer.valueOf(scan.nextLine());
        
        int impuestoTramoInferior = 0;
        int tipoImpositivo = 0;
        int tramoAplicado = 0;
        if (valorDelRegalo >= tramoInferior1 && valorDelRegalo < tramoInferior2) {
            impuestoTramoInferior = 100;
            tipoImpositivo = 8;
            tramoAplicado = tramoInferior1;
        } else if (valorDelRegalo >= tramoInferior2 && valorDelRegalo < tramoInferior3) {
            impuestoTramoInferior = 1700;
            tipoImpositivo = 10;
            tramoAplicado = tramoInferior2;
        } else if (valorDelRegalo >= tramoInferior3 && valorDelRegalo < tramoInferior4) {
            impuestoTramoInferior = 4700;
            tipoImpositivo = 12;
            tramoAplicado = tramoInferior3;
        } else if (valorDelRegalo >= tramoInferior4 && valorDelRegalo < tramoInferior5) {
            impuestoTramoInferior = 22100;
            tipoImpositivo = 15;
            tramoAplicado = tramoInferior4;
        } else if (valorDelRegalo >= tramoInferior5 && valorDelRegalo < Integer.MAX_VALUE) {
            impuestoTramoInferior = 142_100;
            tipoImpositivo = 17;
            tramoAplicado = tramoInferior5;
        } else {
            System.out.println("No tax!");
        }
        
        if(valorDelRegalo >= tramoInferior1) {
            double cantidadImpuestoPagar = (impuestoTramoInferior + (valorDelRegalo - tramoAplicado) * ((double)tipoImpositivo/100));
            System.out.println("Tax: " + cantidadImpuestoPagar);
        }
        
    }
}
