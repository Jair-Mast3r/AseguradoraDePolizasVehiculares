package seguros;

public class Inmueble extends Polizas {
    private int valor;
    
    public Inmueble(String num_poliza, String fecha_inicial, String fecha_final, double costo, int valor) {
    	super(num_poliza, fecha_inicial, fecha_final, costo);
    	if (costo < 0) {
        	throw new IllegalArgumentException("No puedes tener un costo negativo");
        }
        this.valor = valor;
    }
    
 
    public boolean superaUmbral(int umbral) {
        return valor > umbral;
    }
    

    public double calcularCostoRenovacion() {
       
        return valor * 0.05;
    }
}