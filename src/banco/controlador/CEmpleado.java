/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.controlador;


import banco.modelo.Empleado;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class CEmpleado {

    Scanner sc = new Scanner(System.in);

    // aqui vamos a tener todas las funcionalidades del empleado
    public void registrarEmpleado(ArrayList<Empleado> empleados) {

        System.out.println("digite el documento del empleado: ");
        int documento = sc.nextInt();

        System.out.println("digite el nombre del empleado: ");
        String nombre = sc.next();

        System.out.println("digite el telefeno del empleado: ");
        String telefono = sc.next();

        System.out.println("digite la direccion de residencia del empleado: ");
        String direccion = sc.next();
        
        System.out.println("Digite la fecha en la que el empleado fue contratado por la empresa: ");
        String fecha= sc.next();

        Empleado e2 = new Empleado(documento, nombre, telefono, direccion, LocalDate.parse(fecha));
        empleados.add(e2);
        System.out.println("registrado");

    }

    public void consultarEmpleado(ArrayList<Empleado> empleados) {
        System.out.println("Digite el documento del empleado: ");
        int documento = sc.nextInt();
        boolean existe = false;
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento() == documento) {
                existe = true;
                System.out.println(empleado);

            }
        }
        if (!existe) {
            System.out.println("no se encuentra ");

        }

    }

    public void modificarEmpleado(ArrayList<Empleado> empleados) {
        System.out.println("Digite el documento del empleado que desea modificar: ");
        int documento = sc.nextInt();
        boolean existe = false;
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento() == documento) {
                existe = true;
                System.out.println("Esta es la informacion del empleado que quiere modificar: " + empleado);

                int opcionMod = 0;

                while (opcionMod != 6) {
                    System.out.println("Digite el numero del item que desea modificar:");
                    
                    System.out.println("1. Documento ");
                    System.out.println("2. Nombre");
                    System.out.println("3. Telefono ");
                    System.out.println("4. Direccion ");
                    System.out.println("5. Fecha ");
                    System.out.println("6. Salir ");
                    opcionMod=sc.nextInt();
                    
                    switch (opcionMod) {
                        case 1 -> {
                            System.out.println("Digite el nuevo documento del empleado: ");
                            int nuevoDoc= sc.nextInt();
                            empleado.setDocumento(nuevoDoc);
                        }
                        case 2 -> {
                            System.out.println("Digite el nuevo nombre del empleado: ");
                            String nuevoNom= sc.next();
                            empleado.setNombre(nuevoNom);
                        }
                            
                        
                        case 3 -> {
                            System.out.println("Digite el nuevo telefono del empleado: ");
                            String nuevoTel=sc.next();
                            empleado.setTelefono(nuevoTel);
                            
                        }
                            
                        
                        case 4 -> {
                            System.out.println("Digite la nueva direccion: ");
                            String nuevoDir= sc.next();
                            empleado.setDireccion(nuevoDir);
                                    
                            
                        }
                        case 5 -> {
                            System.out.println("digite la nueva fecha: ");
                            String nuevaFecha= sc.next();
                            empleado.setFecha(LocalDate.parse(nuevaFecha));
                            
                            
                        }
                        
                        case 6 -> {
                            System.out.println("saliste del SUB MENU modificar empleado");
                            
                        }

                        default -> System.out.println(" opcion no valida ");
                        
                    }
                    

                }

            }
            
} if (!existe) {
    System.out.println("no existe");

            }
    }
    public void eliminarEmpleado(ArrayList<Empleado> empleados) {
        System.out.println("Digite el documento del empleado que desea eliminar: ");
        int documento = sc.nextInt();
        boolean existe = false;
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento() == documento) {
                existe = true;
                System.out.println("esta es la informacion del empleado que usted desea eliminar: " + empleado);
                
                empleados.remove(empleado);
                System.out.println("La informacion del empleado se elimino con exito.");    
            }
            
            
        }if (!existe) {
                System.out.println("no existe el empleado");   
            }

    }

}



