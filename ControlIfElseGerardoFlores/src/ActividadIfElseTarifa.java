import java.util.Scanner;

public class ActividadIfElseTarifa {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Edad = PedirEdad(sc, "Ingresa tu edad");
        boolean  = esEstudiante(sc, "Eres estudiante?");
    }
    public static int PedirEdad(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    public static boolean esEstudiante (Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextBoolean();
    }
}
