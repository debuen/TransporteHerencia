
package modelo;

import excepciones.ExceptionTransporte;


public abstract class Vehiculo {
    
    private String matricula;

    public Vehiculo(String matricula) throws ExceptionTransporte {
        if(matricula.length() == 7){
            this.matricula = matricula;
        }else{
            throw new ExceptionTransporte("ERROR. Matricula incorrecta");
        }
        
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws ExceptionTransporte {
        if(matricula.length() == 7){
            this.matricula = matricula;
        }else{
            throw new ExceptionTransporte("ERROR. Matricula incorrecta");
        }    
    }
    
    public double calcularAlquiler(int dias){
        return 50*dias;
    }
    
    
    
}
