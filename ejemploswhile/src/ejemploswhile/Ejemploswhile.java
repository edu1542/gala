/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswhile;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Ejemploswhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
       // Ejemploswhile.mostrarpares();
         
         // Ejemploswhile.mostrarImpares();
         //Ejemploswhile.suma();
        // Ejemploswhile.pedirdieznumeros();
            Ejemploswhile.pedirdieznumerosPos();
    }
    
    public static void mostrarpares()
    {
    
    int contador=0;
    
     while(contador<101)
     {
     
         contador++;
         
         if(contador%2==0)
         {
             System.out.println("los numeros paren son "+ contador);             
         
         }
          
     }
    
    }
    
      public static void mostrarImpares()
    {
    
    int contador=0;
    
     while(contador<101)
     {
     
         contador++;
         
         if(contador%2!=0)
         {
             System.out.println("los numeros impares son "+ contador);             
         
         }
          
     }
    
    }
      
      public static void suma()
      {
          int contador=0;
          int acumulador=0;
          
         
          
      
          while(contador<101)
          {             
             
                  acumulador= acumulador+contador;
                  contador++;
      
          
          }
          System.out.println("la suma es: " +acumulador);
          
         
          
      
      
      
      }
      
      public static void pedirdieznumeros()
      {
      
      int contador=0;
      int numero;
      int contadorpares=0;
      
      
      Scanner misc = new Scanner(System.in);
      
      while(contador<10)
      {
          contador++;
          System.out.println("ingrese numero "+contador);
          numero = misc.nextInt();
          
          if(numero%2==0)
          {
              contadorpares++;
              
          }
          
          
            
      }
      System.out.println("pares: "+contadorpares);    
          
      
      }
      
           public static void pedirdieznumerosPos()
      {
      
      int contador=0;
      int numero;
      int contadorpositivos=0;
      int contadordenegativos=0;
      int contadordeceros=0;
      
      
      
      Scanner misc = new Scanner(System.in);
      
      while(contador<10)
      {
          contador++;
          System.out.println("ingrese numero "+contador);
          numero = misc.nextInt();
          
          if(numero>0)
          {
              contadorpositivos++;
              
          }
          
          if(numero<0)
          {
              contadordenegativos++;
          
          
          }
          if(numero==0)
          {
              contadordeceros++;
          
          }
          
          
            
      }
      System.out.println("positivos: "+contadorpositivos); 
      System.out.println("negativos: "+ contadordenegativos);
       System.out.println("ceros: "+ contadordeceros);
       
          
          
      
      
      }  
      
    
}
