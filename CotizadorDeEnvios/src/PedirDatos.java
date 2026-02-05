import java.util.Scanner;

public class PedirDatos {

    public double leerDoubleEnRango (String msg,double min, double max, Scanner sc){
        double peso;
        while(true){
            System.out.println(msg);
            if(sc.hasNextDouble()){
                peso = sc.nextDouble();
                System.out.println("peso"+peso);
                if (peso >= min && peso <= max){
                    return peso;
                }
                System.out.println("El peso no es valido");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }
    public int leerIntEnRango  (String msg, int min, int max, Scanner sc){
        int distancia;
        while(true){
            System.out.println(msg);
            if(sc.hasNextInt()){
                distancia = sc.nextInt();
                if (distancia > min && distancia < max){
                    return distancia;
                }
                System.out.println("La distancia no es valida");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }



    public int leerTipoServicio (String message, int estandar, int express, Scanner sc){
        int tipo;
        while(true){
            System.out.println(message);
            if(sc.hasNextInt()){
                tipo = sc.nextInt();
                if (tipo == 1 || tipo == 2){
                    return tipo;
                }
                System.out.println("Selecciona 1 o 2");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }
    public boolean leerBoolean  (String message, Scanner sc){
        boolean zona;
        while(true){
            System.out.println(message);
            if(sc.hasNextBoolean()){
                zona = sc.nextBoolean();
                return zona;
            } else {
                System.out.println("El valor  no es boleano");
                sc.nextLine();
            }
        }
    }
}
