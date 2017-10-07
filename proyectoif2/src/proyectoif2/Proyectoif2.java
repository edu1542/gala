/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif2;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Proyectoif2 {

    /**
     * @param args the command line arguments
     * se pide el sexo y el nombre , si es f de femenino 
     * se muestra el mensaje feliz dia xxxxx 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String sexo;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese el nombre : ");
        nombre = misc.next();
        
        System.out.println("ingrese el sexo : ");
        sexo = misc.next();
        
        if(sexo.equals("f"))
        {
            System.out.println("feliz dia "+nombre);
            
        }
        
    }
    
}
