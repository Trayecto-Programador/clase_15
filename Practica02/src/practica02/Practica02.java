/**
 * Realizar un programa que permita ingresar los nombres de 5 operarios y sus sueldos respectivos.
 */
package practica02;

import javax.swing.JOptionPane;

public class Practica02 {

    public static void main(String[] args) {
        // Declaracion de variables
        String [] nombres;
        int [] sueldos;
        int longitud;
        
        //Inicializacion de Variables
        longitud = 5;
        nombres = new String[longitud];
        sueldos = new int[longitud];
        
        
        //Carga de datos de los 5 empleado en el vector
        for (int i = 0; i < longitud; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i+1));
            sueldos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado " + (i+1)));
            
        }
        
        
        //impresion en consola de los datos de los 5 empleados
        for (int i = 0; i < longitud; i++) {
            System.out.println("Empleado " + (i+1) + "- " + nombres[i]);
            System.out.println("Sueldo $" +  sueldos[i]);
        }
        
    }
    
}

