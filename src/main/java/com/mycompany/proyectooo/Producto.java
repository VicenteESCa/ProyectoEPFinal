
package com.mycompany.proyectooo;



/**
 *
 * @author Andrea
 */
public class Producto extends Oferta {
    private String tipoProducto;
    private int stock;

    public Producto() {
        super();
        tipoProducto = "";
        stock = 0;
    }

    public Producto(String nombre, String tipoProducto, int precio, int stock) {
        super(nombre, precio);
        this.tipoProducto = tipoProducto;
        this.stock = stock;
    }

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
