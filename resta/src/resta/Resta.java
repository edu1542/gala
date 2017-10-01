/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resta;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Resta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int resultado;
        
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese primer mnumero");
       numero1 = misc.nextInt();
       
        System.out.println("ingrtese segundo numero");
        numero2 = misc.nextInt();
        
        resultado = numero1 - numero2;
        
        System.out.println("el resultado es" +  resultado);
        
    }
    
}
