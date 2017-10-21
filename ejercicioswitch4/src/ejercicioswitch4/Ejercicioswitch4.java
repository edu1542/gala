/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch4;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicioswitch4 {

    /**
     * @param args the command line arguments
     * Se ingresa un mes del año al seleccionar un mes informar: si tiene 28 días ,si tiene 30 días, si
tiene 31 días.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner misc = new Scanner(System.in);
         
         String mes;
         
         System.out.println("ingresa mes ");
         mes = misc.next();
         
         switch(mes)
         {
         
             case "enero":
             case "marzo":
             case "mayo":
             case "julio":
             case "agosto":
             case "octubre":
             case "diciembre":
                 System.out.println("tiene 31 dias ");
                 break;
             case "febrero":
                 System.out.println("tiene 28 dias ");
                 break;
             default:
                 System.out.println("tiene 30 dias ");
                 break;
                         
                 
                 
                  
         
         
         }
         
         
    }
    
}
