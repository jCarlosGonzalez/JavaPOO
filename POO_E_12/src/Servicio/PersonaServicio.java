/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class PersonaServicio {

    private Scanner sc;

    public PersonaServicio() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Ingrese Nombre");
        p.setNombre(sc.nextLine());
        System.out.println("Ingrese año: ");
        int year = sc.nextInt();
        System.out.println("Ingrese mes: ");
        int month = sc.nextInt();
        System.out.println("Ingrese dia: ");
        int day = sc.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(year, month, day);
        p.setFechaNacimiento(fechaNacimiento);
        return p;
    }

}
