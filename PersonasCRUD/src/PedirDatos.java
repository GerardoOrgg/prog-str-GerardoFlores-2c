import java.util.Scanner;

public class PedirDatos {
    Persona persona = new Persona();

    public int Id (String message, Scanner sc){
        int id;
        while(true){
            System.out.println(message);
            if(sc.hasNextInt()){
                id = sc.nextInt();
                if (id > 0){
                    if (id == persona.getId()){
                        System.out.println("El id esta siendo repetido");
                    }
                    return id;
                }
                System.out.println("El id es negativo");
            } else {
                System.out.println("El valor  no es numerico");
                sc.nextLine();
            }
        }
    }

    public String name (String message, Scanner sc){
        String name;
        while(true){
            System.out.println(message);
            name = sc.nextLine();
            if(name!= null && !name.isEmpty()){
                System.out.println("El texto esta vacio");
            } else {
                return name;
            }
        }
    }

    public boolean isActivo (String message, Scanner sc){
        boolean isactivo;
        while(true){
            System.out.println(message);
            if(sc.hasNextBoolean()){
                isactivo = sc.nextBoolean();
                return isactivo;
            } else {
                System.out.println("El valor  no es boleano");
                sc.nextLine();
            }
        }
    }
}
