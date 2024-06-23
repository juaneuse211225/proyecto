package com;

/**
 *
 * @author juan
 */
public class Usuarios {

//        String nombre
//    String idUsuario
//    Prestamo prestamoActivo (null si no tiene préstamo activo)
//
//Métodos:
//
    private String N_ID, nombre;
    private Prestamos prestamoActivo;

    public Usuarios(String N_ID, String nombre) {
        this.N_ID = N_ID;
        this.nombre = nombre;
        this.prestamoActivo = null;
    }

    //    prestarLibros(Prestamo prestamo)
//    devolverLibros()
//    tienePrestamoActivo()
//    mostrarLibrosPrestados()
    public void Prestar_Libros(Prestamos prestamo) {
        if (prestamoActivo == null) {
            prestamoActivo = prestamo;
        } else {
            System.out.println("el usuario tiene un prestamo activo");
        }
    }

    public void Devolver_Libro() {
        if (prestamoActivo != null) {
            prestamoActivo.Marcar_Devuelto();
            prestamoActivo = null;
        } else {
            System.out.println("no hay prestamos activos");
        }
    }

    public boolean Tiene_Prestamo_Activo() {
        return prestamoActivo != null;
    }

    public void mostrarLibrosPrestados() {
        if (prestamoActivo != null) {
            System.out.println("Libros prestados por " + nombre + ":");
            for (Libros libro : prestamoActivo.getLista_libros()) {
                System.out.println(libro.toString());
            }
        } else {
            System.out.println("No tiene préstamos activos.");
        }
    }

    public String getN_ID() {
        return N_ID;
    }

    public void setN_ID(String N_ID) {
        this.N_ID = N_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prestamos getPrestamoActivo() {
        return prestamoActivo;
    }

    public void setPrestamoActivo(Prestamos prestamoActivo) {
        this.prestamoActivo = prestamoActivo;
    }

}
