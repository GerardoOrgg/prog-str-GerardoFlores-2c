import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShippingCalculator shippingcalculator = new ShippingCalculator();
        PedirDatos pedirdatos = new PedirDatos();
        Scanner sc = new Scanner(System.in);      //  DECLARACION DE UN OBEJTOOOOO
        //I-P-O
        //Input
        double pesoKg = pedirdatos.leerDoubleEnRango("Ingresa el peso en Kg", 0.1, 50.0,  sc);
        System.out.println("peso "+ pesoKg);
        int distanciaKm = pedirdatos.leerIntEnRango("Ingresa la distancia en Km" , 1, 2000, sc );
        int tipoServicio = pedirdatos.leerTipoServicio("Ingresa el tipo de servicio 1) Estandar, 2) Express", 1, 2, sc);
        boolean esZonaremota = pedirdatos.leerBoolean("Es una zona remota?", sc);

        //Proceso
        shippingcalculator.process(pesoKg, distanciaKm, tipoServicio, esZonaremota);

        //Output
        shippingcalculator.imprimirTicket(pesoKg, distanciaKm, tipoServicio, esZonaremota);
    }
}
