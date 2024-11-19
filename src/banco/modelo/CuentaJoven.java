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
public class CuentaJoven extends Cuenta{
    
    double INTERES=1.7;

    public CuentaJoven(int numeroCuenta,  double saldo, LocalDate fechaCreacion, int contraseña) {
        super(numeroCuenta,saldo, fechaCreacion, contraseña);
        
        
    }

    public double getINTERES() {
        return INTERES;
    }

    public void setINTERES(double INTERES) {
        this.INTERES = INTERES;
    }
    
    
    
}
