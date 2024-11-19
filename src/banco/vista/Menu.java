/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.vista;

import banco.controlador.CEmpleado;
import banco.controlador.Ccliente;
import banco.controlador.Ccuentas;
import banco.modelo.Cliente;
import banco.modelo.Cuenta;
import banco.modelo.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Menu {
    
    public static void mostrarMenu(ArrayList<Empleado>empleados , ArrayList<Cliente>clientes ,  ArrayList<Cuenta> cuentas){
        Scanner sc = new Scanner(System.in);
        CEmpleado cem=new CEmpleado();
        Ccliente ccl= new Ccliente();
        Ccuentas ccuen= new Ccuentas();
        
        
        int op=0;
         while (op!=7) {
            System.out.println("MENU GENERAL DEL BANCO\n");
            System.out.println("1. Gestionar empleado ");
            System.out.println("2. Gestionar cliente ");
            System.out.println("3. Crear cuenta ");
            System.out.println("4. Hacer retiros ");
            System.out.println("5. Hacer depositos ");
            System.out.println("6. Consultar saldo ");
            System.out.println("7.Salir");

            System.out.println("dijite la opcion que quiere : ");
            op=sc.nextInt();

             switch (op) {
                 
                 case 1 -> {
                     int op1=0;
                     
                     while (op1!=5) {
                         
                         System.out.println(" ENTRO AL SUB MENU DE GESTIONAR EMPLEADO\n \n1.Registrar \n2. Consultar \n3. Modificar \n4. Eliminar \n5. salir sub-menu");
                         System.out.println("dijite la opcion que desea : ");
                         op1=sc.nextInt();

                         switch (op1) {
                             case 1 -> {
                                 cem.registrarEmpleado(empleados);      
                            }

                             case 2 -> {
                                 cem.consultarEmpleado(empleados);
                             }
                             
                             case 3 -> {
                                 cem.modificarEmpleado(empleados);
                                 
                             }
                             
                             case 4 -> {
                                 cem.eliminarEmpleado(empleados);
                             }
                             
                             case 5 -> {
                                 System.out.println("Elegiste salir del sub menu, ¡adios!");
                             }
                             
       
                             
                             default -> System.out.println("OPCION NO VALIDA, SOLO HAY 5 OPCIONES EN EL MENU");
                             
                        }
     
                    }
                     
                }
                     
                 case 2 -> {
                     int varia =0;
                     while (varia!=5) {
                         System.out.println("Entraste al SUB-MENU DEL CLIENTE.\n");
                         System.out.println("\n1.Registrar \n2. Consultar \n3. Modificar \n4. Eliminar \n5. salir del sub menu ");
                         System.out.println("dijite la opcion que desea : ");
                         varia=sc.nextInt();
                         
                         switch (varia) {
                             case 1 -> {
                                 
                                 ccl.registrarCliente(clientes, empleados);
                             }
                             
                             case 2 -> {
                                 ccl.consultarCliente(clientes);
                                 
                             }
                             case 3 -> {
                                 ccl.modificarCliente(clientes, empleados);
                             }
                             case 4 -> {
                                 ccl.eliminarCliente(clientes);
                             }
 
                             default -> System.out.println("OPCION NO VALIDA SOLO HAY 5 OPCIONES EN EL MENU. ");
                         }
     
                     }
      
                }
                     
                     
                  case 3 -> {
                     ccuen.asignarCuenta(clientes, cuentas);
      
                }
                     
                     
                  case 4 -> {
                      ccuen.retirar(cuentas);
                }
       
                  case 5 -> {
                      ccuen.depositar(cuentas);
                }
                     
                  case 6 -> {
                      ccuen.consultarSaldo(cuentas);
                }
                     
                  case 7 -> {
                      System.out.println("USTED ESCOGIO LA OPCION DE SALIR.");
                      break;
                }

                     
                 default -> System.out.println("OPCION NO VALIDA, SOLO EXISTEN 7 OPCIONES EN ESTE MENU.");
             }
  
             
            
        }
    
    
    
    
    
    
    
    }
    
    public void clear(){
    
        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }
        
    }
    
    
}


