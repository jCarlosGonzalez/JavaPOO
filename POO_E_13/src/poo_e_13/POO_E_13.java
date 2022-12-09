/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_13;

import Entidad.Curso;
import Servicio.CursoControl;

/**
 *
 * @author carlos_juan
 */
public class POO_E_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CursoControl cc = new CursoControl();
        
        Curso C = cc.crearCurso();
        
        cc.calcularGananciaSemanal(C);
    }
    
}
