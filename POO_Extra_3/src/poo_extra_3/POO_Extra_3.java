/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extra_3;

import Entidad.Raice;
import Servicio.RaiceControl;

/**
 *
 * @author carlos_juan
 */
public class POO_Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        RaiceControl rc = new RaiceControl();
        
        Raice r1 = rc.crearEcuacion();
        
        //System.out.println(rc.getDiscriminante(r1));
        
        //rc.obtenerRaices(r1);
        
        //rc.obtenerRaiz(r1);
        
        rc.calcular(r1);
    }

}
