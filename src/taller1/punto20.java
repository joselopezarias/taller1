/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author josel
 */
public class punto20 {
    
    public static void main(String[] args)  throws IOException {
    Scanner reader = new Scanner (System.in);
    {
            
            System.out.println("Punto 20");                               
            System.out.println("Por favor ingrese su usuario");
            
            String usuarioEntrada=reader.nextLine();
                       
            
        switch (usuarioEntrada) {
            case "alex":
                {
                    System.out.println("Por favor ingrese su contraseña");
                    String contraseñaEntrada=reader.nextLine();
                    if (contraseñaEntrada.equals("mightyducks") ){
                        System.out.println("La cuenta ha logueado correctamente");
                    }
                    else System.out.println("La contraseña es incorrecta");
                    break;
                }
            case "emily":
                {
                    System.out.println("Por favor ingrese su contraseña");
                    String contraseñaEntrada=reader.nextLine();
                    if (contraseñaEntrada.equals("cat") ){
                        System.out.println("La cuenta ha logueado correctamente");
                    }
                    else
                        System.out.println("La contraseña es incorrecta");
                    break;
                }
            default:
                System.out.println("El usuario es incorrecto");
                break;
        }
            System.out.println("Presione enter para continuar");
        System.in.read();
        
    }
}
}