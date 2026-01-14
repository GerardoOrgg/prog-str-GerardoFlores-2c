import java.util.Scanner;

public class Main {
    public static double IVA = 0.16;
    public static double UMBRAL_DESCUENTO = 1000;
    public static double DESCUENTO = 0.10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double subotal = obtenerDouble(sc, "Dame el subtotal de la compra");
        double total = calcularTotal(subotal);
        System.out.println("Total : "+total);

    }
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }
    public static double calcularTotal(double subotal){
        double total = subotal +(subotal * IVA);
        return calcularDescuento(total);
    }
    public static double calcularDescuento(double totaliva){
        if(totaliva>UMBRAL_DESCUENTO){
            totaliva = totaliva - (totaliva*DESCUENTO);
        }
        return totaliva;
    }
}
