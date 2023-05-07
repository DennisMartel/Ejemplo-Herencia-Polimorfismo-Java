/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_dennis_martel;

/**
 *
 * @author Dennis
 */
public class Empleado extends Trabajador {
    private double sueldo;
    private double igss;
    
    public Empleado(String nombre, Double sueldo)
    {
        super(nombre);
        this.sueldo = sueldo;
        this.igss = (0.483 * sueldo);
    }
    
    public double calcularPaga()
    {
        return (sueldo - igss);
    }
    
    @Override
    public String toString()
    {
        return "Empleado: " + super.toString();
    }
}
