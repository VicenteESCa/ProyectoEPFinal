

package com.mycompany.proyectooo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Producto {
    private String nombreProducto;
    private int id;
    private int tipoProducto;
    private int precioProducto;
    private int stockProducto;
    private Scanner lectura = new Scanner(System.in);
    public String archivo = "src/Datos/productos.txt";
    public static ArrayList<Producto> ListaProductos=new ArrayList<Producto>();

    public Producto(){
        this.nombreProducto = "";
        this.id = 0;
        this.tipoProducto = 0;
        this.precioProducto = 0;
        this.stockProducto = 0;
    }
    
    public Producto(String nombre, int id,int tipo, int precio, int stock){
        this.nombreProducto = nombre;
        this.id = id;
        this.tipoProducto = tipo;
        this.precioProducto = precio;
        this.stockProducto = stock;
    }
    
    public void setNombre(String nombre){
        this.nombreProducto = nombre;
    }
    public String getNombre(){
        return(nombreProducto);
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return(id);
    }
    public void setTipo(int tipo){
        this.tipoProducto = tipo;
    }
    public int getTipo(){
        return(tipoProducto);
    }
    public void setPrecio(int precio){
        this.precioProducto = precio;
    }
    public int getPrecio(){
        return(precioProducto);
    }
    public void setStock(int stock){
        this.stockProducto = stock;
    }
    public int getStock(){
        return(stockProducto);
    }
    
    public Producto crearDatos() throws ParseException{
        System.out.println("Ingrese el Nombre del Producto"); 
        this.nombreProducto=lectura.next();
        //lectura.next();
        System.out.println("Ingrese su Identificador"); 
        this.id=lectura.nextInt();
        System.out.println("Ingrese el Tipo de Producto"); 
        this.tipoProducto=lectura.nextInt();
        System.out.println("Ingrese el precio del Producto"); 
        this.precioProducto=lectura.nextInt();
        System.out.println("Ingrese el precio el stock del Producto"); 
        this.stockProducto=lectura.nextInt();

        return new Producto(this.nombreProducto,this.id,this.tipoProducto,this.precioProducto,stockProducto);
    } 

    /**
     * @param Lista
     */
    public void leerDatos(ArrayList<Producto> Lista){
        Lista.forEach(item->{
            System.out.println(item.nombreProducto);
            System.out.println("Codigo = "+item.id);
            switch(item.tipoProducto){
                case 1:
                   System.out.println("Tipo : Reposteria"); 
                case 2:
                    System.out.println("Tipo : Aseo"); 
            }
            System.out.println("$"+item.precioProducto);
            System.out.println("Hay disponible "+item.stockProducto);
            System.out.println("");

        });

    }
    public void leerDatosDesdeArchivo() {
        try {
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(";"); 
                if (datos.length == 5) {
                    String nombre = datos[0];
                    int id = Integer.parseInt(datos[1]);
                    int tipo = Integer.parseInt(datos[2]);
                    int precio = Integer.parseInt(datos[3]);
                    int stock = Integer.parseInt(datos[4]);

                    Producto producto = new Producto(nombre, id, tipo, precio, stock);
                    ListaProductos.add(producto);
                }
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de productos: " + e.getMessage());
        }
    }
    
}
