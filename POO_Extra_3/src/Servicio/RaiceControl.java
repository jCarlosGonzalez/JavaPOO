/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raice;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class RaiceControl {
    
    private Scanner sc;
    
    public RaiceControl() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Raice crearEcuacion() {
        Raice r = new Raice();
        System.out.println("Ingrese valor de coeficiente a:");
        r.setA(sc.nextInt());
        System.out.println("Ingrese valor de coeficiente b:");
        r.setB(sc.nextInt());
        System.out.println("Ingrese valor de coeficiente c:");
        r.setC(sc.nextInt());
        return r;
    }

    /**
     * Ecuacion Cuadratica --> ax2 + bx + c
     *
     * @param r
     * @return
     */
    public double getDiscriminante(Raice r) {
        double D = (Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC());
        return redondeoDecimales(D, 2);
    }
    
    public boolean tieneRaices(Raice r1) {
        
        return getDiscriminante(r1) > 0;
        
    }
    
    public boolean tieneRaiz(Raice r2) {
        
        return getDiscriminante(r2) == 0;
        
    }
    
    public void obtenerRaices(Raice r3) {
        if (tieneRaices(r3)) {
            double d = getDiscriminante(r3);
            double x1 = ((-1 * r3.getB()) + Math.sqrt(d)) / (2 * r3.getA());
            double x2 = ((-1 * r3.getB()) - Math.sqrt(d)) / (2 * r3.getA());
            System.out.println("Solucion 1 --> x = " + x1);
            System.out.println("Solucion 2 --> x = " + x2);
        } else {
            System.out.println("ERROR: discriminate es menor a cero");
        }
    }
    
    public void obtenerRaiz(Raice r4) {
        if (tieneRaices(r4)) {
            double d = getDiscriminante(r4);
            double x = ((-1 * r4.getB()) + Math.sqrt(d)) / (2 * r4.getA());
            System.out.println("Solucion unica --> x = " + x);
            
        } else {
            System.out.println("ERROR: discriminate es menor a cero");
        }
    }
    
    public void calcular(Raice r5) {
        
        if (tieneRaiz(r5)) {
            obtenerRaiz(r5);
        } else if (tieneRaices(r5)) {
            obtenerRaices(r5);
        } else {
            System.out.println("Discriminate (" + getDiscriminante(r5) + ") es menor a cero");
            System.out.println("Ecuacion NO tiene solucion");
        }
    }
    
    public double redondeoDecimales(double numero, int decimales) {
        double roundOff = Math.pow(10, decimales);
        return Math.round(numero * roundOff) / roundOff;
    }
}
