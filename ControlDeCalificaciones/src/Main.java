import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeService gradeservice = new GradeService();
        PedirDatos pedirdatos = new PedirDatos();
        Scanner sc = new Scanner(System.in);      //  DECLARACION DE UN OBEJTOOOOO
        //I-P-O
        //Input
        String nombrealumno = pedirdatos.leerTextoNoVacio("Ingresa el nombre del alumno" , sc );
        double[] calificaciones = pedirdatos.leerDoubleEnRango("Ingresa la calificacion del parcial ", 1.0, 100.0, sc);
        int asistencia = pedirdatos.leerIntEnRango("Ingresa la asistencia", 1, 100,  sc);
        boolean entregaproyecto = pedirdatos.leerBoolean("Entrego el proyecto?", sc);

        //Proceso
        gradeservice.process(calificaciones, entregaproyecto, asistencia);

        //Output
        gradeservice.imprimirReporte(nombrealumno, calificaciones, asistencia, entregaproyecto);
    }
}
