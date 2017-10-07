/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif8;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Proyectoif8 {

    /**
     * @param args the command line arguments
     * se ingresa una nota si es 10 mostrar
     * exelente , si esta entre 9 y 4 aprobo
     * de lo contrario demostrar la proxima sera
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota;
        
         Scanner misc = new Scanner(System.in);
         
         System.out.println("ingresa una nota ");
         nota = misc.nextInt();
         
         if(nota==10)
         {
             System.out.println("excelente ");
         }else
         {
             if(nota<10&&nota>3)
             {
                 System.out.println("aprobo ");
                 
             }else
             {
                 if(nota<4)
                 {
                     System.out.println("para la proxima sera "); 
                     
                 }
             }
           
             
        
        
    }
    
}
}
