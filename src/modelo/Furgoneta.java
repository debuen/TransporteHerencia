
package modelo;


public abstract class Furgoneta extends VehiculoCarga{
    
    private boolean refrigeracion;

    public Furgoneta(boolean refrigeracion, int pma, String matricula) {
        super(pma, matricula);
        this.refrigeracion = refrigeracion;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    @Override
    public double calcularAlquiler(int dias){
        double base = 50*dias;
        double carga = 20*getPma();
        double alquiler = base + carga;
        if(refrigeracion){
            alquiler += 10*dias;
        }
        return alquiler;
    }
    
    
    
}
