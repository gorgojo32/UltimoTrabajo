/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jpber
 */
public class Matrices {
      private static ArrayList<LibroLibreria> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Gestión de Inventario de Librería ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Calcular valor total del inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    calcularValorTotalInventario();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        System.out.println("Gracias por usar el sistema de gestión de inventario de librería.");
    }

    private static void agregarLibro() {
        System.out.print("Título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad en stock: ");
        int cantidadStock = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        LibroLibreria libro = new LibroLibreria(titulo, autor, isbn, precio, cantidadStock);
        inventario.add(libro);
        System.out.println("Libro agregado con éxito.");
    }

    private static void eliminarLibro() {
        System.out.print("Ingrese el ISBN del libro a eliminar: ");
        String isbn = scanner.nextLine();

        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).isbn.equals(isbn)) {
                inventario.remove(i);
                System.out.println("Libro eliminado con éxito.");
                return;
            }
        }
        System.out.println("Libro no encontrado en el inventario.");
    }

    private static void mostrarInventario() {
        System.out.println("\nInventario actual:");
        for (LibroLibreria libro : inventario) {
            System.out.println(libro);
        }
    }

    private static void calcularValorTotalInventario() {
        double valorTotal = 0;
        for (LibroLibreria libro : inventario) {
            valorTotal += libro.getValorTotal();
        }
        System.out.println("El valor total del inventario es: $" + valorTotal);
    }
}
