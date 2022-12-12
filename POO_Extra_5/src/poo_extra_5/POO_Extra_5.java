/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extra_5;

import Entidad.Mes;
import Servicio.MesServicio;

/**
 *
 * @author carlos_juan
 */
public class POO_Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MesServicio ms = new MesServicio();
        Mes m = ms.crearMes();
        ms.adivinarMes(m);
        
    }
    
}
