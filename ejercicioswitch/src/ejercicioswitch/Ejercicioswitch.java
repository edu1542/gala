/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicioswitch {

    /**
     * @param args the command line arguments
     * 
     * Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Iniciando el año” ,si es
junio o julio el mensaje” Mitad del año” y si es diciembre el mensaje fin de año
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner misc = new Scanner(System.in);
         
           String mes;
        
        System.out.println("ingresa mes  ");
        mes = misc.next();
        
        switch(mes)
        {
            case "enero" :
                System.out.println("iniciando el año ");
                break;
            case "febrero":
                System.out.println("iniciando el año ");
                break;
            case "junio":
                System.out.println("mitad del año ");
                break;
            case "julio":
                System.out.println("mitad del año ");
                break;
            case "diciembre":
                System.out.println("fin de año ");
                break;
            
         
    }
    
}
}
