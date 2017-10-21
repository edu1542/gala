/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch6;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicioswitch6 {

    /**
     * @param args the command line arguments
     * -al ingresar un signo del zodíaco devolver el nombre de la imagen asociada a ese signo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner misc = new Scanner(System.in);
         
         String signo;
         
         System.out.println("ingresa mes ");
         signo = misc.next();
         
         switch(signo)
         {
         
             case "aries":
                 System.out.println("carnero");
                 break;
             case "tauro":
                 System.out.println("toro");
                 break;
             case "pisis":
                 System.out.println("pescado");
                 break;
             case "leo":
                 System.out.println("leon");
                 break;
             case "cancer":
                 System.out.println("cangrejo");
                 break;
             case "geminis":
                 System.out.println("dos caras ");
                 break;
             case "virgo":
                 System.out.println("santo");
                 break;
             case "escorpio":
                 System.out.println("escorpion");
                 break;
             case "capricornio":
                 System.out.println("shura");
                 break;
             case "acuario":
                 System.out.println("agau");
                 break;
             case "sagitario":
                 System.out.println("caballo");
                 break;
                  case "libra":
                 System.out.println("libra");
                 break;
             
                         
    }
    
}
}    
