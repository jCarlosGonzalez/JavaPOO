/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;
        Persona p = new Persona();
        System.out.println("Ingrese Nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese año: ");
        year = sc.nextInt();
        System.out.println("Ingrese mes: ");
        month = sc.nextInt();
        System.out.println("Ingrese dia: ");
        day = sc.nextInt();
        fechaNacimiento = LocalDate.of(year, month, day);
        return p;
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }

    public boolean menorQue(int edad) {        
        int edadP = calcularEdad();
        return edadP < edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombe: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.getDayOfMonth() + "/" + fechaNacimiento.getMonthValue() + "/" + fechaNacimiento.getYear());
    }

}
