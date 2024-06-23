package com;

/**
 *
 * @author juan
 */
public class Libros {

    private String titulo, autor; 
    private int Cantidad_Total, isbn, Cantidad_Disponible;

    public Libros(String titulo, String autor, int isbn, int Cantidad_Total) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.Cantidad_Total = Cantidad_Total;
        this.Cantidad_Disponible = Cantidad_Total;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCantidad_Total() {
        return Cantidad_Total;
    }

    public void setCantidad_Total(int Cantidad_Total) {
        this.Cantidad_Total = Cantidad_Total;
    }

    public int getCantidad_Disponible() {
        return Cantidad_Disponible;
    }

    @Override
    public String toString() {
        return "[" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", Cantidad_Total=" + Cantidad_Total + ", Cantidad_Disponible=" + Cantidad_Disponible + ']';
    }

    public boolean Prestar() {
        if (Cantidad_Disponible > 0) {
            Cantidad_Disponible--;
            return true;
        } else {
            return false;
        }
    }

    public void Devolver() {
        if (Cantidad_Disponible < Cantidad_Total) {
            Cantidad_Disponible++;
        } else {
            System.err.println("No se pudo devolver el libro.");
        }
    }

    public boolean Esta_Disponible() {
        if (Cantidad_Disponible != 0) {
            return true;
        } else {
            return false;
        }
    }

}
