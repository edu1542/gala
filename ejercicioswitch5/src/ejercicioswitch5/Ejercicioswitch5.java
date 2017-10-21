/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch5;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicioswitch5 {

    /**
     * @param args the command line arguments
     * - Al ingresar una hora del día, informar: si está entre las 7 y las 11: "Es de mañana.".
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner misc = new Scanner(System.in);
        
        int hora;
        
        System.out.println("ingresa hora ");
        hora = misc.nextInt();
        
        switch(hora)
        {
            case 8:
            case 9:
            case 10:
                System.out.println("es de mañana ");
              break;  
        
        
        }
    }
    
}
