/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_4;

import Entidad.Rectangulo;
import Servicio.RectanguloControl;

/**
 *
 * @author carlos_juan
 */
public class POO_E_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        RectanguloControl rc = new RectanguloControl();

        Rectangulo r = rc.crearRectangulo();

        rc.dibujarRectangulo(r);

    }

}
