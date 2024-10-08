package com.mycompany.ejercicios;

/**
 *
 * @author danie
 */
public class Ejercicio2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar las siguientes series numéricas
        //utilizando las estructuras repetitivas for, while y do-while
        //1,2,3,4,5,6,7,8,9,10
        //1,99,2,98,3,97,4,96,5,95
        //0,1,1,2,3,5,8,13,21,34
        
        //Declaro variables para ciclo while
        int j = 0;
        int k = 100;
        //Declaro variable para ciclo do while
        int x = 1;
        int y = 0;
        int z = 0;
        int conta = 0;
        
        //Estructura for para la primera estructura
        for(int i=0; i<=9;i++){
            if(i==9)
                System.out.print(i+1);
            else
                System.out.print(i+1+",");
            
        }
        
        System.out.println("--------------------------");
        //Estructura ciclo while
        while(j<5){
            j++;
            k--;
            System.out.print(j+" ");
            System.out.print(k+" ");
        }
        //Ciclo do while para serie fibonacci
        System.out.println("--------------------------");
        do{
            System.out.print(z+" ");
            y = x;
            x = z;
            z = x+y;
            conta++;
        }while(conta<20);
        
    }
    
}
