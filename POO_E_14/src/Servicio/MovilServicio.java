/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class MovilServicio {

    private Scanner sc;

    // private Movil M1 = new Movil();
    public MovilServicio() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Movil cargarCelular() {
        Movil m = new Movil();       
        System.out.println("Ingrese marca: ");
        m.setMarca(sc.nextLine());
        System.out.println("Ingrese Modelo: ");
        m.setModelo(sc.nextLine());
        System.out.println("Ingrese capacidad de memoria RAM: ");
        m.setMemoriaRam(sc.nextInt());
        System.out.println("Ingrese capacidad de almacenamiento: ");
        m.setAlmacenamiento(sc.nextInt());
        System.out.println("Ingrese precio: ");
        m.setPrecio(sc.nextDouble());
        ingresarCodigo(m);
        return m;
    }

    public void ingresarCodigo(Movil M) {
        
        for (int i = 0; i < M.getCodigo().length; i++) {
            System.out.println("Ingrese numero correspondiente al codigo " + i + " : ");
            M.getCodigo()[i]= sc.nextInt();
        }
    }

}
