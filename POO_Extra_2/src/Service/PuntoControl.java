/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Punto;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class PuntoControl {

    private Scanner sc;

    public PuntoControl() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Punto crearPunto() {
        Punto p = new Punto();
        System.out.println("Ingrese coordenada x1: ");
        p.setX1(sc.nextInt());
        System.out.println("Ingrese coordenada y1: ");
        p.setY1(sc.nextInt());
        System.out.println("Ingrese coordenada x2: ");
        p.setX2(sc.nextInt());
        System.out.println("Ingrese coordenada y2: ");
        p.setY2(sc.nextInt());
        return new Punto(p.getX1(), p.getY1(), p.getX2(), p.getY2());
    }

    public void calcularDistancia(Punto p) {
        System.out.println("Dintancia entre los puntos " + "(" + p.getX1() + "," + p.getY1() + ")" + " y "
                + "(" + p.getX2() + "," + p.getY2() + "):");

        double distancia = Math.sqrt((Math.pow((p.getX1() - p.getX2()), 2)) + Math.pow((p.getY1() - p.getY2()), 2));
        
        System.out.println(redondeoDecimales(distancia, 2));

    }
    /**
     * Cantidad de decimales a visualizar
     * @param numero
     * @param decimales
     * @return 
     */
    public double redondeoDecimales(double numero, int decimales) {
        double roundOff = Math.pow(10, decimales);
        return Math.round(numero * roundOff) / roundOff;
    }

}
