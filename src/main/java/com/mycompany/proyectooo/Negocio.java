package com.mycompany.proyectooo;

import java.util.ArrayList;
import java.util.Scanner;

public class Negocio{
    private String nombre;
    private int id;
    private String direccion;
    private ArrayList<Negocio> ListaNegocio = new ArrayList<Negocio>(); 
    Scanner entrada = new Scanner(System.in);
    
    
    public Negocio(){
        nombre="";
        id=0;
        direccion="";
    }

    public Negocio(String nombre,int id,String direccion){
        this.nombre  = nombre;
        this.id = id;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void crearDatos(){
        System.out.println("Ingrese Nombre del Negocio");
        this.nombre = entrada.next();
        System.out.println("Ingrese su Id");
        this.id = entrada.nextInt();
        System.out.println("Ingrese Direccion del Negocio");
        this.direccion = entrada.next();
        ListaNegocio.add(new Negocio(this.nombre,this.id,this.direccion));
    }
    
}
