/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Mes;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class MesControl {

    private Scanner sc;

    public MesControl() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public void adivinaMes() {
        int intento = 0;
        String mes;
        Mes m = new Mes();
        m.setMesSecreto(m.getMes(10));
        do {
            intento++;
            System.out.println("Adivine mes secreto: ");
            mes = sc.nextLine();
        } while (!mes.equals(m.getMesSecreto()));
        System.out.println("ADIVINO !!!...");
        System.out.println("Cantidad de intentos: " + intento);

    }

}
