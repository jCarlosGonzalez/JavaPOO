/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class AhorcadoControl {

    private Scanner sc;

    public AhorcadoControl() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Ahorcado crearJuego() {
        Ahorcado A = new Ahorcado();
        System.out.println("Ingrese una palabra: ");
        A.setPalabraSecreta(sc.nextLine().toCharArray());
        System.out.println("Ingrese cantidad de intento maximo: ");
        A.setIntentoMaximo(sc.nextInt());
        A.setLetrasAcertada(0);
        return A;
    }

    public void longitud(Ahorcado A) {
        System.out.println("Longitud de la palabra secreta: " + A.getPalabraSecreta().length);
    }

    public boolean buscar(char[] cadena, char letra) {
        // Convierte una array de caracteres en una string
        String str = new String(cadena);
        return str.contains(String.valueOf(letra));
    }

    public char[] palabraGuiones(Ahorcado W) {
        char[] letraGuiones = new char[W.getPalabraSecreta().length];
        for (int i = 0; i < letraGuiones.length; i++) {
            letraGuiones[i] = '_';
        }
        return letraGuiones;
    }

    public void mostrarPalabrasGuiones(char[] vector) {
        
        System.out.println("--------------------");
        System.out.print("   ");
        for (char c : vector) {
            System.out.print(" " + c + " ");
        }
        System.out.println("");
        System.out.println("--------------------");

    }

    public void encontradas(Ahorcado X, char letra, char[] vGuiones) {
        boolean contieneLetra = buscar(X.getPalabraSecreta(), letra);
        int cantidadLetras = 0;
        if (contieneLetra) {
            for (int i = 0; i < X.getPalabraSecreta().length; i++) {
                if (X.getPalabraSecreta()[i] == letra) {
                    cantidadLetras++;
                    vGuiones[i] = letra;
                }
            }
            X.setLetrasAcertada(X.getLetrasAcertada() + cantidadLetras);
            System.out.println("Cantidad de letras (encontradas, faltantes) -> (" + X.getLetrasAcertada() + "," + (X.getPalabraSecreta().length - X.getLetrasAcertada()) + ")");
            //return contieneLetra;
        } else {
            X.setIntentoMaximo(X.getIntentoMaximo() - 1);
            System.out.println("Cantidad de letras (encontradas, faltantes) -> (" + X.getLetrasAcertada() + "," + (X.getPalabraSecreta().length - X.getLetrasAcertada()) + ")");
            //return contieneLetra;
        }
    }

    public void intentos(Ahorcado P) {
        System.out.println("Número de oportunidades restantes: " + P.getIntentoMaximo());
    }

    public void juego(Ahorcado A) {
        char letra;
        char[] pGuiones = palabraGuiones(A);
        do {
            System.out.println("Ingrese una letra: ");
            letra = sc.next().charAt(0);
            longitud(A);
            if (buscar(A.getPalabraSecreta(), letra)) {
                System.out.println("La letra PERTENECE a la palabra");
            } else {
                System.out.println("La letra NO PERTENECE a la palabra");
            }
            encontradas(A, letra, pGuiones);
            intentos(A);
            System.out.println("");
            mostrarPalabrasGuiones(pGuiones);
        } while (!(A.getLetrasAcertada() == A.getPalabraSecreta().length) && A.getIntentoMaximo() != 0);

        if (A.getLetrasAcertada() == A.getPalabraSecreta().length) {
            System.out.println("Felicidades. Has acertado la palabra!!!");
        } else {
            System.out.println("Perdio :( !!! La palabra secreta era: " + String.valueOf(A.getPalabraSecreta()));
        }

    }

}

//
