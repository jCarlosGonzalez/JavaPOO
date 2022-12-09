/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_5;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class POO_E_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CuentaServicio cs = new CuentaServicio();
        Cuenta C1 = cs.crearCuenta();
        char opcion;
        do {
            System.out.println("Elija operacion");
            System.out.println("A <-- Ingresar Dinero");
            System.out.println("B <-- Retirar Dinero");
            System.out.println("C <-- Retiro Rapido");
            System.out.println("D <-- Consultar Saldo");
            System.out.println("E <-- Consultar Datos");
            System.out.println("F <-- Salir");
            opcion = sc.next().toUpperCase().charAt(0);
            switch (opcion) {
                case 'A':
                    System.out.println("Ingrese monto a depositar");
                    cs.ingresarDinero(C1, sc.nextInt());
                    break;
                case 'B':
                    System.out.println("Ingrese monto a retirar");
                    cs.retirarDinero(C1, sc.nextInt());
                    break;
                case 'C':
                    cs.extraccionRapida(C1);
                    break;
                case 'D':
                    cs.consultarSaldo(C1);
                    break;
                case 'E':
                    cs.consultarDatos(C1);
                    break;
                case 'F':
                    opcion = 'F';
                    break;
                default:
                    System.out.println("Opcion no valida");                    
            }            
        } while (opcion != 'F');
        
    }
    
}
