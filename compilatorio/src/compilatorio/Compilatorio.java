/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilatorio;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Compilatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("primer numero :");
         numero1= misc.nextInt();
         
          System.out.println("segundo numero :");
         numero2= misc.nextInt();
         
         suma = numero1 + numero2;
         
         resta = numero1 - numero2;
         
         multiplicacion = numero1 * numero2;
         
         division = numero1 / numero2;
         
         System.out.println("la suma es " + suma + "\nla rseta es " + resta + "\nla multiplicacion es " + multiplicacion + "\nla division es" + division );
         
         
         
         
         
        
        
        
        
        
    }
    
}
