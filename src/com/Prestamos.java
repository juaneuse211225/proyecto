package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author juan
 */
public class Prestamos {
    
    private List<Libros> lista_libros;
    private Usuarios usuario;
    private final LocalDate Fecha_Prestamo;
    private LocalDate Fecha_Devolucion;
    private boolean estado;
    
    public Prestamos(List<Libros> lista_libros, Usuarios usuario, int Dias_prestamo) {
        this.lista_libros = lista_libros;
        this.usuario = usuario;
        this.Fecha_Prestamo = LocalDate.now();
        this.Fecha_Devolucion = Fecha_Prestamo.plusDays(Dias_prestamo);
        this.estado = true;
    }
    
    public List<Libros> getLista_libros() {
        return lista_libros;
    }
    
    public void setLista_libros(List<Libros> lista_libros) {
        this.lista_libros = lista_libros;
    }
    
    public Usuarios getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    public LocalDate getFecha_Prestamo() {
        return Fecha_Prestamo;
    }
    
    public LocalDate getFecha_Devolucion() {
        return Fecha_Devolucion;
    }
    
    public void setFecha_Devolucion(LocalDate Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }
    
    public boolean isEstado() {
        return estado;
        
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Prestamos{" + "lista_libros=" + lista_libros + ", usuario=" + usuario + ", Fecha_Prestamo=" + Fecha_Prestamo.format(DateTimeFormatter.ISO_DATE) + ", Fecha_Devolucion=" + Fecha_Devolucion.format(DateTimeFormatter.ISO_DATE) + ", estado=" + estado + '}';
    }
    
    void Marcar_Devuelto() {
        setEstado(false);
        for (Libros lib : lista_libros) {
            lib.Devolver();
        }
    }
    
}
