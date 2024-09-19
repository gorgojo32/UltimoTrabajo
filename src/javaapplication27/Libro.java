/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author jpber
 */
public class Libro {
    String titulo;
    String autor;
    int cantidadStock;

    public Libro(String titulo, String autor, int cantidadStock) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidadStock=" + cantidadStock +
                '}';
    }
}
