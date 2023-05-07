/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_dennis_martel;

/**
 *
 * @author Dennis
 */
public class Consultor extends Trabajador{
    private int horas;
    private double tarifa;
    
    public Consultor(String nombre, int horas, double tarifa)
    {
        super(nombre);
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    public double calcularPaga()
    {
        return (horas * tarifa);
    }
    
    @Override
    public String toString()
    {
        return "Consultor: " + super.toString();
    }
}
