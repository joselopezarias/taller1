/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author josel
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException {
        // TODO code application logic here
        
        Scanner reader = new Scanner (System.in);
        
        {
           System.out.println("Punto 11");
           
           System.out.println("Por favor ingresar 2 numeros enteros:"); 
           
                System.out.println("Numero 1:"); 
                
                    int numero1= reader.nextInt();
                    
                System.out.println("Numero 2:"); 
                
                    int numero2= reader.nextInt();
                    
            if(numero1!=numero2){
        
                System.out.println("El mayor de los dos numeros es: "+ Math.max(numero1, numero2));
        }
            else{
                
                System.out.println("Los numero ingresados son iguales"); 
            }
        }
        System.out.println("Presione enter para continuar");
        System.in.read();
        {
            System.out.println("Punto 16");
            
            System.out.println("Ingresar un numero para ser evaluado:");
        
            int numero= reader.nextInt();
            
                if(numero % 2 == 0 ){
                    
                        System.out.println("El numero ingresado es par");
            }
                else{
                    
                        System.out.println("El numero ingresado es impar");
            }
                
        }
        
        System.out.println("Presione enter para continuar");
        System.in.read();
        
        {
            System.out.println("Punto 19");
            
            System.out.println("¿Que edad tienes?:");
            
            int edad= reader.nextInt();
            
                if (edad > 0 && edad <= 120){
            
                System.out.println("La edad es correcta");
            }
                else {
                    
                System.out.println("La edad ingresada no es posible");
            }
        }
        
        System.out.println("Presione enter para continuar");
        System.in.read();
        
        
        
    
    }
}