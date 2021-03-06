
package modelo;


public abstract class Camion extends VehiculoCarga{

    public Camion(int pma, String matricula) {
        super(pma, matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
        double base = 50*dias;
        double carga = 50*getPma();
        return base + carga + 40;
    }
    
    
    
}
