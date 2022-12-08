/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_2;

import Entidad.Circunferencia;
import Servicio.CircunferenciaControl;

/**
 *
 * @author carlos_juan
 */
public class POO_E_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CircunferenciaControl c1_Control = new CircunferenciaControl();

        Circunferencia c1 = c1_Control.crearCircunferencia();

        Circunferencia c2 = c1_Control.crearCircunferencia();

        System.out.println(c1.getRadio());

        c1_Control.perimetro(c1);
        
        c1_Control.area(c2);

    }

}
