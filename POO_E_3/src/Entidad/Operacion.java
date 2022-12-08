/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author carlos_juan
 */
public class Operacion {

    // Atributo
    private int numero1;
    private int numero2;

    //Contructor 
    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int sumar() {
        return (numero1 + numero2);
    }

    public int restar() {
        return (numero1 - numero2);
    }

    public int multiplicar() {
        return (numero1 * numero2);
    }

    public double division() {
        return ((double) numero1 / (double) numero2);
    }

    @Override
    public String toString() {
        return "Operacion{" + "Numero 1 = " + numero1 + ", Numero 2 = " + numero2 + '}';
    }

}
