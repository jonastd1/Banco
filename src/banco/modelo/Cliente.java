/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class Cliente {
    
    int documentoCliente;
    
    String nombreCliente;
    
    String telefonoCliente;
    
    String direccion;
    
    LocalDate fechaRegistro;
    
   Empleado empleadoRegistrador;
    
    ArrayList<Cuenta>cuentas;

    public Cliente(int documentoCliente, String nombreCliente, String telefonoCliente, String direccion, LocalDate fechaRegistro, Empleado empleadoRegistrador, ArrayList<Cuenta> cuentas) {
        this.documentoCliente = documentoCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.empleadoRegistrador = empleadoRegistrador;
        this.cuentas = cuentas;
    }

    public Cliente(int documentoCliente, String nombreCliente, String telefonoCliente, String direccion, LocalDate fechaRegistro, Empleado empleadoRegistrador) {
        this.documentoCliente = documentoCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.empleadoRegistrador = empleadoRegistrador;
        
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Empleado getEmpleadoRegistrador() {
        return empleadoRegistrador;
    }

    public void setEmpleadoRegistrador(Empleado empleadoRegistrador) {
        this.empleadoRegistrador = empleadoRegistrador;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "documentoCliente=" + documentoCliente + ", nombreCliente=" + nombreCliente + ", telefonoCliente=" + telefonoCliente + ", direccion=" + direccion + ", fechaRegistro=" + fechaRegistro + ", empleadoRegistrador=" + empleadoRegistrador + ", cuentas=" + cuentas + '}';
    }

    
    
   
}
