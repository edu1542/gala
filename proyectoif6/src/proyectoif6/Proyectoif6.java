/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif6;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Proyectoif6 {

    /**
     * @param args the command line arguments
     * se ingresa un importe, si supera los 100 pesos
     * se le suma un importe del 23% si no se le descuenta el 
     * 50% 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double importe;
        double importeF;
        
        Scanner misc = new Scanner(System.in);
        System.out.println("ingresa el importe ");
        importe = misc.nextDouble();
        
        if(importe>100)
        {
         importeF = importe * 1.23;
            System.out.println("el nuevo importe es "+ importeF );
        }else
        {
            importeF = importe * 0.50;
             System.out.println("el nuevo importe es "+ importeF );
        }
    }
    
}
