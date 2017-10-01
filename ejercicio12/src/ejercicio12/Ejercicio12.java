/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valor;
        int cantidad;
        float resultado;
        float descuento;
        float sueldofinal;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese el valor x hora : ");
        valor = misc.nextFloat();
        
        System.out.println("ingrese la cantidad de horas : ");
        cantidad = misc.nextInt();
        
        resultado = valor * cantidad;
        descuento = (float)(resultado * 0.15);
        sueldofinal = resultado - descuento;
        
        System.out.println("el sueldo final es " + sueldofinal);
        
        
        
        
        
        
        
        
        
        
        System.out.println("el resultado es " + resultado);
        
        
        
        
       
    }
    
}
