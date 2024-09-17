package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * @author danie
 */
public class Ejercicio3CadenasEquals {
    
    public static void main(String args[]){
        //Realizar un programa que compare dos nombres para verificar que son iguales, mostrando
        //un mensaje en pantalla (Los nombres son iguales o Los nombres no son iguales)
        String nombre;
        
        //Declaro objeto scanner para ingresar nombre por teclado o entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        nombre = teclado.nextLine();
        
        //Condicional que compara si el nombre es igual a "Juan" independientemente 
        //de si la entrada ingresada tiene minusculas o mayusculas
        if(nombre.equalsIgnoreCase("Juan"))
            System.out.println("Los nombres son iguales");
        else
            System.out.println("Los nombre no son iguales");   
        
        
    }
        
    
}
