
package com.mycompany.proyectooo;

import java.text.ParseException;
import java.util.Scanner;


public class Principal {
    

    
    public static void main(String[] args) throws ParseException {
        int boton = 8;
        try (Scanner lectura = new Scanner(System.in)) {
            Producto productos = new Producto();
            Negocio negocio = new Negocio();
            Servicio servicio = new Servicio();
            Funcionalidad Inicio = new Funcionalidad();
            Usuario user = new Usuario();
            Inicio.Bienvenida();
            productos.leerDatosDesdeArchivo();
            while(boton != 0){
                Inicio.MenuPrincipal();
                boton = lectura.nextInt();

                switch(boton){
                    //ACCEDER A USUARIO
                    case 1:
                        Inicio.Inicio();
                        boton = lectura.nextInt();
                        switch(boton){
                            case 1:
                                user.crearDato();
                        }
                    //ACCEDER A PRODUCTO
                    case 2:
                        Inicio.Inicio();
                        boton = lectura.nextInt(); 
                        switch(boton){
                            case 1:
                                Producto.ListaProductos.add(productos.crearDatos());
                            case 2:
                                productos.leerDatos(Producto.ListaProductos); 
                        }
                    //ACCEDER A NEGOCIO
                    case 3:
                        Inicio.Inicio();
                        boton = lectura.nextInt();
                        switch(boton){
                            case 1:
                                negocio.crearDatos();
                        }  
                    //ACCEDER A SERVICIO
                    case 4:
                        Inicio.Inicio();
                        boton = lectura.nextInt();
                        switch(boton){
                            case 1:
                                servicio.crearDato();
                        }   
                }

            }
        }
        
        
    }


}
