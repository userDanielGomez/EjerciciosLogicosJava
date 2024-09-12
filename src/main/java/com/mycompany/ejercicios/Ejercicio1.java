/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //La empresa packiManias solicita un sistema que determine los días de vacaciones
        //a los que tiene derecho un trabajador tomando en cuenta las siguientes caracteristicas
        //Existen 3 departamentos  (1-Atención al cliente)   (2-Departamento logística)   (3-Gerencia)
        //Relacion de años de servicio con días de vacaciones
        //Clave-1 (1 año 6 días)  (2 a 6 años 14 días) (A partir de 7 años 20 días)
        //Clave-2 (1 año 7 días)  (2 a 6 años 15 días) (A partir de 7 años 22 días)
        //Clave-3 (1 año 10 días) (2 a 6 años 20 días) (A partir de 7 años 30 días)
        //El sistema debe de solicitar el Nombre, clave del departamento y antiguedad del trabajador
        //Posterormente mostrar un mensaje con nombre años trabajados y días de vacacioens a los que tiene derecho
        
        Scanner teclado = new Scanner(System.in);
        
        //Declaración e inicialización de variables
        String nombre;
        int departamento=0;
        int antiguedad=0;
        int vacaciones=0;
        
        //Solicitud y asignación del nombre del empleado
        System.out.println("Ingrese el nombre del empleado");
        nombre = teclado.nextLine();
        
        //Bucle para validar que el usuario ingrese un departamento valido (menor a 3 y mayor a 0)
        while(true){
            try {
                System.out.println("Ingrese el departamento del empleado");
                departamento=Integer.parseInt(teclado.nextLine());
                if(departamento<=3 && departamento>0)
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un dato valido");
            }
        }
        
        //Bucle para asegurar que al trabajador se le asigne un valor numerico
        while(true){
            try{
                System.out.println("Ingrese los años de antiguedad del empleado");
                antiguedad = Integer.parseInt(teclado.nextLine());
                break;
            } catch(Exception e){
                System.out.println("Ingrese un valor válido");
            }
        }
        
        //Switch que determina dias de vacaciones del trabajador en base a departamento y años de antiguedad
        switch (departamento) {
            case 1:
                if(antiguedad==1)
                    vacaciones=6;
                if(antiguedad>1 && antiguedad<7)
                    vacaciones=14;
                if(antiguedad>7)
                    vacaciones=20;
            case 2:
                if(antiguedad==1)
                    vacaciones=7;
                if(antiguedad>1 && antiguedad<7)
                    vacaciones=15;
                if(antiguedad>6)
                    vacaciones=22;
            case 3:
                if(antiguedad==1)
                    vacaciones=10;
                if(antiguedad>1 && antiguedad<7)
                    vacaciones=20;
                if(antiguedad>6)
                    vacaciones=30;
                break;
            default:
                vacaciones=0;
                throw new AssertionError();
        }
        
        //Impresion del resultado
        System.out.println("Nombre: "+nombre);
        System.out.println("Departamento: "+departamento);
        System.out.println("Antiguedad: "+antiguedad);
        System.out.println("Días de vacaciones: "+vacaciones);
        
    }
    
}
