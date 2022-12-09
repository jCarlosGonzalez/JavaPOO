/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class CuentaServicio {

    private Scanner sc;

    public CuentaServicio() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Cuenta crearCuenta() {
        Cuenta C = new Cuenta();
        System.out.println("Ingrese numero de cuenta");
        C.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese DNI");
        C.setDniCliente(sc.nextLong());
        System.out.println("Ingrese dinero a depositar");
        C.setSaldoActual(sc.nextInt());
        return C;
    }

    public void ingresarDinero(Cuenta C1, double dinero) {
        int actualizarSaldo = C1.getSaldoActual() + (int) dinero;
        C1.setSaldoActual(actualizarSaldo);
    }

    public void retirarDinero(Cuenta C2, double dinero) {
        if (C2.getSaldoActual() < dinero) {
            System.out.println("Supera saldo actual");
            System.out.println("Disponible para retiro: " + C2.getSaldoActual());
            C2.setSaldoActual(0);
        } else {
            int actualizarSaldo = C2.getSaldoActual() - (int) dinero;
            C2.setSaldoActual(actualizarSaldo);
        }
    }

    public void extraccionRapida(Cuenta C3) {
        System.out.println("Dinero disponible para retiro: " + (C3.getSaldoActual() * 0.2));
        System.out.println("Ingrese dinero a retirar");
        if (sc.nextInt() > (C3.getSaldoActual() * 0.2)) {
            System.out.println("ERROR: supera limite");
        } else {
            int actualizarSaldo = C3.getSaldoActual() - sc.nextInt();
            C3.setSaldoActual(actualizarSaldo);
        }
    }
    
    public void consultarSaldo(Cuenta C4){
        System.out.println("Dinero disponible: " + C4.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta C5){
        System.out.println("DNI: " + C5.getDniCliente());
        System.out.println("Numero de cuenta: " + C5.getNumeroCuenta());
        System.out.println("Saldo actual: " + C5.getSaldoActual());
    }
}
