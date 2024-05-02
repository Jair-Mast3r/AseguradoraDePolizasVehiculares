package seguros;

public class Inmueble extends Polizas {
    private int valor;
    
    public Inmueble(String num_poliza, String fecha_inicial, String fecha_final, double costo, int valor) {
    	super(num_poliza, fecha_inicial, fecha_final, costo);
        this.valor = valor;
    }
    
 
    public boolean superaUmbral(int umbral) {
        return valor > umbral;
    }
    

    public double calcularCostoRenovacion() {
       
        return valor * 0.05;
    }
}