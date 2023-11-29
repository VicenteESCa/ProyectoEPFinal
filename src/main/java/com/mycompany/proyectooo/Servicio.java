package com.mycompany.proyectooo;


/**
 *
 * @author Andrea
 */
public class Servicio extends Oferta {
    private String tipoServicio;
    private int duracion;

    public Servicio() {
        super();
        tipoServicio = "";
        duracion = 0;
    }

    public Servicio(String nombre, int precio, String tipoServicio, int duracion) {
        super(nombre, precio);
        this.tipoServicio = tipoServicio;
        this.duracion = duracion;
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
