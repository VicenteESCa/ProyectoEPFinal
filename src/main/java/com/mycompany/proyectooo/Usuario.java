package com.mycompany.proyectooo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Francisco
 */
public class Usuario {
    private String nombre;
    private String rut;
    private String comuna;
    private String region;
    private String direccion;
    private String contraseña;
    private static ArrayList<Usuario>listaUsuario = new ArrayList<Usuario>();
    public Scanner entrada = new Scanner(System.in);
    
    public Usuario(){
        this.nombre = "";
        this.rut = "";
        this.comuna = "";
        this.region = "";
        this.direccion = "";
         this.contraseña = "";
    }
    
    public Usuario(String nombre, String rut, String comuna,String region, String direccion,String contraseña){
        this.nombre = nombre;
        this.rut = rut;
        this.comuna = comuna;
        this.region = region;
        this.direccion = direccion;
        this.contraseña = contraseña;
        
    }

    
    public String getContraseña() {
        return contraseña;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getRut(){
        return this.rut;
    }
    public String getComuna(){
        return this.comuna;
    }
    public String getRegion(){
        return this.region;
    }
    public String getDireccion(){
        return this.direccion;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setRut(String rut)
    {
        this.rut = rut;
    }
    public void setComuna(String comuna)
    {
        this.comuna = comuna;
    }
    public void setRegion(String region)
    {
        this.region = region;
    }
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public static ArrayList<Usuario> obtenerListaUsuarios() {
        return listaUsuario;
    }
    
    public boolean crearDato() throws ParseException{
        System.out.println("Ingrese Nombre de Usuario");
        this.nombre = entrada.next();
        System.out.println("Ingrese Rut");
        this.rut = entrada.next();
        System.out.println("Ingrese Comuna");
        this.comuna = entrada.next();
        System.out.println("Ingrese Region ");
        this.region = entrada.next();
        System.out.println("Ingrese Direccion");
        this.direccion = entrada.next();
        System.out.println("Ingrese Contraseña");
        this.contraseña=entrada.next();
        
        listaUsuario.add(new Usuario(this.nombre,this.rut,this.comuna,this.region,this.direccion,this.contraseña));
        
        return true;
    }

    //modificaciones entrega 2
    /*
    @Override
    public String toString() {
    return "Nombre: " + nombreProducto + "\n" +
           "Código: " + id + "\n" +
           "Tipo: " + (tipoProducto == 1 ? "Reposteria" : "Aseo") + "\n" +
           "Precio: $" + precioProducto + "\n" +
           "Stock disponible: " + stockProducto + "\n";
    }
*/
}

