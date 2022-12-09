/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_14;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author carlos_juan
 */
public class POO_E_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MovilServicio ms = new MovilServicio();
        
        Movil M = ms.cargarCelular();
        
    }
    
}
