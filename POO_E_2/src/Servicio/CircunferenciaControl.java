/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class CircunferenciaControl {

    public Circunferencia crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        Circunferencia C1 = new Circunferencia();
        System.out.println("Ingrese radio de la circunferencia: ");
        C1.setRadio(sc.nextDouble());
        return C1;
    }

    public void perimetro(Circunferencia C2) {
        double perimetro = 2 * Math.PI * C2.getRadio();
        System.out.println("Circulo de radio " + C2.getRadio() + " tiene un perimetro de:  " + perimetro);
    }

    public void area(Circunferencia C3) {
        double area = Math.round(Math.PI * (C3.getRadio() * C3.getRadio()) * 1000.0) / 1000.0;
        System.out.println("Circulo de radio " + C3.getRadio() + " tiene un area de:  " + area);
    }

}
