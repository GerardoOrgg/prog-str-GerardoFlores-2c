import java.util.Scanner;

public class PedirDatos {

    public double leerDoubleEnRango (String msg,double min, double max, Scanner sc){
        double peso;
        while(true){
            System.out.println(msg);
            if(sc.hasNextDouble()){
                peso = sc.nextDouble();
                if (peso > 0.1 && peso < 50.0){
                    return peso;
                }
                System.out.println("El peso no es valido");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }
    public int leerIntEnRango  (String message, Scanner sc){
        int distancia;
        while(true){
            System.out.println(message);
            if(sc.hasNextDouble()){
                distancia = sc.nextInt();
                if (distancia > 0.1 && distancia < 50.0){
                    return distancia;
                }
                System.out.println("La distancia no es valida");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }
    public int tipoServicio (String message, Scanner sc){
        int tipo;
        while(true){
            System.out.println(message);
            if(sc.hasNextInt()){
                tipo = sc.nextInt();
                if (tipo == 1){
                    return tipo;
                }
                System.out.println("El valor no es valido");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }
    public boolean esZonaRemota  (String message, Scanner sc){
        boolean zona;
        while(true){
            System.out.println(message);
            if(sc.hasNextBoolean()){
                zona = sc.hasNextBoolean();
                if (zona){
                    return zona;
                }

                System.out.println("El valor no es valido");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }
}
