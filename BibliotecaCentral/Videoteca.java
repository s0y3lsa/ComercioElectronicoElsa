/*

 */
package ed.videoteca;

import java.util.Arrays;

/**
 *
 * @author Alvaro
 */
public class Videoteca {

    private Pelicula[] peliculas;
    private int contadorPeliculas;

    public Videoteca(int maxPeliculas) {
        this.peliculas = new Pelicula[maxPeliculas];
        this.contadorPeliculas = 0;
    }

    public boolean agregarPelicula(Pelicula pelicula) {
        boolean agregar = false;
        if (contadorPeliculas < peliculas.length) {
            peliculas[contadorPeliculas++] = pelicula;
            agregar = true;
        }
        return agregar;
    }

    // eliminar la película
    public Boolean eliminarPelicula(Pelicula pelicula) {
        boolean encontrado = false;
        for (int i = 0; (i < contadorPeliculas && !encontrado); i++) {
            if (peliculas[i].equals(pelicula)) {
                for (int j = i; j < contadorPeliculas - 1; j++) {
                    peliculas[j] = peliculas[j + 1];
                }
                contadorPeliculas--;
                encontrado = true;
            }
        }
        return encontrado;
    }

    //consultar la pelicula
    public Pelicula consultarPelicula(String titulo) {
        for (int i = 0; i < contadorPeliculas; i++) {
            if (peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
                return peliculas[i];
            }
        }
        return null; // Devolver null si no se encuentra la película
    }

    public void consultarDirector(String director) {
        String[] directorP = new String[contadorPeliculas];
        int nDirectoresP = 0;
        for (int i = 0; i < contadorPeliculas; i++) {
            if (peliculas[i].getDirector().equalsIgnoreCase(director)) {
                directorP[nDirectoresP] = peliculas[i].getTitulo();
                nDirectoresP++;
            }
        }
        if (nDirectoresP == 0) {
            System.out.println("Error: No se han encontrado películas  del director " + director);
        } else {
            Arrays.sort(directorP, 0, nDirectoresP);
            System.out.println("Peliculas del director " + director + ":");
            for (int i = 0; i < nDirectoresP; i++) {
                System.out.println("\t" + directorP[i]);
            }
        }
    }

    public void consultarLanzamiento(int ano) {
        int encontrado = 0;
        for (int i = 0; i < contadorPeliculas; i++) {
            if (peliculas[i].getFechaLanzamiento().getYear() == ano) {
                if (encontrado == 0) {
                    System.out.println("Peliculas lanzadas en el año " + ano + ":");
                }
                System.out.println(peliculas[i]);
                encontrado++;
            }
        }
        if (encontrado == 0) {
            System.out.println("Error: No se encontraron películas lanzadas en el año especificado." + ano);
        }
    }

    public void mostrarVideoteca() {
        System.out.println("Lista de películas en la videoteca:");
        for (int i = 0; i < contadorPeliculas; i++) {

            System.out.println("- " + peliculas[i]);
        }
    }

    public int getNumPeliculas() {
        return contadorPeliculas;
    }

}
