/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_10;

//import Entidad.Arreglo;
import java.util.Arrays;

/**
 *
 * @author carlos_juan
 */
public class POO_E_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        double var;
        double A[] = new double[50];
        double B[] = new double[20];
        
        // Carga vector A
        for (int i = 0; i < A.length; i++) {
            var = (Math.round((Math.random() * 100) * 100.0) / 100.0);
            Arrays.fill(A, i, A.length, var);
        }        
        // ordenamiento ascendente
        Arrays.sort(A);
        
        //Impresion 
        System.out.println(Arrays.toString(A));
        System.out.println(""); 
        
        // Carga vector B
        for (int i = 0; i < B.length/2; i++) {
           Arrays.fill(B, i,B.length/2, A[i]);            
        }
        Arrays.fill(B, B.length/2, B.length, 0.5);
        
        // Impresion
        System.out.println(Arrays.toString(B));    
        
        

    }

}
