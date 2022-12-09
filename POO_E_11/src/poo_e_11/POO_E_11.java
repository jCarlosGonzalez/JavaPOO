/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.YEARS;

import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class POO_E_11 {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int day;
        int month;
        int year;
        String formato = "dd-MM-yyyy";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        System.out.println("Ingrese año: ");
        year = sc.nextInt();
        System.out.println("Ingrese mes: ");
        month = sc.nextInt();
        System.out.println("Ingrese dia: ");
        day = sc.nextInt();
        LocalDate fecha = LocalDate.of(year, month, day);
        LocalDate actual = LocalDate.now();

        System.out.println("Fecha ingresada: " + fecha.format(formateador));
        System.out.println("Fecha Actual: " + actual.format(formateador));

        System.out.println("Han pasado " + YEARS.between(fecha, actual) + " años");
        

    }

}
