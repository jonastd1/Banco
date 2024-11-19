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

public class Cuenta {

    public static void add(Cuenta c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    int numeroCuenta;
    
    double saldo;
    LocalDate fechaCreacion;
    int contraseña;

    public Cuenta(int numeroCuenta, double saldo, LocalDate fechaCreacion, int contraseña) {
        this.numeroCuenta = numeroCuenta;
        
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.contraseña = contraseña;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
   
    
    
    
}
