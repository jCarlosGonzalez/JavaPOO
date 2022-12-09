/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extra_4;

import Entidad.NIF;
import Service.NifControl;

/**
 *
 * @author carlos_juan
 */
public class POO_Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       

        NifControl nc = new NifControl();
        NIF nif_1 = nc.crearNIF();
        System.out.println("");
        nc.mostrar(nif_1);
    }

}
