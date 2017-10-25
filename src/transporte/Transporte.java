
package transporte;

import java.util.ArrayList;
import modelo.Camion;
import modelo.Coche;
import modelo.Furgoneta;
import modelo.Microbus;
import modelo.Vehiculo;

public class Transporte {

    public static void main(String[] args) {
        
        Furgoneta f = new Furgoneta(true, 2500, "1234QWE") {};
        Camion ca = new Camion(10000, "123456ZXC") {};
        Coche co = new Coche(5, "5678ASD") {};
        Microbus m = new Microbus(25, "6758SDF") {};
        
        ArrayList <Vehiculo> flota = new ArrayList<>();
        
        flota.add(f);
        flota.add(ca);
        flota.add(co);
        flota.add(m);
        
        //Vehiculos y precio alquiler 8 dias
        for(Vehiculo v : flota){
            System.out.println("Matricula " + v.getMatricula() + " Alquiler:" +v.calcularAlquiler(8));
        }
        
        //datos de todos los vehiculos
        for(Vehiculo v:flota){
            System.out.println("Vehiculo con matricula "+ v.getMatricula());
                if(v instanceof Furgoneta){
                    Furgoneta aux = (Furgoneta) v;
                    System.out.print("Es una furgoneta");
                    System.out.print("Refrigeracion: " + aux.isRefrigeracion());
                    //System.out.print("Pma: " + aux.pma);
                }
        }
    }
    
}
