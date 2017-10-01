/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int numero1;
        int numero2;
        int resultado;
        
        
        Scanner misc = new Scanner(System.in );
        
        System.out.println("ingrse primer numero : ");
        numero1 = misc.nextInt();
        
        System.out.println("ingrese segundo numero :");
        numero2 = misc.nextInt();
        
        resultado = numero1 + numero2;
        
        
        System.out.println("la suma es " + resultado);
        
       
    }
    
}
