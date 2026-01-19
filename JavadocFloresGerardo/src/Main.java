import java.beans.JavaBean;
import java.util.Scanner;
public class Main {
    public static int OPCION;
    public static double IMC;
    public static double AREA;
    public  static double FAHRENHEIT;
    public static double AREACIRCULO;
    public static double PI = 3.1416;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        do {

            System.out.println("Menu:");
            System.out.println("1. Clcular IMC");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Convertir °C a °Ft");
            System.out.println("4. Calcular area de un circulo");
            System.out.println("5. Salir");

            OPCION = sc.nextInt();
            switch (OPCION) {
                case 1:
                    System.out.println("Escribe el peso (en cm):");
                    double peso = sc.nextDouble();
                    System.out.println("Escribe la altura:(en kg)");
                    double altura = sc.nextDouble();
                    System.out.println("El IMC es :"+caluclarIMC(peso,altura));
                    break;
                case 2:
                    System.out.println("Escribe la base");
                    double base = sc.nextDouble();
                    System.out.println("Escribe la altura:");
                    double alturarectangulo = sc.nextDouble();
                    System.out.println("El area del rectangulo es :"+CalucularAreaRectangulo(base,alturarectangulo));
                    break;
                case 3:
                    System.out.println("Escribe los grados Celcius");
                    double celcius = sc.nextDouble();
                    System.out.println("La converison es: "+ ConvertirCaF(celcius));
                    break;
                case 4:
                    System.out.println("Escribe el radio del ciruclo");
                    double radio = sc.nextDouble();
                    System.out.println("El area del ciruclo es: "+ CalcularAreaCirculo(radio));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (OPCION != 5);
        System.out.println("Adios:)");
    }

    /**
     * Este metedo calulara el IMC de una persona
     * @param peso variable que guardara el peso
     * @param altura varibale que guardara la altura
     * @return devolvera el IMC
     */
    public static double caluclarIMC (double peso, double altura){
         altura = altura / 100.0;
        IMC = peso/(altura*altura);
        return IMC;
    }

    /**
     * Este metodo calculara el area de un rectangulo usando al formula area = base * altura
     * @param altura variable que guardara la altura
     * @param base variable que guardara la base
     * @return devolvera el area
     */
    public static  double CalucularAreaRectangulo (double altura, double base){
        AREA = base * altura;
        return AREA;
    }

    /**
     * Metodo que convierte grados Celcius a Fehrenheit
     * @param Celcius varibale que guardara el valor de los grados celcicus
     * @return devolvera los grados Fahrenheit
     */
    public  static  double ConvertirCaF (double Celcius){
        FAHRENHEIT = (Celcius * 1.8 ) + 32;
        return FAHRENHEIT;
    }

    /**
     * Metodo que calulara el area de un circulo
     * @param radio varible que guardara el radio
     * @return devolera el area del ciruclo
     */
    public  static  double CalcularAreaCirculo (double radio){
        AREACIRCULO = PI * (radio* radio);
        return AREACIRCULO;
    }



}
