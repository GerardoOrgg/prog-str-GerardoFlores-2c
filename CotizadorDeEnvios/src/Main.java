import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShippingCalculator shippingcalculator = new ShippingCalculator();
        PedirDatos pedirdatos = new PedirDatos();
        Scanner sc = new Scanner(System.in);      //  DECLARACION DE UN OBEJTOOOOO
        //I-P-O
        //Input
        double pesoKg = pedirdatos.leerDoubleEnRango("Ingresa el peso en Kg", 0.1, 0.50, Scanner sc);
        int distanciaKm = pedirdatos.leerIntEnRango("Ingresa la distancia en Km" , int min, int max,Scanner sc );
        leerBoolean(String msg,Scanner sc);

        //Proceso
        ticket.process(cantidad);

        //Output
        ticket.imprimirTicket(cantidad);
    }
}
