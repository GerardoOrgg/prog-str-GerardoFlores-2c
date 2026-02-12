import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        PedirDatos pedirdatos = new PedirDatos();
        Persona[] personas = new Persona[20];
        Persona persona = new Persona();

         do {
             System.out.println("Menu");
             System.out.println("1) Alta");
             System.out.println("2) Buscar por ID (solo activas)");
             System.out.println("3) Baja lógica por ID");
             System.out.println("4) Listar activas");
             System.out.println("5) Actualizar nombre por ID (solo activas)");
             System.out.println("0) Salir");
             System.out.print("Ingrese la opcion");
             opc = sc.nextInt();

             switch (opc){
                 case 1:
                     int id = pedirdatos.Id("Ingresa el ID:", sc, personas, contador);
                     String name = pedirdatos.name("Ingresa el nombre:", sc);
                     boolean isactive = pedirdatos.isActivo("Esta activo?", sc);
                     persona = new Persona(id, name, isactive);
                     personas[contador] = persona;
                     contador++;
                     System.out.println("Persona registrada correctamente.");
                     break;
                 case 2:
                     System.out.println("Buscar por ID");
                     System.out.println("Ingrese el ID que quiere buscar");
                     int buscarid = sc.nextInt();
                     for (int i = 0; i < contador; i++) {
                         if (personas[i].getId() == buscarid) {
                             System.out.println("ID: " + personas[i].getId());
                             System.out.println("Nombre: " + personas[i].getName());
                             System.out.println("Activo: " + personas[i].isActive());
                             System.out.println("-------------------");
                         }
                     }
                     break;
                 case 3:
                     System.out.println("Listas Activas");
                     for (int i = 0; i < contador; i++) {
                         if (personas[i].isActive()) {
                             System.out.println("ID: " + personas[i].getId());
                             System.out.println("Nombre: " + personas[i].getName());
                             System.out.println("Activo: " + personas[i].isActive());
                             System.out.println("-------------------");
                         }
                     }
                     break;
                 case 4:
                     System.out.println("Actualizar nombre por ID");
                     System.out.println("Ingresa el Id a actulizar");
                     buscarid = sc.nextInt();
                     for (int i = 0; i < contador; i++) {
                         if (personas[i].getId() == buscarid){
                             name = pedirdatos.name("Ingresa el nuevo nombre", sc);
                             personas[i].setName(name);
                         }
                     }
                     break;
                 default:
                     System.out.println("Error");
             }

         }while(opc != 0);

        System.out.println(personas[0]);
    }
}
