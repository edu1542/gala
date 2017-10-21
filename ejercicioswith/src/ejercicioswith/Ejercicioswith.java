/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswith;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicioswith {

    /**
     * @param args the command line arguments
     * 
     * Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Feliz verano” de lo
contrario Informar “No es Verano”
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
                System.out.println("feliz verano ");
                break;
            case "febrero":
                System.out.println("feliz verano ");
                break;
            default:
                System.out.println("no es verano ");
                break;
        
        }
    }
    
}
