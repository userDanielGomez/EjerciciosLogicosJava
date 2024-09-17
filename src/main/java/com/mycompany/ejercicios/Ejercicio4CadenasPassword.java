package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio4CadenasPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que simule un inicio de sesión solicitando el nombre
        //de usuario y la contraseña, para posteriormente comprarlos y mostrar un
        //mensaje en pantalla que diga "inicio de sesion correcto" o "nombre o 
        //password incorrectos"
        
        String usuario, contrasenia;
        
        //Creación objeto scanner para lectura de datos
        Scanner entrada = new Scanner(System.in);
        
        //Solicitud y lectura de variable usuario con Scanner
        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();
        
        //Solicitud y lectura de variable contraseña con Scanner
        System.out.println("Ingrese su contrasenia");
        contrasenia = entrada.nextLine();
        
        //Condicional verifica usuario sea fito123 y contraseña 12345 e imprime mensaje
        if(contrasenia.equals("12345") && usuario.equals("fito123"))
            System.out.println("--Inicio de sesion correcto--");
        else
            System.out.println("--Usuario o contraseña incorrectos--");
        
    }
    
}
