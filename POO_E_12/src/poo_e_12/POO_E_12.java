/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_12;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author carlos_juan
 */
public class POO_E_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaServicio ps = new PersonaServicio();    

        Persona p1 = ps.crearPersona();    
       
        System.out.println("Edad: " + p1.calcularEdad());
        
        System.out.println("La persona es menor que 18: " + p1.menorQue(18));
        
        p1.mostrarPersona();
        
    }
    
}
