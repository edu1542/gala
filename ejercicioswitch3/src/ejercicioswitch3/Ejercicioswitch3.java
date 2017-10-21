/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch3;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicioswitch3 {

    /**
     * @param args the command line arguments
     * 
     * - Se ingresa un mes del año y si es Enero: "que comiences bien el año!” , si es Marzo: "a
clases!” , si es Julio: "se vienen las vacaciones!” , si es Diciembre: "Felices fiesta!”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner misc = new Scanner(System.in);
        
        String mes ;
        
           System.out.println("ingresa mes  ");
        mes = misc.next();
        
        switch(mes)
        {
            case "enero" :
                System.out.println("que comiences bien el año  ");
                break;
            case "marzo":
                System.out.println("a clases ");
                break;
            case "julio":
                System.out.println("se vienen las vacaciones ");
                break;
            case "diciembre":
                System.out.println("felices fiestas ");
                break;
            
        
        
        
        
    }
    
}
}    
