/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class OperacionControl {

    public Operacion crearOperacion() {
        Scanner sc = new Scanner(System.in);
        Operacion O1 = new Operacion();
        System.out.println("Ingrese un numero entero: ");
        O1.setNumero1(sc.nextInt());
        System.out.println("Ingrese otro numero entero: ");
        O1.setNumero2(sc.nextInt());
        return O1;
    }

    public void sumar(Operacion O2) {
        //int suma = O2.getNumero1() + O2.getNumero2();
        System.out.println(O2.getNumero1() + " + " + O2.getNumero2() + " = " + O2.sumar());
    }

    public void restar(Operacion O3) {
        //int resta = O3.getNumero1() - O3.getNumero2();
        System.out.println(O3.getNumero1() + " - " + O3.getNumero2() + " = " + O3.restar());
    }

    public void multiplicar(Operacion O4) {
        if (O4.getNumero1() == 0 || O4.getNumero2() == 0) {
            System.out.println("ERROR: uno o ambos operandos es cero");
            //int multiplicacion = O4.getNumero1() * O4.getNumero2();
            System.out.println(O4.getNumero1() + " * " + O4.getNumero2() + " = " + 0);
        } else {
            //int multiplicacion = O4.getNumero1() * O4.getNumero2();
            System.out.println(O4.getNumero1() + " * " + O4.getNumero2() + " = " + O4.multiplicar());
        }
    }

    public void dividir(Operacion O5) {
        if (O5.getNumero2() == 0) {
            System.out.println("ERROR: divisor es cero");
            System.out.println(O5.getNumero1() + " / " + O5.getNumero2() + " = " + 0);
        } else {
            //double division = (double) O5.getNumero1() / O5.getNumero2();
            System.out.println(O5.getNumero1() + " / " + O5.getNumero2() + " = " + O5.division());
        }
    }

}
