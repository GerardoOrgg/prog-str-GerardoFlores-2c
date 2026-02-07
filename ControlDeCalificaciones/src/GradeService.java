public class GradeService {

    public double calificacionFinal;
    public String estado;

    public void process(double[] calificaciones, boolean entregaproyecto, int asistencia){
        calcularPromedio(calificaciones, asistencia);
        determinarEstado(asistencia, entregaproyecto);
    }

    private void calcularPromedio(double[] calificaiones, int asistencia ) {
        double suma = 0;
        double calificacionFinal;
        for (int i=0;i<3;i++){
            suma += calificaiones[i];
        }
        calificacionFinal = suma/calificaiones.length;
        this.calificacionFinal = calificacionFinal;
    }

    private void determinarEstado(int asistencia, boolean entregaproyecto) {
        if (asistencia < 80 ) {
            estado = "Reprobado por asistencia";
            return;
        } else if (!entregaproyecto) {
            estado = "Reprobado por Proyecto";
            return;
        }
        if (this.calificacionFinal >= 70) {
            estado = "APROABDO";
        } else if (this.calificacionFinal < 70) {
            estado = "REPROBADO por calificación";
        }
        this.estado = estado;
    }

    public void imprimirReporte(String nombrealumno, double[] calificaiones, int asistencia, boolean entregoProyecto){
        System.out.println("Nombre del alumno:"+ nombrealumno);
        for (int i=0;i<3;i++){
            System.out.println("Parcial "+ (i+1) + ":"+ calificaiones[i] );
        }
        System.out.println("Asistencia: " + asistencia + "%");
        System.out.println("Entregó proyecto: " + (entregoProyecto ? "SI" : "NO"));
        System.out.println("Calificación final: " + this.calificacionFinal);
        System.out.println("Estado: " + this.estado);
        System.out.println("------ FIN DEL REPORTE ------");
    }
}
