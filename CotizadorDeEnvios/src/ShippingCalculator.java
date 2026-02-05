public class ShippingCalculator {

    public double subtotal;
    public double IVA = 0.16;
    public double iva;
    public double total;

    public void process(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota){
        calcularSubtotal(pesoKg, distanciaKm,tipoServicio, zonaRemota);
        calcularIVA(this.subtotal);
        calcularTotal();
    }

    private void calcularSubtotal(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota) {
        double subtotal = 0;
        if (tipoServicio == 1) {
            subtotal += 50;
        } else if (tipoServicio == 2) {
            subtotal += 90;
        }
        subtotal += pesoKg * 12;
        if (distanciaKm <= 50) {
            subtotal += 20;
        } else if (distanciaKm <= 200) {
            subtotal += 60;
        } else {
            subtotal += 120;
        }
        if (zonaRemota) {
            subtotal *= 1.10;
        }
        this.subtotal = subtotal;
    }

    private void calcularIVA(double subtotal) {
        this.iva = subtotal * IVA;
    }

    private void calcularTotal() {
        this.total =  this.iva + this.subtotal;
    }

    public void imprimirTicket(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota){
        System.out.println("------ ticket------");
        System.out.println("El servicio fue:"+tipoServicio);
        System.out.println("El peso fue :"+pesoKg);
        System.out.println("La distancia fue:"+distanciaKm);
        System.out.println("La zona fue remota?:"+zonaRemota);
        System.out.println("El subtotal fue :"+this.subtotal);
        System.out.println("El IVA fue :"+this.iva);
        System.out.println("El total final fue :"+this.total);
        System.out.println("------ ticket------");
    }
}
