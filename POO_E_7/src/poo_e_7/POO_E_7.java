/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_7;

import Entidad.Persona;
import Servicio.PersonaControl;

/**
 *
 * @author carlos_juan
 */
public class POO_E_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int longitud = 4;

        PersonaControl pc = new PersonaControl();
        
        Persona[] arrayP = pc.arregloPersona(longitud);       

        pc.porcentajeGeneral(arrayP);
    }

}
