/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_8;

import Entidad.Cadena;
import Servicio.CadenaControl;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class POO_E_8 {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CadenaControl fraseControl = new CadenaControl();

        Cadena frase = fraseControl.cargarFrase();

        fraseControl.mostrarVocales(frase);

        fraseControl.invertirFrase(frase);

        System.out.println("Ingrese una letra: ");
        char letra = sc.nextLine().charAt(0);
        System.out.println("Letra " + letra + " esta contenida: " + fraseControl.vecesRepetido(frase, letra));
        System.out.println("");

        System.out.println("Ingrese una frase: ");
        fraseControl.compararLongitud(frase, sc.nextLine());

        System.out.println("Ingrese una frase: ");

        fraseControl.unirFrases(frase, sc.nextLine());

        System.out.println("Ingrese una letra para reemplazar");

        fraseControl.reemplazar(frase, sc.nextLine());

        System.out.println("Ingrese otra letra: ");
        System.out.println("La frase contien la letra " + letra + " : " + fraseControl.contiene(frase, sc.nextLine()));
        
    }

}
