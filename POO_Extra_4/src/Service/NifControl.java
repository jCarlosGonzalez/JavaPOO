/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class NifControl {

    private Scanner sc;
    private String strLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
    //private char[] vectorLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public NifControl() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public NIF crearNIF() {
        NIF nif = new NIF();
        System.out.println("Ingrese Documento Nacional de Identidad: ");
        nif.setNumeroDNI(sc.nextLong());
        int indice = calcularLetra(nif.getNumeroDNI());
        nif.setLetraDNI(strLetras.charAt(indice));
        return nif;
    }

    public void mostrar(NIF nif1) {
        System.out.println(nif1.getNumeroDNI()+"-"+nif1.getLetraDNI());
    }

    public int calcularLetra(long nDNI) {
        return (int) (nDNI % 23);
    }

}
