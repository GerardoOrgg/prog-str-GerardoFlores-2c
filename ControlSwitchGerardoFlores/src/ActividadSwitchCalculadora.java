import java.beans.JavaBean;
import java.util.Scanner;

public class ActividadSwitchCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a,b;
        System.out.println("Ingresa el primer numero");
        a = sc.nextDouble();
        System.out.println("Ingresa el segundo numero");
        b = sc.nextDouble();
        int Opcion = Menu(sc);
        switch (Opcion){
            case 1:
                System.out.println("Elejiste Suma");
                System.out.println(a+"+"+b);
                System.out.println("El resultado es:"+Suma(a,b));
                break;
            case 2:
                System.out.println("Elejiste Resta");
                System.out.println(a+"-"+b);
                System.out.println("El resultado es:"+Resta(a,b));
                break;
            case 3:
                System.out.println("Elejiste Multiplica");
                System.out.println(a+"*"+b);
                System.out.println("El resultado es:"+Multiplica(a,b));
                break;
            case 4:
                System.out.println("Elejiste Division");
                if (b == 0){
                    System.out.println("No se puede dividir entre cero");
                } else {
                    System.out.println(a+"/"+b);
                    System.out.println("El resultado es:"+Division(a,b));
                }
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }
    public static int Menu (Scanner sc){
        System.out.println("Menu de Operaciones basicas");
        System.out.println("1) Suma, 2) Resta, 3) Multiplicar, 4) Dividir");
        System.out.println("Elije una opcion");
        return sc.nextInt();
    }
    public static double Suma (double a, double b){
        return a + b;
    }
    public static double Resta (double a, double b){
        return a - b;
    }
    public static double Multiplica (double a, double b){
        return a * b;
    }
    public static double Division (double a, double b){
        return a / b;
    }
}
