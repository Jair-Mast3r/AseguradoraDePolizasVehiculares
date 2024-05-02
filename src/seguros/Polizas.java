package seguros;

public class Polizas {
    private String num_poliza;
    private String fecha_inicial;
    private String fecha_final;
    private double costo;
    
    // Constructor
    public Polizas(String num_poliza, String fecha_inicial, String fecha_final, double costo) {
        this.num_poliza = num_poliza;
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
        this.costo = costo;
    }
    
    public String getNum_poliza() {
        return num_poliza;
    }

    public void setNum_poliza(String num_poliza) {
        this.num_poliza = num_poliza;
    }

    public String getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(String fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
