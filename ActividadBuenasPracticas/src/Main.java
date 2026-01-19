import java.util.Scanner;
public class Main {
    public static int RESULTADO = 0;
    public static int CONTADOR = 1;
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        int Entero = pedirEntero(sc, "Dame un numero del 1 al 10");
        int Suma = SumarHastaN(Entero);
        System.out.println(MensajeFinal(Suma));
    }
    public static int pedirEntero (Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }
    public static int SumarHastaN (int Entero){
        for(CONTADOR=1;CONTADOR<=Entero;CONTADOR++){
            RESULTADO+=CONTADOR;
        }
        return RESULTADO;
    }
    public static String MensajeFinal (int numero){
        return "El resultado es:"+RESULTADO;
    }
}
