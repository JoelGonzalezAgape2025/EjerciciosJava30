package Ejercicios03;

import java.util.Set;

import java.util.LinkedHashSet;

public class ListaLibro {

    public static void main(String[] args) {

        Set<Libro> libros = new LinkedHashSet();
        libros.add(new Libro(1, "El Quijote", "Primera Edición", "Miguel de Cervantes"));
        libros.add(new Libro(2, "Cien años de soledad", "Segunda Edición", "Gabriel García Márquez"));
        libros.add(new Libro(3, "1984", "Tercera Edición", "George Orwell"));
        libros.add(new Libro(4, "El Principito", "Cuarta Edición", "Antoine de Saint-Exupéry"));
        libros.add(new Libro(5, "Orgullo y prejuicio", "Quinta Edición", "Jane Austen"));

        for(Libro libro : libros) {
            System.out.println("ID: " + libro.getId() + ", Título: " + libro.getTitulo() + ", Edición: " + libro.getEdicion() + ", Autor: " + libro.getAutor());
        }

    }

}
