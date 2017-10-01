/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        float monto;
        float resultado;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese cantidad : ");
        cantidad = misc.nextInt();
        
        System.out.println("ingrese monto : ");
        monto = misc.nextFloat();
        
        resultado = monto / cantidad;
        
        System.out.println("el resultado es " + resultado);
       
       
    }
    
}
