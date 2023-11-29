/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectooo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Proveedor extends Usuario{

    private String direccion;

    private ArrayList<Servicio> listaServicio = new ArrayList<>();
    private ArrayList<Producto> listaProducto = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);

    public Proveedor() {
        super("", "", "");
        this.direccion = "";
    }


    public Proveedor(String nombre, String comuna, String region, String direccion) {
        super(nombre, comuna, region);
        this.direccion = direccion;
    }

    public String getNombre() {
        super.getNombre();
        return null;
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccionProveedor) {
        this.direccion = direccionProveedor;
    }
    
    public String getComuna(){
        super.getComuna();
        return null;
    }
    public void setComuna(String comuna){
        super.setComuna(comuna);
    }
    public String getRegion(){
        super.getRegion();
        return null;
    }
    public void setRegion(String region){
        super.setRegion(region);
    }

    public void agregarServicio() {
        System.out.println("Ingrese Nombre del Servicio");
        String nombre = entrada.next();
        
        System.out.println("Ingrese Precio del Servicio");
        int precio = entrada.nextInt();
        
        System.out.println("Ingrese Tipo de Servicio ");
        String tipoServicio = entrada.next();
        
        System.out.println("Ingrese Duracion del Servicio(Horas)");
        int duracion = entrada.nextInt();
        
        Servicio servicio = new Servicio(nombre, precio, tipoServicio, duracion);
        listaServicio.add(servicio);
    }
      public void agregarProducto() {
        System.out.println("Ingrese Nombre del Producto");
        String nombre = entrada.next();

        System.out.println("Ingrese Tipo de Producto");
        String tipoProducto = entrada.next();
        
        System.out.println("Ingrese Precio del Producto");
        int precio = entrada.nextInt();
        
        System.out.println("Ingrese Stock del Producto");
        int stock = entrada.nextInt();
        
        Producto producto = new Producto(nombre, tipoProducto, precio, stock);
        listaProducto.add(producto);
    }
}
