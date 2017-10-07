/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Proyectoif {

    /**
     * @param args the command line arguments
     * se ingresa un color y una localidad , si es avellaneda o la lanus y el color 
     * es rojo mostrar el msj sos de independiente
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String color;
        String localidad;
        
        Scanner misc = new Scanner(System.in);
        
        
        System.out.println("ingrese color : ");
        color = misc.next();
        
        System.out.println("ingrese localidad : ");
        localidad = misc.next();
        
        if(color.equals("rojo"))
        {
            if(localidad.equals("avellaneda") || localidad.equals("lanus"))
            {
                System.out.println("sos de independiente : ");
            }
                
            
        }
        
        
        
        
        
        
        
        
       
        
    }
    
}
