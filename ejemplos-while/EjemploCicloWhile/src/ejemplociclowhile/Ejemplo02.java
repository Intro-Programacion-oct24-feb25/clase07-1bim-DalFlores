/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //sirve para colocar los decimales con punto 
        int limite;
        int contador = 1;
        System.out.println("Ingrese el Límite");
        limite = entrada.nextInt(); 
        while (contador <= limite){
            
            if (contador%2!=0) { //el  if (contador%2!=0) sirve psara ver si el residuo es igual a 0 y imprimir los impares 
                //con modficar la condicion cambia el objetivo del problema 
                System.out.printf("Contador %d\n", 
                    contador);
            }
            
            contador = contador + 1;
        }
        
    }
}
