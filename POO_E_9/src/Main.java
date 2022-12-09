
import Entidad.Matematica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LuiG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero1 = Math.random()*100;
        System.out.println(numero1);
        double numero2 = Math.random()*10;
        
        System.out.println(numero2);
        Matematica m1 = new Matematica();
        
        m1.setNumero1(numero1);
        m1.setNumero2(numero2);
        
        System.out.println(m1.getNumero1());
        System.out.println("");
        System.out.println(m1.getNumero2());      
        System.out.println(m1.numeroMayor());
        
        
        
        // TODO code application logic here
    }
    
}
