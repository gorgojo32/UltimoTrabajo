/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author jpber
 */
public class Arrays {
     private static ArrayList<Libro> inventario = new ArrayList<>();

    public static void main(String[] args) {
        // Inicializar inventario
        inventario.add(new Libro("El Quijote", "Miguel de Cervantes", 5));
        inventario.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 3));
        inventario.add(new Libro("1984", "George Orwell", 4));

        // Mostrar inventario
        mostrarInventario();

        // Agregar nuevas copias
        agregarCopias("El Quijote", 2);

        // Prestar libro
        prestarLibro("1984");

        // Buscar libro
        buscarLibro("Cien años de soledad");

        // Ordenar inventario
        ordenarInventario();

        // Mostrar inventario actualizado
        mostrarInventario();
    }

    public static void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Libro libro : inventario) {
            System.out.println(libro);
        }
        System.out.println();
    }

    public static void agregarCopias(String titulo, int cantidad) {
        for (Libro libro : inventario) {
            if (libro.titulo.equals(titulo)) {
                libro.cantidadStock += cantidad;
                System.out.println("Se agregaron " + cantidad + " copias de " + titulo);
                return;
            }
        }
        System.out.println("Libro no encontrado en el inventario");
    }

    public static void prestarLibro(String titulo) {
        for (Libro libro : inventario) {
            if (libro.titulo.equals(titulo) && libro.cantidadStock > 0) {
                libro.cantidadStock--;
                System.out.println("Se prestó una copia de " + titulo);
                return;
            }
        }
        System.out.println("No hay copias disponibles de " + titulo);
    }

    public static void buscarLibro(String titulo) {
        for (Libro libro : inventario) {
            if (libro.titulo.equals(titulo)) {
                System.out.println("Libro encontrado: " + libro);
                return;
            }
        }
        System.out.println("Libro no encontrado en el inventario");
    }

    public static void ordenarInventario() {
        Collections.sort(inventario, Comparator.comparing(l -> l.titulo));
        System.out.println("Inventario ordenado por título");
    }
}
