/**
 * Ejercicio de Vectores por consola
Escribir un programa que almacene las asignaturas de un curso (por ejemplo
Matemáticas, Física, Química, Historia y Lengua) en un vector, pregunte al usuario la
nota que ha sacado en cada asignatura, y después las muestre por pantalla con el
mensaje En <asignatura> has sacado <nota>
 */
package actividad02;

import javax.swing.JOptionPane;

public class Actividad02 {

    public static void main(String[] args) {
        
        //Declaracion y Asignacion de Variables
        String [] asignaturas = {"Matematicas", "Fisica", "Quimica", "Historia", "Lengua"};
        int [] notas = new int [asignaturas.length];
        
        //Carga de Notas en el Vector notas
        for (int i = 0; i < asignaturas.length; i++) {
          notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota de la asignatura: " + asignaturas[i]));
        }
        
        //Mostrar listado asignatura con su nota correspondiente
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("En la asignatura " + asignaturas[i] + " obtuvo la siguiente nota " + notas[i]);
        }
    }
    
}
