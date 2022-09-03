import java.util.Scanner;
class punto17 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double radio,area,longitud;
        System.out.print("ingrese el radio de la circunferencia: ");
        radio = entrada.nextDouble();
        area = Math.pow(radio,2)*Math.PI;
        longitud=Math.PI*radio*2;
        System.out.println("El area de la circunferencia es: "+area);
        System.out.println("La longitud de la circunferencia es: "+longitud);


    }
    
}
