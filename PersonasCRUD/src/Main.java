import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PedirDatos pedirdatos = new PedirDatos();
        Persona[] personas = new Persona[20];
        int id = pedirdatos.Id("Ingresa el ID:", sc);
        String name = pedirdatos.name("Ingresa el nombre:", sc);
        boolean iscative = pedirdatos.isActivo("Esta activo?", sc);

         Persona persona = new Persona(id, name, iscative);


        personas[1] = persona.

    }
}
