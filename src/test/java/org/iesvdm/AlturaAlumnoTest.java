package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AlturaAlumnoTest {

    /* aniadeNombre */

    @Test void aniadeNombre (){

        /*when : */
        String[] array = {"dani"};
        String nombre = "jose";

        /*do : */
        String[] result = AlturaAlumno.aniadeNombre(array, nombre);

        /*then : */
        assertTrue(result[0] == array[0]);
        assertTrue(result[result.length-1] == nombre);
        System.out.println("El array ha añadido el nombre " + nombre);
    }

    /* aniadeAltura */

    @Test void aniadeAltura (){

        /*when : */
        double[] array = {2.1};
        double altura = 1.5;

        /*do : */
        double[] result = AlturaAlumno.aniadeAltura(array);
        result[result.length-1]=altura;

        /*then : */
        assertTrue(array[0]==result[0]);
        assertTrue(result[result.length-1] == altura);

        System.out.println("El array ha añadido la altura " + altura);

    }

    /* modificaAltura */

    @Test void modificaAltura (){

        /*when : */
        double[] array = {1.5, 2.3};
        double altura = 3.4;
        int pos = 1;

        /*do : */
        double[] result = AlturaAlumno.modificaAltura(array, pos, altura);

        /*then : */
        assertTrue(array[0] == result[0]);
        assertTrue(result[result.length-1] == altura);

        System.out.println("El array modificado es: " + Arrays.toString(result));

    }

    /* buscaNombre */

    @Test void buscaNombre (){

        /*when : */
        String[] nombres = {"jose","cesar","alan"};
        String nombre = "cesar";
        int indice = 1;

        /*do : */
        int result = AlturaAlumno.buscaNombre(nombres, nombre);

        /*then : */
        assertEquals(indice, result);

    }

    @Test void buscaNombreNoEncontrado (){

        /*when : */
        String[] nombres = {"jose","cesar","alan"};
        String nombre = "cristina";
        int indice = -1;

        /*do : */
        int result =AlturaAlumno.buscaNombre(nombres, nombre);

        /*then : */
        assertEquals(indice, result);

    }

    /* mostrar */

    @Test void mostrar () {
a
        /*when : */


        /*do : */


        /*then : */


    }

    /* calculaMaximo */

    @Test void calculaMaximo (){

        /*when : */


        /*do : */


        /*then : */

    }

    /* calculaMedia */

    @Test void calculaMedia (){

        /*when : */


        /*do : */


        /*then : */

    }

}
