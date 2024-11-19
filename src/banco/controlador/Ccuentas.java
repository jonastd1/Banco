/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.controlador;

import banco.modelo.Cliente;
import banco.modelo.Cuenta;
import banco.modelo.CuentaJoven;
import banco.modelo.CuentaTradiccional;
import banco.modelo.Cuentaahorro;
import banco.modelo.Empleado;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Ccuentas {

    Scanner sc = new Scanner(System.in);

    public void asignarCuenta(ArrayList<Cliente> clientes, ArrayList<Cuenta> cuentas) {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("MENU DE TIPOS DE CUENTA\n");
            System.out.println("\n1. Cuenta ahorro \n2. Cuenta joven \n3. Cuenta tradicional \n4. salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Didite el documento del cliente al que le quiere asignar un tipo de cuenta: ");
                    int documento = sc.nextInt();
                    boolean encontrado = false;
                    for (Cliente cliente : clientes) {
                        if (cliente.getDocumentoCliente() == documento) {
                            encontrado = true;
                            System.out.println("Digite el numero de cuenta del cliente: ");
                            int numeroCuenta = sc.nextInt();
                            System.out.println("Digite el saldo inical que va a tener la cuenta: ");
                            double saldoCuenta = sc.nextDouble();
                            System.out.println("Digite la fecha en la cual la cuenta fue creada: ");
                            String fechaCreacion = sc.next();
                            System.out.println("Digite la contraseña de la cuenta ");
                            int contraseña = sc.nextInt();

                            Cuenta c1 = new Cuentaahorro(numeroCuenta, saldoCuenta, LocalDate.parse(fechaCreacion), contraseña);
                            cuentas.add(c1);
                        }

                    }
                    if (!encontrado) {
                        System.out.println("Cliente no encontrado");
                    }
                }
                case 2 -> {

                    System.out.println("Didite el documento del cliente al que le quiere asignar un tipo de cuenta: ");
                    int documento = sc.nextInt();
                    boolean encontrado = false;
                    for (Cliente cliente : clientes) {
                        if (cliente.getDocumentoCliente() == documento) {
                            encontrado = true;
                            System.out.println("Digite el numero de cuenta del cliente: ");
                            int numeroCuenta = sc.nextInt();
                            System.out.println("Digite el saldo inical que va a tener la cuenta: ");
                            double saldoCuenta = sc.nextDouble();
                            System.out.println("Digite la fecha en la cual la cuenta fue creada: ");
                            String fechaCreacion = sc.next();
                            System.out.println("Digite la contraseña de la cuenta ");
                            int contraseña = sc.nextInt();
                            Cuenta c2 = new CuentaJoven(numeroCuenta, saldoCuenta, LocalDate.parse(fechaCreacion), contraseña);
                            cuentas.add(c2);

                        }
                        if (!encontrado) {
                            System.out.println("Cliente no encontrado");
                        }

                    }
                }
                case 3 -> {
                    System.out.println("Didite el documento del cliente al que le quiere asignar un tipo de cuenta: ");
                    int documento = sc.nextInt();
                    boolean encontrado = false;
                    for (Cliente cliente : clientes) {
                        if (cliente.getDocumentoCliente() == documento) {
                            encontrado = true;
                            System.out.println("Digite el numero de cuenta del cliente: ");
                            int numeroCuenta = sc.nextInt();
                            System.out.println("Digite el saldo inical que va a tener la cuenta: ");
                            double saldoCuenta = sc.nextDouble();
                            System.out.println("Digite la fecha en la cual la cuenta fue creada: ");
                            String fechaCreacion = sc.next();
                            System.out.println("Digite la contraseña de la cuenta ");
                            int contraseña = sc.nextInt();
                            Cuenta c3 = new CuentaTradiccional(numeroCuenta, saldoCuenta, LocalDate.parse(fechaCreacion), contraseña);
                            cuentas.add(c3);

                        }

                    }
                    if (!encontrado) {
                        System.out.println("Cliente no encontrado");
                    }

                }
                case 4 -> {
                    System.out.println("ELEGISTE SALIR, ADIOS");
                }
                default ->
                    System.out.println("OPCION NO VALIDA EN EL MENU.");
            }

        }

    }

    public void retirar(ArrayList<Cuenta> cuentas) {
        boolean encontrado = false;
        System.out.println("Digite el numero de la cuenta que desea retirar dinero: ");
        int num = sc.nextInt();
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == num) {
                encontrado = true;
                if (intentosContraseña(cuenta)) {
                    System.out.println("Digite la cantidad que desea retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= cuenta.getSaldo()) {
                        cuenta.setSaldo(cuenta.getSaldo() - retiro);
                        System.out.println("El retiro se realizo con exito. Nuevo saldo:  " + cuenta.getSaldo());

                    } else {
                        System.out.println("LA CANTIDAD QUE DESEA RETIRAR NO ES VALIDA");

                    }

                }

            }

        }
        if (!encontrado) {
            System.out.println("NO SE ENCOTRO ESA CUENTA");
        }

    }
    
    public boolean intentosContraseña(Cuenta cuenta){
    int intentos= 3;
        while (intentos>0) {            
            System.out.println("Digite la contraseña de la cuenta: ");
            int contraseña=sc.nextInt();
            
            if (contraseña== cuenta.getContraseña()) {
                return true;
                
            } else {
                intentos--;
                if (intentos>0) {
                    System.out.println("Contraseña incorrecta. le quedan estos intentos: " + intentos);
                } else {
                    System.out.println("Supero el numero de intentos permitidos.");
                }
            }
        }
        return false;
    
    }

    public void depositar(ArrayList<Cuenta> cuentas) {
        boolean encontrado = false;
        System.out.println("Digite el numero de cuenta: ");
        int num = sc.nextInt();

        for (Cuenta cuenta : cuentas) {
            if (num == cuenta.getNumeroCuenta()) {
                encontrado = true;
                System.out.println("Digite la cantidad que desea depositar en la cuenta: ");
                double deposito = sc.nextDouble();
                if (deposito > 0) {
                    cuenta.setSaldo(cuenta.getSaldo() + deposito);
                    System.out.println("Deposito realizado\n Su nuevo saldo es : " + cuenta.getSaldo());

                } else {
                    System.out.println("Cantidad no valida para ahcer un deposito.");

                }

            }
        }
        if (!encontrado) {
            System.out.println("CUENTA NO ENCONTRADA");

        }

    }

    public void consultarSaldo(ArrayList<Cuenta> cuentas) {
        boolean encontrado = false;
        System.out.println("Digite el numero de cuenta para consultar su saldo: ");
        int num=sc.nextInt();
        for (Cuenta cuenta : cuentas) {
            if (num==cuenta.getNumeroCuenta()) {
                encontrado=true;
                System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
                
                
            }
            
        }
        if (!encontrado) {
            System.out.println("CUENTA NO ENCONTRADA.");
        }

    }

}
