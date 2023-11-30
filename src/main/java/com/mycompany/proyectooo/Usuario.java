package com.mycompany.proyectooo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public abstract Usuario {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Proveedor> proveedores = new ArrayList<>();
    private static List<Consumidor> consumidores = new ArrayList<>();

    private String nombre;
    private String comuna;
    private String region;

    
    public Usuario(String nombre, String comuna, String region){
        this.nombre = nombre;
        this.comuna = comuna;
        this.region = region;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
     public static void agregarProveedor() {
        System.out.println("Ingrese los datos del Proveedor:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Comuna: ");
        String comuna = scanner.nextLine();
        
        System.out.print("Región: ");
        String region = scanner.nextLine();

        scanner.nextLine(); // Consumir línea restante
        System.out.print("Dirección Proveedor: ");
        String direccion = scanner.nextLine();

        Proveedor nuevoProveedor = new Proveedor(nombre, comuna, region, direccion);
        proveedores.add(nuevoProveedor);
    }
     public static void agregarConsumidor() {
        System.out.println("Ingrese los datos del Consumidor:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Rut: ");
        String rut = scanner.nextLine();
        
        System.out.print("Comuna: ");
        String comuna = scanner.nextLine();
        
        System.out.print("Región: ");
        String region = scanner.nextLine();
        
        scanner.nextLine(); // Consumir línea restante
        System.out.print("Dirección Consumidor: ");
        String direccion = scanner.nextLine();

        Consumidor nuevoConsumidor = new Consumidor(nombre, rut, comuna, region, direccion);
        consumidores.add(nuevoConsumidor);
    }
}
