import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        PedirDatos pedirdatos = new PedirDatos();
        Alumno[] alumnos = new Alumno[20];
        Alumno alumno = new Alumno();

        do {
            System.out.println("             --- Menu  ---                ");
            System.out.println("1) Alta Alumno");
            System.out.println("2) Buscar por ID");
            System.out.println("3) Baja lógica por ID");
            System.out.println("4) Listar activas");
            System.out.println("5) Actualizar nombre por ID ");
            System.out.println("6) Reportes ");
            System.out.println("0) Salir");
            System.out.print("Ingrese la opcion: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("--- Alta ---");
                    int id = pedirdatos.Id("Ingresa el ID: ", sc, alumnos, contador);
                    String name = pedirdatos.name("Ingresa el nombre: ", sc);
                    double promedio = pedirdatos.leePromedio("Ingrese el promedio del alumno: ",sc, 0,10);
                    boolean isactive = pedirdatos.isActivo("Esta activo? ", sc);
                    alumno = new Alumno(id, name, isactive,promedio);
                    alumnos[contador] = alumno;
                    contador++;
                    System.out.println(" ---  Alunmo registrada correctamente.  ---- ");
                    break;
                case 2:
                    System.out.println("--- Buscar por ID ---");
                    System.out.print("Ingrese el ID que quiere buscar: ");
                    int buscarid = sc.nextInt();
                    for (int i = 0; i < contador; i++) {
                        if (alumnos[i].isActive()) {
                            if (alumnos[i].getId() == buscarid) {
                                System.out.println("ID: " + alumnos[i].getId());
                                System.out.println("Nombre: " + alumnos[i].getName());
                                System.out.println("Activo: " + alumnos[i].isActive());
                                System.out.println("Promedio: " + alumnos[i].getPromedio());
                                System.out.println("-------------------");
                            }
                        } else {
                            System.out.println(" -- La persona no esta activa -- ");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el ID a dar de baja: ");
                    buscarid = sc.nextInt();
                    for (int i = 0; i < contador; i++) {
                        if (alumnos[i].getId() == buscarid){
                            alumnos[i].setActive(false);
                            System.out.println(" -- La baja ha sido exitosa --");
                        }
                    }
                    break;
                case 4:
                    System.out.println("--- Listas Activas --- ");
                    for (int i = 0; i < contador; i++) {
                        if (alumnos[i].isActive()) {
                            System.out.println("-------------------");
                            System.out.println("ID: " + alumnos[i].getId());
                            System.out.println("Nombre: " + alumnos[i].getName());
                            System.out.println("Activo: " + alumnos[i].isActive());
                            System.out.println("Promedio: " + alumnos[i].getPromedio());
                            System.out.println("-------------------");
                        }
                    }
                    break;
                case 5:
                    System.out.println("---- Actualizar promedio por ID ----");
                    System.out.print("Ingresa el ID a actulizar: ");
                    buscarid = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < contador; i++) {

                        if (alumnos[i].getId() == buscarid) {

                            if (alumnos[i].isActive()) {
                                promedio = pedirdatos.leePromedio("Ingresa el nuevo promedio: ", sc, 0, 10);
                                alumnos[i].setPromedio(promedio);
                                System.out.println("--- Promedio actualizado correctamente");
                            } else {
                                System.out.println("La persona no esta activa");
                            }

                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("---- Reportes ----");
                    double suma = 0;
                    double PromedioMayor = 0;
                    double PromedioMenor = 10;
                    int contadorpromedio=0;
                    int contadoralumnos=0;
                    for (int i = 0; i < contador; i++) {
                        if (alumnos[i].isActive()) {
                            suma += alumnos[i].getPromedio();
                            contadorpromedio++;
                        }
                        if (alumnos[i].getPromedio() > PromedioMayor){
                            PromedioMayor = alumno.getPromedio();
                        }
                        if (alumnos[i].getPromedio() < PromedioMenor){
                            PromedioMenor = alumno.getPromedio();
                        }
                        if(alumnos[i].getPromedio() >= 8){
                            contadoralumnos++;
                        }
                    }
                    System.out.println("El promedio General De Alumnos es: "+suma/contadorpromedio);
                    System.out.println("El promedio mayor es: "+PromedioMayor);
                    System.out.println("El promedio menor es: "+PromedioMenor);
                    System.out.println("Alumnos que tienen promedio mayor igual a 8: "+contadoralumnos);
                    break;
                default:
                    System.out.println("Error");
            }

        }while(opc != 0);

        System.out.println("El menu ha terminado :)");
    }
}
