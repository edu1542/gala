/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int numero3;
        int promedio;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese primer numero : ");
        numero1 = misc.nextInt();
        
        System.out.println("ingrese segundo numero : ");
        numero2 = misc.nextInt();
        
        System.out.println("ingrese tercer numero : ");
        numero3 = misc.nextInt();
        
        promedio = numero1 + numero2 + numero3/3;
        
        System.out.println("el promedio es :" + promedio );
        
        
               
               
               
               
    }
    
}
