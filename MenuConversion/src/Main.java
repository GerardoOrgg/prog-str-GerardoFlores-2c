import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido;
        int opcion, contador=0,contador1=0,contador2=0, contador3=0,contador4=0;
        double celucius, fahrenheit, km, millas;
        do {
            System.out.println("Menu de conversión");
            System.out.println("1) °C a °F");
            System.out.println("2) °F a °C");
            System.out.println("3) Km a Millas");
            System.out.println("4) Millas a Km");
            System.out.println("5) Salir");
            System.out.print("Elija una ocion:");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    do {
                        valido = true;
                        try {
                            System.out.print("Ingresa los grados en Celsius: ");
                            celucius = sc.nextDouble();
                            fahrenheit = (celucius * 9 / 5) + 32;
                            System.out.println("La conversión es: " + fahrenheit);
                        } catch (Exception e) {
                            System.out.println("Dato inválido.");
                            sc.next();
                            valido = false;
                        }
                    } while (!valido);
                    contador1++;
                    contador++;
                    break;
                case 2:
                    do {
                        valido = true;
                        try {
                            System.out.print("Ingresa los grados en Fahrenheit: ");
                            fahrenheit = sc.nextDouble();
                            celucius = (fahrenheit - 32) * 5 / 9;
                            System.out.println("La conversión es: " + celucius);
                        } catch (Exception e) {
                            System.out.println("Dato inválido.");
                            sc.next();
                            valido = false;
                        }
                    } while (!valido);
                    contador2++;
                    contador++;
                    break;
                case 3:
                    do {
                        valido = true;
                        try {
                            System.out.print("Ingresa los Km: ");
                            km = sc.nextDouble();
                            millas = km * 0.621371;
                            System.out.println("La conversión es: " + millas);
                        } catch (Exception e) {
                            System.out.println("Dato inválido.");
                            sc.next();
                            valido = false;
                        }
                    } while (!valido);
                    contador3++;
                    contador++;
                    break;
                case 4:
                    do {
                        valido = true;
                        try {
                            System.out.print("Ingresa las millas: ");
                            millas = sc.nextDouble();
                            km = millas / 0.621371;
                            System.out.println("La conversión es: " + km);
                        } catch (Exception e) {
                            System.out.println("Dato inválido.");
                            sc.next();
                            valido = false;
                        }
                    } while (!valido);
                    contador4++;
                    contador++;
                    break;
                default:
                    System.out.print("Opcion invalida");
                    break;
            }
        } while (opcion != 5 );
        System.out.println("Saliste del menu :)");
        System.out.println("El total de conversiones fue:"+contador);
        System.out.println("Se hicieron "+ contador1 +" conversiones de °C a °F");
        System.out.println("Se hicieron "+ contador2 +" conversiones de °F a °C");
        System.out.println("Se hicieron "+ contador3 +" conversiones de Km a Millas");
        System.out.println("Se hicieron "+ contador4 +" conversiones de Millas a Km");
    }
}
