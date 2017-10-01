/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad.y.nombre;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class EdadYNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese edad : ");
        edad = misc.nextInt();
        
        System.out.println("ingrese nombre : ");
        nombre = misc.next();
        
        System.out.println("la edad es "+ edad+"su nombre es " + nombre);
        
        
        
        
    
        
        
    }
    
}
