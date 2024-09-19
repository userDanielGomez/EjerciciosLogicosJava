package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio6InversorPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generar código que solicite al usuario una palabra y posteriormente 
        // muestre en consola la palabra invertida usando los metodos
        // .lenth y .substring
        String palabra;
        String palabraNueva = "";
        
        //Declaración objeto Scanner para lectura de teclado
        Scanner teclado = new Scanner(System.in);
        
        //Solicitud y lectura de variable palabra
        System.out.println("Ingrese la palabra que desea invertir");
        palabra = teclado.nextLine();
        
        //Bucle que usa .substring para guardar la palabra invertida en la
        //variable palabraNueva obteniendo letra por letra
        for(int i = palabra.length(); i>0; i--){
            palabraNueva = palabraNueva +palabra.substring(i-1,i);
        }
        
        //Impresión en consola de la palabra invertida
        System.out.println("Su palabra invertida es: "+palabraNueva);
        
        //Se cierra el objeto Scanner
        teclado.close();
        
    }
}
