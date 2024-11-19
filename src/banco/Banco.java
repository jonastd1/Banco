/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import banco.modelo.Cliente;
import banco.modelo.Cuenta;
import banco.modelo.Empleado;
import banco.vista.Menu;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Empleado> empleados= new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Cuenta> cuentas= new ArrayList<>();
        
        Menu.mostrarMenu(empleados, clientes, cuentas);
        
        
    
    
        
 
        
       
    }
    
}
