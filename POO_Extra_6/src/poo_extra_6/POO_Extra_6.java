/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extra_6;

import Entidad.Ahorcado;
import Servicio.AhorcadoControl;

/**
 *
 * @author carlos_juan
 */
public class POO_Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AhorcadoControl ac = new AhorcadoControl();
        
        Ahorcado A = ac.crearJuego();       
         
        ac.juego(A);      
                
    }
    
}
