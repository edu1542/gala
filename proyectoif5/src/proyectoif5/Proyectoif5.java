/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif5;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Proyectoif5 {

    /**
     * @param args the command line arguments
     * se pide una clave si coincide se muestra el mensaje
     * vienvenido de lo contrario mostrar clave incorrecta
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave;
        
         Scanner misc = new Scanner(System.in);
         
         System.out.println("ingrese clave : ");
         clave = misc.next();
         
         if(clave.equals("1234"))
         {
             System.out.println("bienvenidos ");
             
                    
         }else
         {
             System.out.println("clave incorrecta");
         }
    }
    
}
