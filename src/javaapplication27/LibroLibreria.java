/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author jpber
 */
public class LibroLibreria {
   String titulo;
    String autor;
    String isbn;
    double precio;
    int cantidadStock;

    public LibroLibreria(String titulo, String autor, String isbn, double precio, int cantidadStock) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public double getValorTotal() {
        return precio * cantidadStock;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                ", valorTotal=" + getValorTotal() +
                '}';
    }
}
