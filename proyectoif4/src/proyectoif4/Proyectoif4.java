/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif4;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Proyectoif4 {

    /**
     * @param args the command line arguments
     * se pide una edad y se pide q se imforme si es niño adolecente
     * o mayor de edad
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int edad;
        
         Scanner misc = new Scanner(System.in);
        
         System.out.println("ingrese edad : ");
         edad= misc.nextInt();
         
         if(edad>17)
         {
             System.out.println("es mayor de edad ");             
         }else
         {
             if(edad<13)
             {
                 System.out.println("es un ñino");
             }else
             {
                 System.out.println("es adolecente");
             }
         }
         
         
         /*if(edad>17)
         {
             System.out.println("es mayor de edad ");
             
         }
         
         if(edad>12&&edad<18)
         {
             System.out.println("es adolecente");
             
         }
         
         if(edad<=12)
         {
             System.out.println("es un ñino");
             
         }*/
         
    }
    
}
