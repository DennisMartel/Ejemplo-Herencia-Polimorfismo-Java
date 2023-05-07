/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_dennis_martel;

/**
 *
 * @author Dennis
 */
public class Poo_Dennis_Martel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        Trabajador trabajador;
        Empleado empleado;
        Consultor consultor;
        
        // Creación de objetos
        trabajador = new Trabajador("Dennis");
        empleado = new Empleado("Alexander", 460.00);
        consultor = new Consultor("Gustavo", 46, 10.00);
        
        // Salida de datos
        System.out.println("=========== EJEMPLO DE HERENCIA ===============");
        System.out.println("|" + trabajador + "\t\t\t\t\t" + "      |");
        System.out.println("|" + empleado + "\t\t\t" + "      |");
        System.out.println("|" + consultor + "\t\t\t" + "      |");
        System.out.println("===============================================");
        
        System.out.println("\n");
        
        Trabajador[] trabajadores = new Trabajador[2];
        trabajadores[0] = new Empleado("Jorge", 460.00);
        trabajadores[1] = new Consultor("Matias", 46, 100);
        
        System.out.println("======== EJEMPLO DE POLIMORFISMO ==============");
        for (int i = 0; i < 2; i++) {
            System.out.println("|" + trabajadores[i].calcularPaga() + "\t\t\t\t\t" + "      |");
        }
        System.out.println("===============================================");
    }
    
}
