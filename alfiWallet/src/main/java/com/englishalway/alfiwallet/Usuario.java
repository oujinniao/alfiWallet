/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.englishalway.alfiwallet;

/**
 *
 * @author 
 *    Pamela Gonzalez 
 *  Juan Pablo Vásquez.
 *  Eugenio Zuñiga.
 * Pablo Vásquez.
 * Mauricio Vera.
 * @Version 1.0
 */

public class Usuario {
     //atributos
    private int id;
    private String nombre;
    private AlfiWallet wallet;
//constructor vacio
    public Usuario() {
    }
//constructor por parametros
    public Usuario(int id, String nombre, AlfiWallet wallet) {
        this.id = id;
        this.nombre = nombre;
        this.wallet = new AlfiWallet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AlfiWallet getWallet() {
        return wallet;
    }

    public void setWallet(AlfiWallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", wallet=" + wallet + '}';
    }
     
    
}
