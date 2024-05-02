package seguros;

public class Vehicular extends Polizas {
    private String modelo;
    private String marca;
    
    public Vehicular(String num_poliza, String fecha_inicial, String fecha_final, double costo, String modelo, String marca) {
        super(num_poliza, fecha_inicial, fecha_final, costo);
        this.modelo = modelo;
        this.marca = marca;
    }
    

    public double calcularImpuesto() {
        return getCosto() * 0.16;
    }
    
    public void imprimirDetalles() {
        System.out.println("Número de póliza: " + getNum_poliza());
        System.out.println("Fecha inicial: " + getFecha_inicial());
        System.out.println("Fecha final: " + getFecha_final());
        System.out.println("Costo: " + getCosto());
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }
}