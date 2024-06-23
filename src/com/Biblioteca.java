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
//    
//    
//    
    
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
    public void Agregar_Usuario(Usuarios us){
        usuarios.add(us);
    }
    
    public Usuarios Buscar_Usuario(int id){
        for(Usuarios b: usuarios){
            if(b.getN_ID().equals(id)){
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
    public void Prestar_Libros(){
        
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
