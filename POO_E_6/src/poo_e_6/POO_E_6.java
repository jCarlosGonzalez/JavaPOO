/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_6;

import Servicio.CafeteraServicio;

/**
 *
 * @author carlos_juan
 */
public class POO_E_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CafeteraServicio cs = new CafeteraServicio();
        
        cs.crearCafetera();
        cs.llenarCafetera();
        cs.servirTaza(120);
        cs.agregarCafe(180);
        System.out.println(cs.mostrar());
        
    }
    
}
