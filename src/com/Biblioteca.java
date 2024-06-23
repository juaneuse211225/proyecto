package com;

import java.time.LocalDate;
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
//    
//    
//    
    
    /*metodos para libros*/
    public void Agregar_Libro(Libros lib){
        libros.add(lib);
        System.out.println("Guardado Correctamente");
    }
    
    public Libros Buscar_Libro(int isbn){
        for(Libros a: libros){
            if(a.getIsbn() == isbn){
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
    public void Agregar_Usuario(Usuarios us){
        usuarios.add(us);
        System.out.println("Agregado correctamente");
    }
    
    public Usuarios Buscar_Usuario(int id){
        for(Usuarios b: usuarios){
            if(b.getN_ID() == id){
                return b;
            }
        }
        return null;
    }
    public void Eliminar_Usuario(int id){
        usuarios.remove(id);
    }
    public void Listar_Usuarios(){
        for(Usuarios b: usuarios){
            System.out.println(b.toString());
        }
    }
    public void Prestar_Libros(int num_id, List<Integer> isbns, int dias_prestamo){
           Usuarios usuario = Buscar_Usuario(num_id);
           List<Libros> librosPrestados = new ArrayList<>();
        if (usuario != null) {  
        for (int isbn : isbns) {
            Libros libro = Buscar_Libro(isbn);
            if (libro != null) {
                if (libro.Esta_Disponible()) {
                    libro.Prestar();
                    librosPrestados.add(libro);
                } else {
                    System.out.println("El libro " + libro.getTitulo() + " no está disponible para préstamo.");
                }
                
            } else {
                System.out.println("Libro con ISBN " + isbn + " no encontrado.");
            }
        }
        Prestamos prestamo = new Prestamos(librosPrestados, usuario, dias_prestamo);
        prestamos.add(prestamo);
        usuario.Prestar_Libros(prestamo);
        System.out.println("Préstamo realizado con éxito.");
        }else{
             System.out.println("Usuario no encontrado.");
        }
    }
    
    public void Devolver_Libros(int idUsuario){
        Usuarios usuario1 = Buscar_Usuario(idUsuario);
        if(usuario1 != null){
        usuario1.Devolver_Libro();
        }else{
            System.out.println("Usuario no encontrado");
        }
    }
}
