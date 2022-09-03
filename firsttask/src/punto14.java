import java.util.Scanner;

public class punto14{
    public static void main(String[]args){
        try (Scanner entrada = new Scanner(System.in)) {
            double numero;

            System.out.print("Digite un numero: ");
            numero = entrada.nextDouble();

            System.out.println("El cuadadro de "+numero+" es: "+Math.pow(numero,2));
            System.out.println("El cubo de "+numero+" es: "+Math.pow(numero,3));
        }

    }
}