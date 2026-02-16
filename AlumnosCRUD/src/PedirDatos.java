import java.util.Scanner;

public class PedirDatos {

    public int Id(String message, Scanner sc, Alumno[] alumno, int contador){
        int id;
        while(true){
            System.out.print(message);
            if(sc.hasNextInt()){
                id = sc.nextInt();
                sc.nextLine();
                if(id <= 0){
                    System.out.println(" -- El id no puede ser negativo o cero -- ");
                    continue;
                }
                boolean repetido = false;
                for(int i = 0; i < contador; i++){
                    if(alumno[i].getId() == id){
                        repetido = true;
                        break;
                    }
                }
                if(repetido){
                    System.out.println(" -- El id ya está registrado, intenta otro. -- ");
                } else {
                    return id;
                }
            } else {
                System.out.println(" -- El valor no es numérico --");
                sc.nextLine();
            }
        }
    }


    public String name(String message, Scanner sc){
        String name;
        while(true){
            System.out.print(message);
            name = sc.nextLine();

            if(name.trim().isEmpty()){
                System.out.println("El texto está vacío, intenta de nuevo.");
            } else {
                return name;
            }
        }
    }

    public static double leePromedio(String msg, Scanner sc, double min, double max) {
        while (true) {
            System.out.print(msg);
            if (sc.hasNextDouble()) {
                double promedio = sc.nextDouble();
                if (promedio >= min && promedio <= max) {
                    return  promedio;
                } else {
                    System.out.println("La calificación debe estar entre " + min + " y " + max);
                }
            } else {
                System.out.println("El valor no es numérico");
                sc.next();
            }
        }
    }

    public boolean isActivo (String message, Scanner sc){
        boolean isactivo;
        while(true){
            System.out.print(message + " (true/false) : ");
            if(sc.hasNextBoolean()){
                isactivo = sc.nextBoolean();
                sc.nextLine();
                return isactivo;
            } else {
                System.out.println("El valor no es booleano");
                sc.nextLine();
            }
        }
    }
}
