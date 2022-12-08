/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_3;

import Entidad.Operacion;
import Servicio.OperacionControl;

/**
 *
 * @author carlos_juan
 */
public class POO_E_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionControl c1 = new OperacionControl();
        
        Operacion o1 = c1.crearOperacion();
        System.out.println("");
        c1.sumar(o1);
        System.out.println("");
        c1.restar(o1);
        System.out.println("");
        c1.multiplicar(o1);
        System.out.println("");
        c1.dividir(o1);
        System.out.println("");
        System.out.println(o1.toString());
    }
    
}
