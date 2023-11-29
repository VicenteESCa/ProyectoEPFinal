package com.mycompany.proyectooo;


import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Consumidor extends Usuario{
    
    private String rut;
    private String direccion;
    public Scanner entrada = new Scanner(System.in);
    
    public Consumidor() {
        super("", "", "");
        this.rut = "";
        this.direccion = "";
    }
    
    public Consumidor(String nombre, String comuna, String region, String rut, String direccion) {
        super(nombre, comuna, region);
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre(){
        super.getNombre();
        return null;
    }
    public String getRut(){
        return this.rut;
    }
    public String getComuna(){
        super.getComuna();
        return null;
    }
    public String getRegion(){
        super.getRegion();
        return null;
    }
    public String getDireccion(){
        return this.direccion;
    }

    public void setNombre(String nombre)
    {
        super.setNombre(nombre);
    }

    public void setRut(String rut)
    {
        this.rut = rut;
    }
    public void setComuna(String comuna)
    {
        super.setComuna(comuna);
    }
    public void setRegion(String region)
    {
        super.setRegion(region);
    }
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
   
    
    public void contratarServicio(List<Servicio> servicios) {
    System.out.println("Seleccione un servicio para contratar:");
    for (int i = 0; i < servicios.size(); i++) {
        Servicio servicio = servicios.get(i);
        System.out.println((i + 1) + ": " + servicio.getNombre() + " - Precio: " + servicio.getPrecio() + " - Duración: " + servicio.getDuracion() + " horas");
    }
    int eleccion = entrada.nextInt();
    Servicio seleccionado = servicios.get(eleccion - 1);

    System.out.println("Has contratado: " + seleccionado.getNombre() + " por " + seleccionado.getDuracion() + " horas.");
}
    
    public void comprarProducto(List<Producto> productos) {
    System.out.println("Seleccione un producto para comprar:");
    for (int i = 0; i < productos.size(); i++) {
        Producto producto = productos.get(i);
        System.out.println((i + 1) + ": " + producto.getNombre() + " - Precio: " + producto.getPrecio() + " - Stock: " + producto.getStock());
    }
    int eleccion = entrada.nextInt();
    Producto seleccionado = productos.get(eleccion - 1);

    if (seleccionado.getStock() > 0) {
        seleccionado.setStock(seleccionado.getStock() - 1);
        System.out.println("Has comprado: " + seleccionado.getNombre());
    } else {
        System.out.println("Lo sentimos, este producto está agotado.");
    }
}
}
