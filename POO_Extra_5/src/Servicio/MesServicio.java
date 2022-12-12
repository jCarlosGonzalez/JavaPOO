/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class MesServicio {

    private Scanner sc;

    public MesServicio() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Mes crearMes() {
        Mes M = new Mes();
        int indice = generarNumeroAleatorio(1, 12);
        M.setMesSecreto(M.getMes()[indice]);
        return M;
    }

    public void adivinarMes(Mes M1) {
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
        while (!(M1.getMesSecreto().equals(sc.nextLine()))) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
        }
        System.out.println("¡Ha acertado!");
    }

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
}
