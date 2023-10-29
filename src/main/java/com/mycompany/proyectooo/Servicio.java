package com.mycompany.proyectooo;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    private String nombreServicio;
    private int tipoServicio;
    private int precioServicio;
    private int duracionServicio;
    private ArrayList<Servicio> ListaServicio = new ArrayList<Servicio>();
    Scanner entrada = new Scanner(System.in);
    
    public Servicio(){
        this.nombreServicio = "";
        this.tipoServicio = 0;
        this.precioServicio = 0;
        this.duracionServicio = 0;

    }
    public Servicio(String nombreServicio, int tipoServicio, int precioServicio, int duracionServicio){
        this.nombreServicio = nombreServicio;
        this.tipoServicio = tipoServicio;
        this.precioServicio = precioServicio;
        this.duracionServicio = duracionServicio;
    }
    
    public void setNombre(String nombre){
        this.nombreServicio = nombre;
    }
    public String getNombre(){
        return(nombreServicio);
    }
    public int getTipo(){
        return(tipoServicio);
    }
    public void setPrecio(int precio){
        this.precioServicio = precio;
    }
    public int getPrecio(){
        return(precioServicio);
    }
    public void setDuracion(int duracion){
        this.duracionServicio = duracion;
    }
    public int getDuracion(){
        return(duracionServicio);
    }
    
    public void crearDato(){
        System.out.println("Ingrese Nombre del Servicio");
        this.nombreServicio = entrada.next();
        System.out.println("Ingrese Tipo de Servicio (Codigo)");
        this.tipoServicio = entrada.nextInt();
        System.out.println("Ingrese Precio del Servicio");
        this.precioServicio = entrada.nextInt();
        System.out.println("Ingrese Duracion del Servicio(Horas)");
        this.duracionServicio = entrada.nextInt();
        ListaServicio.add(new Servicio(this.nombreServicio,this.tipoServicio,this.precioServicio,this.duracionServicio));
    }
}

