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
public class Cuentaahorro extends Cuenta{
    double INTERES = 1.5;

    public Cuentaahorro(int numeroCuenta,double saldo, LocalDate fechaCreacion, int contraseña) {
        super(numeroCuenta,saldo, fechaCreacion, contraseña);
        
        
    }

    public double getINTERES() {
        return INTERES;
    }

    public void setINTERES(double INTERES) {
        this.INTERES = INTERES;
    }
    
    
}
