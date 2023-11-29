package com.mycompany.proyectooo;

public class Funcionalidad {
    public void Bienvenida() {
        String mensaje = "*************************************\n" +
                "*        ¡BIENVENIDO AL SISTEMA!        *\n" +
                "*************************************\n";

        System.out.println(mensaje);
    }

    public void Inicio() {
        System.out.println("1.- Crear Datos");
        System.out.println("2.- Leer Datos");
        System.out.println("3.- Modificar Datos");
        System.out.println("4.- Eliminar Datos");

    }

    public void MenuPrincipal() {
        System.out.println("1.- Acceder a Usuario");
        System.out.println("2.- Acceder a Producto ");
        System.out.println("3.- Acceder a Negocio");
        System.out.println("4.- Acceder a Servicio");
        System.out.println("5- Inicio de Sesion");
        System.out.println("");
        System.out.println("Ingresa 0 si quieres Finalizar");
    }
}
