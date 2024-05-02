package seguros;

public class SeguroVida extends Polizas {
    private int edadAsegurado;
    private boolean fumador;
    
    public SeguroVida(String num_poliza, String fecha_inicial, String fecha_final, double costo, int edadAsegurado, boolean fumador) {
        super(num_poliza, fecha_inicial, fecha_final, costo);
        this.edadAsegurado = edadAsegurado;
        this.fumador = fumador;
    }
    

    public double calcularCostoSeguro() {
       
        double costoBase = 200; 
        double recargoFumador = 100; 
        
        double costoTotal = costoBase;
        

        if (fumador) {
            costoTotal += recargoFumador;
        }
        

        if (edadAsegurado < 18) {
            costoTotal *= 0.8; 
        } else if (edadAsegurado >= 65) {
            costoTotal *= 1.2; 
        }
        
        return costoTotal;
    }
    
   
    public void imprimirDetalles() {
        System.out.println("Número de póliza: " + getNum_poliza());
        System.out.println("Fecha inicial: " + getFecha_inicial());
        System.out.println("Fecha final: " + getFecha_final());
        System.out.println("Costo: " + getCosto());
        System.out.println("Edad del asegurado: " + edadAsegurado);
        System.out.println("Es fumador: " + (fumador ? "Sí" : "No"));
    }
}