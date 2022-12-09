/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extra_2;

import Entidad.Punto;
import Service.PuntoControl;

/**
 *
 * @author carlos_juan
 */
public class POO_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PuntoControl pc = new PuntoControl();

        Punto p = pc.crearPunto();

        pc.calcularDistancia(p);

    }

}
