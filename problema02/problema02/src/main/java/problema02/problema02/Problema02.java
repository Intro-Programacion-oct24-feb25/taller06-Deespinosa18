/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package problema02.problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Problema02 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
       
        int valorc;
        double operacion;
        int inter;
        String nombre;
        
        System.out.println("Ingrese el nombre del propietario del vehiculo");
         nombre = entrada.nextLine();
         
         System.out.println("Ingrese el valor del vehiculo");
         valorc = entrada.nextInt();
         
         
        System.out.println("Seleccione el tipo de vehiculo\n"
                + "tipo 1: vehiculo liviano particular\n"
                + "tipo 2: vehiculo grande particular\n"
                + "tipo 3: taxi\n"
                + "tipo 4: bus urbano\n");
                inter = entrada.nextInt(); 
            switch (inter) {
                case 1:
                operacion = valorc * 0.0001 + 2; 
                break;
                
                case 2:
                operacion = valorc * 0.0002 + 2.5; 
                break;
                
                case 3:
                operacion = valorc * 0.0004 + 1.5;  
                break;
                
                case 4:
                operacion = valorc * 0.0005 + 2.2;  
                break;
                
                default:
                operacion = valorc;
                break;
            }     
            double peaje = operacion;
            System.out.printf("Peaje"+ " " + "Buena via: \n"
            + "\tPropietario: " +  nombre +"\n"
            + "tipo: " + inter + "\n"
            + "\tvalor:" + "\t$" + valorc +"\n"
            + "\tPeaje:" + "\t$" + "%.1f",operacion);
                
                
                         
    }        
}

