
package com.mycompany.tp6;

public class Productosjava {
    
    String categoria;
    String nombre;
    double precio;

    public Productosjava(String categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    Productosjava() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
  public String toString() {
        return "Producto [Categoria: " + categoria + ", Nombre: " + nombre + ", Precio: " + precio + "]";
    }
  
    
}
