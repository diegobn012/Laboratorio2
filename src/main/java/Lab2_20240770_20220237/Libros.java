package Lab2_20240770_20220237;

import java.util.ArrayList;
import java.util.List;

//Diego Josué Bonilla Morales
public class Libros {
    private String nombreLibro;
    private String categoria;
    private String isbn;
    private List<Capitulos> listaCapitulos = new ArrayList<>();
    private List<Autores> listaAutores = new ArrayList<>();

    public Libros(String nombreLibro, String categoria) {
        this.nombreLibro = nombreLibro;
        this.categoria = categoria;
    }

    public void agregarCapitulos(){
        
    }
}
