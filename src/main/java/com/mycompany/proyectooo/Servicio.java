package com.mycompany.proyectooo;


/**
 *
 * @author Andrea
 */
public class Servicio implements Oferta {
    private String nombre;
    private int precio;
    private String tipoServicio;
    private int duracion;

    // Constructor sin argumentos
    public Servicio() {
        this.nombre = "";
        this.precio = 0;
        this.tipoServicio = "";
        this.duracion = 0;
    }

    // Constructor con argumentos
    public Servicio(String nombre, int precio, String tipoServicio, int duracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoServicio = tipoServicio;
        this.duracion = duracion;
    }

    // Métodos implementados de la interfaz Oferta
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }


    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
