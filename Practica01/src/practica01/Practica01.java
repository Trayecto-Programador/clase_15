/**
 * Realizar un programa que permita guardar los sueldos de 5 operarios en un arreglo de tipo vector
 */
package practica01;

import javax.swing.JOptionPane;


public class Practica01 {

    
    public static void main(String[] args) {
       //Declaracion de Variables
        int  longitud;
        int[] sueldos;
        
        //Inicializar las Variables
        longitud = 5;
        sueldos = new int[longitud];
        
        //Carga de sueldos en el Vector
        for (int i = 0; i < longitud; i++) {
            sueldos [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del operario " + (i+1)) );
            
        }
        
        //Impresion de los sueldios ingresados
        for (int i = 0; i < longitud; i++) {
            System.out.println("Sueldo Operario " +(i+1)+" - "+ sueldos[i]);
        }
        
    }
    
}
