/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.controlador;

import banco.modelo.Cliente;
import banco.modelo.Empleado;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Ccliente {
    Scanner sc = new Scanner(System.in);
    CEmpleado contEm= new CEmpleado();
    
    public void registrarCliente(ArrayList<Cliente> clientes, ArrayList<Empleado>empleados){
        System.out.println("Digite el numero del documento del cliente: ");
        int documento= sc.nextInt();
        
        System.out.println("Digite el nombre del cliente: ");
        String nombre= sc.next();
        
        System.out.println("Digite el telefono del cliente: ");
        String telefono= sc.next();
        
        System.out.println("Digite la direccion de residencia del cliente: ");
        String direccion=sc.next();
        
        System.out.println("Digite la fecha en la cual fue resgistrado el cliente: ");
        String fecha=sc.next();
         
        System.out.println("Digite el documento del empleado que registra al cliente :");
        int empleadoRegistrador=sc.nextInt();
       
       Empleado e= cargarAsesor(empleados, empleadoRegistrador);
       
       Cliente c= new Cliente(documento, nombre, telefono, direccion, LocalDate.parse(fecha), e);
       clientes.add(c);
        System.out.println("El cliente fue registrado con exito.");
  
    }
    
    
    public Empleado cargarAsesor(ArrayList<Empleado>empleados, int empleadoRegistrador){
    
    Empleado e=null;
    
    
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento()==empleadoRegistrador) {
                e=empleado;
            }
        }
        
        return e;
    
    }
    
    public void consultarCliente(ArrayList <Cliente> clientes){
    
        System.out.println("Digite el documento del cliente: ");
        int documento= sc.nextInt();
        
        boolean encontrado=false;
        for (Cliente cliente : clientes) {
            if (cliente.getDocumentoCliente()==documento) {
                System.out.println("Cliente encontrado: " + cliente);
                encontrado=true;
            }
            
            
        }if (!encontrado) {
            System.out.println("El cliente no se encuentra en la base de datos.");
            
        }
        
        
    
    }
    
    public void modificarCliente(ArrayList<Cliente>clientes, ArrayList<Empleado>empleados){
        
    
    
        System.out.println("Digite el documento del cliente: ");
        int documento= sc.nextInt();
        
        boolean encontrado=false;
        for (Cliente cliente : clientes) {
            if (cliente.getDocumentoCliente()==documento) {
                System.out.println("Cliente encontrado: " + cliente);
                encontrado=true;
                
                int variable=0;
                
                while (variable !=7) {
                    System.out.println("OPCIONES QUE PUEDO MODIFICAR\n");
                    System.out.println("1. Documento");
                    System.out.println("2. Nombre");
                    System.out.println("3. Telefono");
                    System.out.println("4. Direccion de residencia");
                    System.out.println("5. Fecha de registro");
                    System.out.println("6. Empleado que lo registro");
                    System.out.println("7. salir");
                    System.out.println("Digite el numero correspondiente a la opcion que desea modificar: ");
                     variable= sc.nextInt();
                    
                    switch (variable) {
                        case 1 -> {
                            System.out.println("Digite el nuevo documento del cliente: ");
                            int nuevoDocumento=sc.nextInt();
                            cliente.setDocumentoCliente(nuevoDocumento);
                        }
                        
                        case 2 -> {
                            System.out.println("Digite el nuevo nombre del cliente");
                            String nuevoNombre=sc.next();
                            cliente.setNombreCliente(nuevoNombre);
                        }
                        
                        case 3 -> {
                            System.out.println("Digite el nuevo telefono del cliente: ");
                            String nuevoTelefono= sc.next();
                            cliente.setTelefonoCliente(nuevoTelefono);
                        }
                        
                        case 4 -> {
                            System.out.println("Digite la nueva direccion del cliente: ");
                            String nuevaDireccion=sc.next();
                            cliente.setDireccion(nuevaDireccion);
                        }
                        case 5 -> {
                            System.out.println("Digite la nueva Fecha de registro: ");
                            String nuevaFecha=sc.next();
                            cliente.setFechaRegistro(LocalDate.parse(nuevaFecha));
                        }
                        case 6 -> {
                            System.out.println("Digite el documento del nuevo empleado que lo registro: ");
                            int nuevoDoc= sc.nextInt();
                            Empleado eM= cambiarAsesor(empleados, nuevoDoc);
                            
                        }

                        default -> System.out.println(" opcion no valida ");
                        
    
                    }
   
                }
   
                
            }
            
            
        }if (!encontrado) {
            System.out.println("El cliente no se encuentra en la base de datos.");
            
        }
    }
    
    public Empleado cambiarAsesor(ArrayList<Empleado>empleados , int nuevoDoc  ){
        
    Empleado eM=null;
    
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento()==nuevoDoc) {
                
                eM=empleado;
                
            }
            
        }
        return eM;
    
    }
    
    public void eliminarCliente(ArrayList<Cliente>clientes){
        System.out.println("Digite el documento del cliente: ");
        int documento=sc.nextInt();
        boolean existe=false;
        
        for (Cliente cliente : clientes) {
            if (cliente.getDocumentoCliente()==documento) {
                existe=true;
                System.out.println("Esta es la informacion del cliente que desea eliminar: "+ cliente);
                
                clientes.remove(cliente);
                System.out.println("El cliente se elimino con exito.");
            }
            
            
        }
        if (!existe) {
            System.out.println("El cliente no existe");
            
        }
    
    
    }
    
    
    
    
    
}
