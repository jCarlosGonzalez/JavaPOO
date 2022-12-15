/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class CafeteraServicio {

    private Scanner sc;
    private Cafetera c;

    public CafeteraServicio() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearCafetera() {
        c = new Cafetera();
        System.out.println("Ingrese capacidad maxima de la cafetera: ");
        c.setCapacidadMaxima(sc.nextDouble());      
    }

    public void llenarCafetera() {
        c.setCantidadActual(c.getCapacidadMaxima());
    }

    public void servirTaza(int capacidadTaza) {
        if (capacidadTaza <= c.getCantidadActual()) {
            System.out.println("Taza llena. Retirar!");
            c.setCantidadActual((c.getCantidadActual() - capacidadTaza));
        } else {
            System.out.println("No alcanza para una taza. Recargá la cafetera!");
            System.out.println("Se cargó con: " + c.getCantidadActual());
            vaciarCafetera();
        }
    }

    public void vaciarCafetera() {
        c.setCantidadActual(0);
    }

    public void agregarCafe(int cantidadCafe) {
        if (c.getCapacidadMaxima() >= (c.getCantidadActual() + cantidadCafe)) {
            System.out.println("Se agrega cafe");
            c.setCantidadActual((c.getCantidadActual() + cantidadCafe));
        } else {
            System.out.println("Cafetera llena!");
            llenarCafetera();
        }

    }

    public String mostrar() {
        //System.out.println("Capacidad maxima: " + c.getCapacidadMaxima() + " \nCapacidada actual: " + c.getCantidadActual());
        return c.toString();
    }

}
