/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
