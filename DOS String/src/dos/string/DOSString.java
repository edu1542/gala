/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dos.string;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class DOSString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese nombre : ");
        nombre = misc.next();
        
        System.out.println("ingrese apellido : ");
        apellido = misc.next();
        
        System.out.println("su nombre es " + nombre+"su apellido es " + apellido);
    }
    
}
