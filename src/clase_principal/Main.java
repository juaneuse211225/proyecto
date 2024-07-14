package clase_principal;

import com.Biblioteca;
import com.Libros;
import com.Usuarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author juan
 */
public class Main {

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();

        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("""
                               1. Libros
                               2. Usuarios
                               3. Prestamos
                               4. Salir""");
            System.out.print("que accion quieres realizar(1-4): ");
            int seleccion = entrada.nextInt();
            switch (seleccion) {
                case 1 -> {
                    Scanner entrada_L = new Scanner(System.in);
                    System.out.println("""
                           1. Agregar Libro
                           2. Eliminar Libro
                           3. Buscar Libro
                           4. Listar Libros""");
                    System.out.print("que accion quieres realizar(1-4): ");
                    int seleccionLibro = entrada_L.nextInt();
                    switch (seleccionLibro) {
                        case 1 -> {
                            String titulo = showInputDialog("ingresa titulo del libro");
                            String autor = showInputDialog("ingresa nombre del autor");
                            int isbn = Integer.parseInt(showInputDialog("ingresa isbn"));
                            int ejemplares = Integer.parseInt(showInputDialog("ingresa la cantidad de ejemplares"));
                            biblioteca.Agregar_Libro(new Libros(titulo, autor, isbn, ejemplares));
                        }
                        case 2 -> {
                            int isbn = Integer.parseInt(showInputDialog("ingresa isbn para eliminar libro"));
                            biblioteca.Eliminar_Libro(isbn);
                        }
                        case 3 -> {
                            int isbn = Integer.parseInt(showInputDialog("ingresa isbn para buscar libro"));
                            var b = biblioteca.Buscar_Libro(isbn);
                            b.toString();
                        }
                        case 4 -> {
                            biblioteca.Listar_Libros();
                        }
                        default ->
                            System.err.print("Accion inexistente.");
                    }
                }
                case 2 -> {
                    Scanner entrada_U = new Scanner(System.in);
                    System.out.println("""
                           1. Agregar Usuario
                           2. Eliminar Usuario
                           3. Buscar Usuario
                           4. Listar Usuarios""");
                    System.out.print("que accion quieres realizar(1-4): ");
                    int seleccionusu = entrada_U.nextInt();
                    switch (seleccionusu) {
                        case 1 -> {
                            int id = Integer.parseInt(showInputDialog("ingresa documento del usuario"));
                            String nombre = showInputDialog("ingresa el nombre del usuario");
                            biblioteca.Agregar_Usuario(new Usuarios(id, nombre));
                        }
                        case 2 -> {
                            int id = Integer.parseInt(showInputDialog("ingresa documento para eliminar usuario"));
                            biblioteca.Eliminar_Usuario(id);
                        }
                        case 3 -> {
                             int id = Integer.parseInt(showInputDialog("ingresa documento para buscar usuario"));
                            var a = biblioteca.Buscar_Usuario(id);
                            a.toString();
                        }
                        case 4 -> {
                            biblioteca.Listar_Usuarios();
                        }
                        default ->
                            System.err.print("Accion inexistente.");
                    }
                }
                case 3 -> {
                     Scanner entrada1= new Scanner(System.in);
                    System.out.println("""
                           1. devolver libros
                           2. Prestar libros""");
                    System.out.print("que accion quieres realizar(1-2): ");
                    int seleccion1 = entrada1.nextInt();
                    switch (seleccion1) {
                        case 1 -> {
                            int id = Integer.parseInt(showInputDialog("ingresa documento del usuario"));
                            biblioteca.Devolver_Libros(id);
                    }
                        case 2 -> {
                            int id = Integer.parseInt(showInputDialog("ingresa documento del usuario"));
                            List<Integer> isbns = new ArrayList<>();
                            for(int i = 0; i < 5; i++){
                               int libro = Integer.parseInt(showInputDialog("ingresa el isbn de tu #" + i +" libro a prestar"));
                               isbns.add(libro);
                            }
                            int dias_prestamo = Integer.parseInt(showInputDialog("ingresa cantidad de dias de prestamo"));
                            biblioteca.Prestar_Libros(id, isbns, dias_prestamo);
                    }
                        default -> System.err.print("Accion inexistente.");
                    }
                }
                case 4 -> {
                    System.out.println("Adios.");
                    System.exit(0);
                }
                default ->
                    System.err.print("Accion inexistente.");
            }
        }
    }

}
