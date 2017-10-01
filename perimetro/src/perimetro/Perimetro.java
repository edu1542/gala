/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetro;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Perimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base;
        int perimetro;
        
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese la base : ");
        base = misc.nextInt();
        
       perimetro = base*4;
       
        System.out.println("el perimetro es " + perimetro);
        
         
         
    }
    
}
