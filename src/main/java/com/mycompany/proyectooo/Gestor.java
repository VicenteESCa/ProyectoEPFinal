/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectooo;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Gestor {
    public void mostrarDatosProductos() {
        Producto producto = new Producto();
        producto.leerDatosDesdeArchivo(); // Lee los datos del archivo CSV

        ArrayList<Producto> listaProductos = producto.obtenerListaProductos();

        for (Producto p : listaProductos) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("ID: " + p.getId());
            System.out.println("Tipo: " + p.getTipo());
            System.out.println("Precio: $" + p.getPrecio());
            System.out.println("Stock: " + p.getStock());
            System.out.println();
        }
    }
}

