/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Proyecto3 {

    /**
     * @param args the command line arguments
     * se debe ingresar una edad informar si es mayor de edad o no
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String aux;
        Integer edad;
        
         Scanner misc = new Scanner(System.in);
        
         System.out.println("ingrese edad : ");
         aux = misc.next();
         edad = Integer.parseInt(aux);
         
         if(edad>17)
         {
             System.out.println("es mayor de edad  ");
         }
         
         
        
        
    }
    
}
