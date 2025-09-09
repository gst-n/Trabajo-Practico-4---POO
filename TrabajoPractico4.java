/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg4;

/**
 *
 * @author gast-n
 */
public class TrabajoPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Implementar la clase Empleado aplicando todos los puntos anteriores
        
        //implementando el primero constructor con todos los atributos
        Empleado empl1 = new Empleado(1, "Mark", "Capitan", 14656.4);
        Empleado empl2 = new Empleado("Alfredo", "Piloto de helicoptero");
        //Segundo constructor con dos atributos
        Empleado empl3 = new Empleado("Irving", "Sereno");
        Empleado empl4 = new Empleado(4, "Clementina", "Cientifica", 900000000000.2);
        
        //incrementamos el salario con argumento de porcentaje double
        empl1.actualizarSalario(14.5);
        empl2.actualizarSalario(500);
        //increment con numero int
        empl3.actualizarSalario(67000);
        empl4.actualizarSalario(300000);
        System.out.println(empl1);
        System.out.println(empl2);
        System.out.println(empl3);
        System.out.println(empl4);
        
        System.out.println(empl4.mostrarTotalEmpleados());
    }
    
}
