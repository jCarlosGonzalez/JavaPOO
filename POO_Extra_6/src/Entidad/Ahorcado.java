/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author carlos_juan
 */
public class Ahorcado {

    //private ArrayList<Character> palabraSecrata = new ArrayList<>();
    private char[] palabraSecreta;
    private int letrasAcertada;
    private int intentoMaximo;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraSecreta, int letrasAcertada, int intentoMaximo) {
        this.palabraSecreta = palabraSecreta;
        this.letrasAcertada = letrasAcertada;
        this.intentoMaximo = intentoMaximo;
    }     

    public char[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(char[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getLetrasAcertada() {
        return letrasAcertada;
    }

    public void setLetrasAcertada(int letrasAcertada) {
        this.letrasAcertada = letrasAcertada;
    }

    public int getIntentoMaximo() {
        return intentoMaximo;
    }

    public void setIntentoMaximo(int intentoMaximo) {
        this.intentoMaximo = intentoMaximo;
    }

   
}
