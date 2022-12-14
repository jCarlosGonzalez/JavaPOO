/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class CursoControl {

    private Scanner sc;

    public CursoControl() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarAlumnos(Curso C) {
        for (int i = 0; i < C.getAlumnosV().length; i++) {
            System.out.println("Ingrese nombre alumno: ");
            C.getAlumnosV()[i] = sc.nextLine();
        }
        //return C;
    }

    public Curso crearCurso() {
        Curso c = new Curso();
        System.out.println("Ingrese nombre de curso: ");
        c.setNombreCurso(sc.nextLine());
        System.out.println("Ingrese Turno (mañana o tarde): ");
        c.setTurno(sc.nextLine());
        System.out.println("Ingrese cantidad de horas por dia: ");
        c.setCantidadHorasPorDia(sc.nextInt());
        System.out.println("Ingrese cantidad de dias por semana: ");
        c.setCantidadDiasPorSemana(sc.nextInt());
        System.out.println("Ingrese precio por hora: ");
        c.setPrecioPorHora(sc.nextDouble());
        sc.nextLine();
        cargarAlumnos(c);
        return c;
    }

    public void calcularGananciaSemanal(Curso C) {
        double ganacia = C.getPrecioPorHora() * C.getCantidadHorasPorDia() * C.getCantidadDiasPorSemana() * C.getAlumnosV().length;
        System.out.println("Ganancia del curso " + C.getNombreCurso() + " es: " + ganacia);
    }

}
