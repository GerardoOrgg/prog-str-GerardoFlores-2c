import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        InputValidator inputvalidator = new InputValidator();
        Scanner sc = new Scanner(System.in);         //  DECLARACION DE UN OBEJTOOOOO
        //I-P-O
        //Input
        int cantidad = inputvalidator.getValidInt("Ingresa la cantidad de articulos", sc);

        //Proceso
        ticket.process(cantidad);

        //Output
        ticket.imprimirTicket(cantidad);
    }
}
