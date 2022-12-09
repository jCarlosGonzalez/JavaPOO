/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
//import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class PersonaControl {

    Scanner sc = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese nombre de la persona: ");
        p1.setNombre(sc.nextLine());
        System.out.println("Ingrese edad de la persona: ");
        p1.setEdad(sc.nextInt());
        sc.nextLine();
        do {
            System.out.println("Ingrese sexo: ");
            System.out.println(" H <-- Hombre");
            System.out.println(" M <-- Mujer ");
            System.out.println(" O <-- Otro");
            p1.setSexo(sc.next().toUpperCase().charAt(0));
        } while (!(p1.getSexo() == 'H') && !(p1.getSexo() == 'M') && !(p1.getSexo() == 'O'));
        System.out.println("Ingrese peso en kg: ");
        p1.setPeso(sc.nextFloat());
        System.out.println("Ingrese altura en metros: ");
        p1.setAltura(sc.nextFloat());
        sc.nextLine();
        return p1;
    }

    public int controlIMC(Persona p2) {

        float imc = p2.calcularIMC();

        if (imc < 20) {
            return -1;
        } else if (imc <= 25 && imc >= 20) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean esMayor(Persona p3){
        
        return p3.esMayorDeEdad();    
    
    }
    
    public Persona[] arregloPersona(int T){
        
        Persona[] arrayP = new Persona[T];
        
        for (int i = 0; i < arrayP.length; i++) {
            arrayP[i] = crearPersona();           
        }        
        return arrayP;       
    }
    
    public void porcentajeGeneral(Persona P[]){
        
        double bajo = 0, ideal = 0, encima = 0;
        double mayor = 0, menor = 0;
        
        int[] imcP = new int[P.length];
        boolean[] esM = new boolean[P.length];

        for (int i = 0; i < P.length; i++) {
            imcP[i] = controlIMC(P[i]);
            esM[i] = esMayor(P[i]);
            if (esM[i] == true) {
                mayor++;
            } else {
                menor++;
            }
            switch (imcP[i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;

                    break;
                case 1:
                    encima++;
                    break;
                default:
                    System.out.println("Error");
            }
        }

        System.out.println("Porcentaje por debajo " + ((bajo * 100) / imcP.length));
        System.out.println("Porcentaje ideal " + ((ideal * 100) / imcP.length));
        System.out.println("Porcentaje por encima " + ((encima * 100) / imcP.length));
        System.out.println("");
        System.out.println("Porcentaje mayor edad: " + ((mayor * 100) / esM.length));
        System.out.println("Porcentaje menor edad: " + ((menor * 100) / esM.length));   
    
    }

}
