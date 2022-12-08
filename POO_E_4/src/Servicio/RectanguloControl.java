/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class RectanguloControl {

    private Scanner sc;

    public RectanguloControl() {
        sc = new Scanner(System.in);
    }

    public Rectangulo crearRectangulo() {
        Rectangulo r = new Rectangulo();
        System.out.println("Ingrese base: ");
        r.setBase(sc.nextInt());
        System.out.println("Ingrese altura: ");
        r.setAltura(sc.nextInt());
        return r;
    }

    public void perimetro(Rectangulo r1) {
        System.out.println("Perimetro: " + ((r1.getBase() + r1.getAltura() * 2)));
    }

    public void superficie(Rectangulo r2) {
        System.out.println("Superficie: " + (r2.getBase() * r2.getAltura()));
    }
    
    public void dibujarRectangulo(Rectangulo r3) {
        for (int i = 0; i < r3.getAltura(); i++) {
            for (int j = 0; j < r3.getBase(); j++) {
                if (i == 0 || i == (r3.getAltura() - 1) || j == 0 || j == (r3.getBase() - 1)) {
                    System.out.print("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println(" ");
        }
    }

}
