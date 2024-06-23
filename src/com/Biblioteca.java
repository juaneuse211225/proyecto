package com;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class Biblioteca {
//Atributos:

    private List<Libros> libros;
    private List<Usuarios> usuarios;
    private List<Prestamos> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }
        
//Métodos:
//
//    agregarLibro(Libro libro)
//    eliminarLibro(String isbn)
//    registrarUsuario(Usuario usuario)
//    eliminarUsuario(String idUsuario)
//    buscarLibro(String isbn)
//    listarLibros()
//    listarUsuarios()
//    prestarLibros(String idUsuario, List<String> isbns, String fechaPrestamo, String fechaDevolucion)
//    devolverLibros(String idUsuario)
    
    /*metodos para libros*/
    public void Agregar_Libro(Libros lib){
        libros.add(lib);
    }
    
    public Libros Buscar_Libro(int isbn){
        for(Libros a: libros){
            if(a.getIsbn().equals(isbn)){
                return a;
            }
        }
        return null;
    }
    public void Eliminar_Libro(int isbn){
        libros.remove(Buscar_Libro(isbn));
    }
    public void Listar_Libros(){
        for(Libros a: libros){
            System.out.println(a.toString());
        }
    }
    /*metodos para usuarios*/
    
}
