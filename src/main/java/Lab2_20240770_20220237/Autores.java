package Lab2_20240770_20220237;

import java.time.LocalDate;

//Diego Josué Bonilla Morales 20240770
public class Autores {
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    public Autores(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
