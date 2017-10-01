/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficie;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Superficie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ancho;
        int largo;
        int superficie;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese largo : ");
        largo = misc.nextInt();
        
        System.out.println("ingrese ancho : ");
        ancho = misc.nextInt();
        
        superficie = largo * ancho;
        
        System.out.println("la superficie es " + superficie);
        
    }
    
}
