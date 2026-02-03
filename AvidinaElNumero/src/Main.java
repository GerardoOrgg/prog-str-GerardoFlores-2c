import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numero = 0, intentos = 0, datoincorrecto=0, rango = 0;
        int numeroAleatorio = random.nextInt(1, 100);
        boolean gano = false;

        for (int i = 1; i<7; i++){
            try {
                System.out.println("Intento :"+i);
                System.out.println("Adivina el numero del 1 al 100! ");
                System.out.print("Ingresa un numero: ");
                numero = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Error: debes ingresar un numero entero");
                datoincorrecto++;
            }

            if (numero > 100 || numero < 1){
                    System.out.println("El numero no puede ser mayor a 100 o menor a 1");
                    rango++;
            } else {
                if (numeroAleatorio == numero){
                    gano = true;
                    break;
                } else {
                    if (numeroAleatorio > numero){
                        System.out.println("Casi pero el numero secreto es mayor!");
                    } else {
                        System.out.println("Casi pero el numero secreto es menor!");
                    }
                    gano = false;
                    intentos++;
                }

                }
        }
        if(gano){
            System.out.println("Ganaste!");
            System.out.println("Te pasaste del rango :"+intentos);
            System.out.println("Ingresaste un dato incorrecto : "+datoincorrecto);
        } else {
            System.out.println("Perdiste!");
            System.out.println("Te pasaste del rango :"+intentos);
            System.out.println("Ingresaste un dato incorrecto : "+datoincorrecto);
            System.out.println("El numero secreto fue :"+numeroAleatorio);
        }

    }
}
