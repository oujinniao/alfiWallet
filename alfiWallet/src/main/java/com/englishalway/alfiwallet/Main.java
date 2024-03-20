/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.englishalway.alfiwallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pamela Gonzalez Juan Pablo Vásquez. Eugenio Zuñiga. Pablo Vásquez.
 * Mauricio Vera.
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        // variables
        Scanner entrada = new Scanner(System.in);
        //String nombre;
        String rut;
        int opcion, monto;
        ArrayList< Usuario> usuarios = new ArrayList<Usuario>();
        // instanciar
        AlfiWallet saldo = new AlfiWallet();
        AlfiWallet deposito = new AlfiWallet();
        AlfiWallet retiro = new AlfiWallet();
        System.out.println("********************");
        System.out.println("Billetera Virtual");
        System.out.println("Ingrese nombre: ");
        String nombre = entrada.nextLine();
        entrada.nextLine();
        Usuario usuario1 = new Usuario(1, nombre, deposito);
        usuarios.add(usuario1);
        usuario1.getWallet().obtenerSaldo();
        System.out.println("Ingrese rut: ");
        rut = entrada.nextLine();
        // menu
        do {
            System.out.println("Ingrese una opcion");
            System.out.println(" 0: para salir");
            System.out.println(" 1: para consultar saldo");
            System.out.println(" 2: para depositar");
            System.out.println(" 3: para retirar");
            System.out.println(" 4: para convertir moneda (EUR/USD)");
            System.out.println(" 5: para obtener transacciones");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Cerrando Menu");
                    break;
                case 1:
                    //System.out.println("Su saldo es: ");
                    // obj.obtenerSaldo();
                    System.out.println(saldo.obtenerSaldo());
                    usuario1.getWallet().getSaldo();
                    System.out.println("Saldo actual" + usuario1.getWallet().getSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar");
                    monto = entrada.nextInt(); // 5000
                    System.out.println("Monto depositado: " + monto);
                    usuario1.getWallet().depositar(monto);
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar");
                    monto = entrada.nextInt();
                    System.out.println("Monto retirado es : " + retiro.retirar(monto));
                    usuario1.getWallet().retirar(monto);
//                    double nuevo_saldo = retiro.obtenerSaldo() - monto;
//                    System.out.println("Monto retirado: " + monto);
                    //System.out.println("Su nuevo saldo es: " + nuevo_saldo);
                    break;
                case 4:
//                    System.out.println("A que moneda quiere convertir ");
//                    monto = entrada.nextInt(); // 5000
//                    if (deposito.depositar((monto))) {
//                        System.out.println("Monto depositado: " + monto);
//                        usuario1.getWallet().depositar(monto);
//                    }
                    break;
                case 5:
                    System.out.println("Imprimir cartola");
//                    monto = entrada.nextInt(); // 5000
//                    if (deposito.depositar((monto))) {
//                        System.out.println("Monto depositado: " + monto);
//                        usuario1.getWallet().depositar(monto);
//                    }
                    break;
                default:
                    System.out.println("Opcion no existe");
            }
        } while (opcion != 0);
        entrada.close();
    }
}

