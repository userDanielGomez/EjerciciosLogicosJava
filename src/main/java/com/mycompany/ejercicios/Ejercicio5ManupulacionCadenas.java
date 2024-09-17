/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio5ManupulacionCadenas {
    
    public static void main(String [] args){
        /** Realizar un programa que solicite desde teclado una cadena de caracteres
        posteriormente el programa debe indicar a través de un mensaje en pantalla 
        la cantidad de caracteres que posee dicha cadena. Finalmente el programa 
        debe preguntar al usuario que parte de la cadena desea obtener
        **/
        
        String cadena;
        int var1, var2;
        
        //Declaración de objeto Scanner para la lectura de entrada de texto
        Scanner teclado = new Scanner(System.in);
        
        //Solicitud y lectura de la variable cadena
        System.out.println("Por favor ingrese una cadena de texto");
        cadena = teclado.nextLine();
        
        //Bucle para solicitar y obtener val1 y asegurarse que sea un número
        while(true){
            try{
                System.out.println("Ingrese el numero desde donde quiere obtener la cadena");
                var1=Integer.parseInt(teclado.nextLine());
                break;
            }catch(Exception e){
                System.out.println("El valor ingresado debe ser un número");
            }
        }
        
        //Bucle para solicitar y obtener val2 y asegurarse que sea un número
        while(true){
            try{
                System.out.println("Ingrese el numero hasta donde quiere obtener la cadena");
                System.out.println("Nota: La cadena empieza desde el valor 0 !!!");
                var2 = Integer.parseInt(teclado.nextLine());
                break;
            }catch(Exception e){
                System.out.println("El valor ingresado debe ser numérico");
            }
        }
        
        //Impresion de la longitud de la cadena y la subcadena resultante del programa
        System.out.println("La longitud de su cadena original es "+cadena.length());
        System.out.println("La subcadena obtenida es "+cadena.substring(var1,var2));
        
    }
    
}
