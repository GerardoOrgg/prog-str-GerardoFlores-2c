import java.util.Scanner;

public class PedirDatos {

    public String leerTextoNoVacio (String msg, Scanner sc){
        String nombrealumno;
        while(true){
            System.out.println(msg);
            nombrealumno = sc.nextLine();
            if (nombrealumno != null){
                return nombrealumno;
            }
            System.out.println("El nombre no es valido");
        }
    }
    public static double[] leerDoubleEnRango(String msg, double min, double max, Scanner sc) {
        double []calificaciones = new double[3];
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.println(msg + " " + (i + 1) + ": ");
                if (sc.hasNextDouble()) {
                    double valor = sc.nextDouble();
                    if (valor >= min && valor <= max) {
                        calificaciones[i] = valor;
                        break;
                    } else {
                        System.out.println("La calificación debe estar entre " + min + " y " + max);
                    }
                } else {
                    System.out.println("El valor no es numérico");
                    sc.next();
                }
            }
        }
        return calificaciones;
    }

    public int leerIntEnRango (String message, int min, int max, Scanner sc){
        int asistencia;
        while(true){
            System.out.println(message);
            if(sc.hasNextInt()){
                asistencia = sc.nextInt();
                if (asistencia > min && asistencia < max){
                    return asistencia;
                }
                System.out.println("La asistenica no puede ser mayor a 100 ni menor a 0");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }
    public boolean leerBoolean  (String message, Scanner sc){
        boolean entregaProyecto ;
        while(true){
            System.out.println(message);
            if(sc.hasNextBoolean()){
                entregaProyecto  = sc.nextBoolean();
                return entregaProyecto ;
            } else {
                System.out.println("El valor  no es boleano");
                sc.nextLine();
            }
        }
    }
}
