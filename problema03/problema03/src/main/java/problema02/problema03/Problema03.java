/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package problema02.problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double sueldo_inicial;
        double incremento = 0;
        String nombre;
        int empleado;
        System.out.println("Ingrese el nombre del empleado:");
        nombre = entrada.nextLine();
 
        System.out.println("Ingrese el tipo de empleado (1-5)");
        empleado = entrada.nextInt(); 
        
        System.out.println("Ingrese el sueldo inicial del empleado:");
        sueldo_inicial = entrada.nextDouble();
    
            switch (empleado) {
                case 1:
                incremento = sueldo_inicial * 0.05; 
                break;
                
                case 2:
                incremento = sueldo_inicial * 0.07; 
                break;
                
                case 3:
                incremento = sueldo_inicial * 0.09; 
                break;
                
                case 4:
                incremento = sueldo_inicial * 0.12; 
                break;
                
                case 5:
                incremento = sueldo_inicial * 0.15; 
                break;
                
                default:
                incremento = sueldo_inicial * 0.15;
                break;                 
            }    
                      
        double nuevo_sueldo = sueldo_inicial + incremento;

        System.out.println("\nDATOS DEL EMPLEADO:" );
        System.out.println("Nombre:" + nombre );
        System.out.println("Sueldo: $" + sueldo_inicial);
        System.out.println("Incremento de sueldo: $ " + incremento);
        System.out.println("Nuevo sueldo: $" + nuevo_sueldo);
    }
}
