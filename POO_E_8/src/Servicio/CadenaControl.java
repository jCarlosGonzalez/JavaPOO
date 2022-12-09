/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;
import static poo_e_8.POO_E_8.sc;

/**
 *
 * @author carlos_juan
 */
public class CadenaControl {

    private Scanner sc;

    public CadenaControl() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Cadena cargarFrase() {
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase: ");
        c1.setFrase(sc.nextLine());
        c1.setFraseLongitud(c1.getFrase().length());
        System.out.println("");
        return c1;
    }

    public void mostrarVocales(Cadena C) {
        int cantidadVocales = 0;
        for (int i = 0; i < C.getFraseLongitud(); i++) {
            switch (C.getFrase().toLowerCase().charAt(i)) {
                case 'a':
                    cantidadVocales++;
                    break;
                case 'e':
                    cantidadVocales++;
                    break;
                case 'i':
                    cantidadVocales++;
                    break;
                case 'o':
                    cantidadVocales++;
                    break;
                case 'u':
                    cantidadVocales++;
                    break;
            }
        }
        System.out.println("Cantidad de vocales: ");
        System.out.println(cantidadVocales);
        System.out.println("");
    }

    public void invertirFrase(Cadena C) {
        System.out.println("Frase invertida: ");
        for (int i = C.getFraseLongitud() - 1; i >= 0; i--) {
            System.out.print(C.getFrase().charAt(i));
        }
        System.out.println("");
    }

    public int vecesRepetido(Cadena C, char letra) {
        int contador = 0;
        for (int i = 0; i < C.getFraseLongitud(); i++) {
            if (letra == C.getFrase().charAt(i)) {
                contador++;
            }
        }
        return contador;
    }

    public void compararLongitud(Cadena C, String fraseNueva) {

        if (C.getFraseLongitud() == fraseNueva.length()) {
            System.out.println("La longitud de las frases son iguales");
        } else {
            System.out.println("La longitud de las frases NO son iguales");
        }
    }

    public void unirFrases(Cadena C, String fraseNueva) {
        System.out.println(C.getFrase().concat((" " + fraseNueva)));
    }

    public void reemplazar(Cadena C, String letra) {

        System.out.println(C.getFrase().replace('a', letra.charAt(0)));
    }

    public boolean  contiene(Cadena C, String letra) {

        return C.getFrase().indexOf(letra) == -1;

    }

}
