/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif7;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class PROYECTOIF7 {

    /**
     * @param args the command line arguments
     * SE INGRESA UN IMPORTE DEL PASAJE DE AVION Y EL 
     * MES DE VIAJE , SI EL MES ES ENERO SE LE DESCUENTA EL 10% POR TEMPORADA
     * BAJA 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String mes;
        double importe;
        double importeF;
        
         Scanner misc = new Scanner(System.in);
         
         System.out.println("ingrese el mes ");
         mes = misc.next();
         
         System.out.println("ingrese un importe ");
         importe = misc.nextDouble();
         
         if(mes.equals("enero"))
         {
             importeF = importe * 0.9;
             System.out.println("el importe con descuento es " + importeF);
         }
            System.out.println("el importe es " + importe);
         
        }
    }
    

