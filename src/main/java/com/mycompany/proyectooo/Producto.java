
package com.mycompany.proyectooo;


public class Producto implements Oferta {
    private String nombre;
    
    private String tipoProducto;
    private int precio;
    private int stock;

    // Constructor sin argumentos
    public Producto() {
        this.nombre = "";
        this.precio = 0;
        this.tipoProducto = "";
        this.stock = 0;
    }

    // Constructor con argumentos
    public Producto(String nombre, String tipoProducto, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.stock = stock;
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

    // Métodos específicos de la clase Producto
    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
