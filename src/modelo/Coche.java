
package modelo;


public abstract class Coche extends VehiculoPersona{

    public Coche(int plazas, String matricula) {
        super(plazas, matricula);
    }
    
    @Override
    public double calcularAlquiler(int dias) {
    
        double base = 50*dias;
        return base + (1.5 * getPlazas() * dias);
    
    }
   
    
    
}
