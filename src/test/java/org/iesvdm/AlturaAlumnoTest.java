package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AlturaAlumnoTest {

    /* aniadeNombre */

    @Test void aniadeNombre (){

        /*when : */
        String[] array = new String[0];
        String nombre = "jose";

        /*do : */
        String[] nuevo = AlturaAlumno.aniadeNombre(array, nombre);

        /*then : */
        String[] result = AlturaAlumno.aniadeNombre(array, nombre);
        assertEquals(array.length,nuevo.length-1);
        assertArrayEquals(result, nuevo);

        // Preguntar si el ejercicio esta bien

    }

    /* aniadeAltura */

    @Test void aniadeAltura (){

        /*when : */
        double[] array = {1.3, 2.5, 6.31};
        double altura = 1.5;

        /*do : */
        double[] nuevo = new double[array.length+1];
        nuevo[array.length-1] = altura;
        double[] result = new double[nuevo.length];
        result[array.length-1] = altura;

        /*then : */
        assertEquals(array.length, result.length-1);
        assertArrayEquals(nuevo, result);

        // Preguntar si el ejercicio esta bien

    }

    /* modificaAltura */

    @Test void modificaAltura (){

        /*when : */
        double[] array = {1.3, 2.5, 4.1};
        double altura = 5.1;
        int pos = 2;

        /*do : */
        double[] nuevo = new double[array.length];
        for (int i = 0; i < array.length; i++){
            array[i] = nuevo [i];
        }
        nuevo[pos] = altura;
        double[] result = new double[array.length];
        result[pos] = altura;

        /*then : */
        assertEquals(array.length, result.length);
        assertArrayEquals(nuevo, result);

        // Preguntar si el ejercicio esta bien

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
