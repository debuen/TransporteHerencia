
package modelo;

import excepciones.ExceptionTransporte;

public abstract class VehiculoPersona extends Vehiculo{
    
    private int plazas;

    public VehiculoPersona(int plazas, String matricula) throws ExceptionTransporte {
        super(matricula);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    
    
    
}
