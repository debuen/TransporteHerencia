
package modelo;

import excepciones.ExceptionTransporte;

public abstract class VehiculoCarga extends Vehiculo{
    
    private int pma;

    public VehiculoCarga(int pma, String matricula) throws ExceptionTransporte {
        super(matricula);
        this.pma = pma;
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
    
    
    
}
