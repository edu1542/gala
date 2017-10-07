/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif3;

import java.util.Scanner;

/**
 *
 * @author jrm62
 */
public class Proyectoif3 {

    /**
     * @param args the command line arguments
     * se pide el nombre el sexo y la localidad.
     * si se llama jose o maria y es de sexo masculino
     * viviendo en moron se muestra el mensaje sos de moron
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;        
        String sexo;
        String localidad;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese un nombre : ");
        nombre = misc.next();
        
        System.out.println("ingrese el sexo : ");
        sexo = misc.next();
        
        System.out.println("ingrese la localidad : ");
        localidad = misc.next();
        
        if(sexo.equals("masculino")&& localidad.equals("moron"))
        {
            if(nombre.equals("maria")||nombre.equals("jose"))
            {
                System.out.println("se muestra el mensaje sos de moron ");
            }
        }
    }
    
}
