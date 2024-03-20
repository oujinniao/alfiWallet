/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.englishalway.alfiwallet;

/**
 *
 * @author Pamela Gonzalez Juan Pablo Vásquez. Eugenio Zuñiga. Pablo Vásquez.
 * Mauricio Vera.
 * @Version 1.0
 */

public interface Wallet {
    //Métodos
    double obtenerSaldo();
    void depositar(double cantidad);
    boolean retirar(double cantidad);
    boolean convertirMoneda(double cantidad, String desdeMoneda, String aMoneda);
}
