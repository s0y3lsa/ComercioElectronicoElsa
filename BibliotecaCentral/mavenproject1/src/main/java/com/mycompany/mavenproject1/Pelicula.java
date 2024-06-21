/*
 */
package ed.videoteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Alvaro
 */
public class Pelicula {

    private String titulo;
    private String director;
    private LocalDate fechaLanzamiento;

    public Pelicula(String titulo, String director, LocalDate fechaLanzamiento) {
        this.titulo = titulo;
        this.director = director;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yyyy").withLocale(new Locale("es", "ES"));
        return "Pelicula{"
                + "titulo='" + titulo + '\''
                + ", director='" + director + '\''
                + ", fechaLanzamiento=" + fechaLanzamiento.format(f)
                + '}';
    }

}
