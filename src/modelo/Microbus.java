
package modelo;


public abstract class Microbus extends VehiculoPersona{

    public Microbus(int plazas, String matricula) {
        super(plazas, matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
    
        return super.calcularAlquiler(dias) + 2*getPlazas();
    
    }
    
    
    
}
