/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ed.videoteca.Pelicula;
import ed.videoteca.Videoteca;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DAW121
 */
public class VideotecaTest {
    
    public VideotecaTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        String titulo = "Inception ";
        String director="Christopher Nolan";
        
    }
    
    @AfterEach
    public void tearDown() {
       String titulo = " ";
        String director="";
    }

    /**
     * Test of agregarPelicula method, of class Videoteca.
     */
    @Test
    public void testAgregarPelicula() {
        System.out.println("agregarPelicula");
        Pelicula pelicula = null;
        Videoteca instance = null;
        boolean expResult = false;
        boolean result = instance.agregarPelicula(pelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPelicula method, of class Videoteca.
     */
    @Test
    public void testEliminarPelicula() {
        System.out.println("eliminarPelicula");
        Pelicula pelicula = null;
        Videoteca instance = null;
        Boolean expResult = null;
        Boolean result = instance.eliminarPelicula(pelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarPelicula method, of class Videoteca.
     */
    @Test
    public void testConsultarPelicula() {
        System.out.println("consultarPelicula");
        String titulo = "";
        Videoteca instance = null;
        Pelicula expResult = null;
        Pelicula result = instance.consultarPelicula(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarDirector method, of class Videoteca.
     */
    @Test
    public void testConsultarDirector() {
        System.out.println("consultarDirector");
        String director = "";
        Videoteca instance = null;
        instance.consultarDirector(director);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarLanzamiento method, of class Videoteca.
     */
    @Test
    public void testConsultarLanzamiento() {
        System.out.println("consultarLanzamiento");
        int ano = 0;
        Videoteca instance = null;
        instance.consultarLanzamiento(ano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarVideoteca method, of class Videoteca.
     */
    @Test
    public void testMostrarVideoteca() {
        System.out.println("mostrarVideoteca");
        Videoteca instance = null;
        instance.mostrarVideoteca();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPeliculas method, of class Videoteca.
     */
    @Test
    public void testGetNumPeliculas() {
        System.out.println("getNumPeliculas");
        Videoteca instance = null;
        int expResult = 0;
        int result = instance.getNumPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
