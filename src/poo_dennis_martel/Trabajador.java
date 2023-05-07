/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_dennis_martel;
import java.util.Date;


/**
 *
 * @author Dennis
 */
public class Trabajador {
    // Atributos
    private String nombre;
    private String puesto;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private Date fechaContrato;
    
    // Constructor
    public Trabajador(String nombre)
    {
        this.nombre = nombre;
    }
    
    // Metodos
    @Override
    public String toString()
    {
        return nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getPuesto()
    {
        return puesto;
    }
    
    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    
    public String getTelefono()
    {
        return telefono;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public Date getFechaNacimiento()
    {
        return fechaNacimiento;
    }
    
    public void setFechaNacimientos(Date fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Date getFechaContrato()
    {
        return fechaContrato;
    }
    
    public void setFechaContrato(Date fechaContrato)
    {
        this.fechaContrato = fechaContrato;
    }
    
    public double calcularPaga()
    {
        return 0.0;
    }
}
