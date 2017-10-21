/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch7;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejercicioswitch7 {

    /**
     * @param args the command line arguments
     * - Las lámparas están al mismo precio de $35 pesos final.
A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%.
B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un descuento del
40 % y si es de otra marca el descuento es del 30%.
C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o “FelipeLamparas” se hace
un descuento del 25 % y si es de otra marca el descuento es del 20%.
D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento es del 15%, si
es “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un 5%.
E. Si el importe final con descuento suma más de $120 se debe sumar un 10% de ingresos
brutos en informar del impuesto con el siguiente mensaje:”IIBB Usted pago X”, siendo X el
impuesto que se pagó.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner misc = new Scanner(System.in);
         
         double precio=35;
         int cantidad;
         double precioFinal;
         double precioConDescuento;
         double precioConImpuesto;
         String marca;
         
         
         
         
         System.out.println("ingrese cantidad de lamparas ");
         
         cantidad = misc.nextInt();
         
         switch(cantidad)
         {
         
             case 3:
                 System.out.println("ingrese marca ");
                 marca = misc.next();
                 
                 if(marca.equalsIgnoreCase("Argentinaluz"))
                 {
                     
                     precioFinal=precio*cantidad;
                     System.out.println("Precio final sin descuento: "+ precioFinal);                     
                                         
                     precioConDescuento = precioFinal*0.85;
                     System.out.println("Precio con descuento: "+ precioConDescuento);
                     
                     
                 }
                 if(marca.equalsIgnoreCase("FelipeLamparas"))
                 {
                     
                     precioFinal=precio*cantidad;
                     System.out.println("Precio final sin descuento: "+ precioFinal);                     
                                         
                     precioConDescuento = precioFinal*0.90;
                     System.out.println("Precio con descuento: "+ precioConDescuento);
                     
                     
                 }else
                 {
                     precioFinal=precio*cantidad;
                     System.out.println("Precio final sin descuento: "+ precioFinal);                     
                                         
                     precioConDescuento = precioFinal*0.95;
                     System.out.println("Precio con descuento: "+ precioConDescuento);
                 }
                 break;
             case 4:
                 
                 System.out.println("ingrese marca ");
                 marca = misc.next();
                 
                 if(marca.equalsIgnoreCase("Argentinaluz")||marca.equalsIgnoreCase("FelipeLampara"))
                 {
                     precioFinal=precio*cantidad;
                     System.out.println("preciofinal sin descuento "+ precioFinal);
                     
                     precioConDescuento=precioFinal*0.75;
                     System.out.println("precio con descuento "+ precioConDescuento);                 
                 
                 
                 }else
                 {
                     precioFinal=precio*cantidad;
                     System.out.println("preciofinal sin descuento "+ precioFinal);
                     
                     precioConDescuento=precioFinal*0.80;
                     System.out.println("precio con descuento "+ precioConDescuento);
                     
                     
                                                                       
                 }
                 break;
             case 5:
                 System.out.println("ingrese marca ");
                 marca = misc.next();
                 
                 if(marca.equalsIgnoreCase("Argentinaluz"))
                 {
                     precioFinal=precio*cantidad;
                     System.out.println("preciofinal sin descuento "+ precioFinal);
                     
                     precioConDescuento=precioFinal*0.60;
                     System.out.println("precio con descuento "+ precioConDescuento);                 
                 
                 
                 }else
                 {
                     precioFinal=precio*cantidad;
                     System.out.println("preciofinal sin descuento "+ precioFinal);
                     
                     precioConDescuento=precioFinal*0.70;
                     System.out.println("precio con descuento "+ precioConDescuento);
                     
                     if(precioConDescuento>120)
                     {
                         precioConImpuesto = precioConDescuento*1.10;
                         System.out.println("IIBB Ud pago "+ precioConImpuesto+" ,siendo "+precioConDescuento*0.10+" el impuesto que se pago");
                         
                     }
                       
                } break;
            
             default: 
                 
                   precioFinal=precio*cantidad;
                     System.out.println("preciofinal sin descuento "+ precioFinal);
                     
                     precioConDescuento=precioFinal*0.50;
                     System.out.println("precio con descuento "+ precioConDescuento);
                     
                     break;
                       
                 
                 
         
         
         
         }
         
         
         
         
         
         
         
         
    }
    
}
