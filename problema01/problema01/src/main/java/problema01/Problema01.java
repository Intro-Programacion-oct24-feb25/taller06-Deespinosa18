/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int op;
        double valor1;
        double valor2;
        double resultado = 0;
       
        System.out.println("Ingrese el Primer Valor para la operacion");
        valor1 = entrada.nextDouble();
        System.out.println("Ingrese el Segundo Valor para la operacion");
        valor2 = entrada.nextDouble();

        System.out.println("Seleccione la operacion que desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar\n"
                + "Ingrese 4 para dividir\n"
                + "Ingrese 5 para Mod\n"
                + "Ingrese 6 para potenciacion\n");
        op = entrada.nextInt(); 
        
        if (valor1 >= valor2) {
            switch (op) {
                
                case 1:
                    resultado = valor1 + valor2;
                    break;

                case 2:
                    resultado = valor1 - valor2;
                    break;

                case 3:
                    resultado = valor1 * valor2;
                    break;
                
                case 4:
                    resultado = valor1 / valor2;
                    break;
                    
                case 5:
                    resultado = valor1 % valor2;
                    break;
                
                case 6:
                    resultado = Math.pow(valor1, valor2);
                    break;
    
                default:
                    System.out.println("Operacion incorrecta");
                    break;
            }

        } else {
            System.out.println("No se puede realizar esta operacion");

        }

        System.out.printf("El resultado de la operacion es : %.2f\n", resultado);
    }    
}
