/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.modelo;

import java.time.LocalDate;

/**
 *
 * @author jonat
 */
public class Empleado {
    int documento;
    
    String nombre;
    
    String telefono;
    
    String direccion;
    
    LocalDate fecha;

    public Empleado(int documento, String nombre, String telefono, String direccion, LocalDate fecha) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha = fecha;
    }


    

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Empleado{" + "documento=" + documento + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", fecha=" + fecha + '}';
    }
    

}
