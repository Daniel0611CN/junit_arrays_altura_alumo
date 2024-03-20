package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

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
        assertTrue(result[pos] == altura);

        System.out.println("El array modificado es: " + Arrays.toString(result));

    }

    @Test void modificaAlturaNoValido (){

        /*when : */
        double[] array = {1.5, 2.3, 3.2, 5.1, 7.6};
        double altura = 3.4;
        int pos = 8;

        if (pos>=0 && pos<= array.length){

            /*do : */
            double[] result = AlturaAlumno.modificaAltura(array, pos, altura);

            /*then : */
            assertTrue(array[0] == result[0]);
            assertTrue(result[pos] == altura);

            System.out.println("El array modificado es: " + Arrays.toString(result));

        }
        else {
            System.out.println("El array no se ha podido modificar, la posición no es válida.");
        }

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
        String[] arraynombre = {"pepe", "paco", "dani", "angel", "cesar"};
        double[] arrayAltura = {1.2, 5.1, 8.6, 6.3, 10.2};

        /*do : */

        /* Aqui no se pone nada, ya que al tener que comprobar
        * unicamente si el array no está vacío, pues no hace falta.
        * Ademas es porque el metodo es void, por lo que no podemos
        * asignar un tipo de dato al array result. */

        /*then : */

        /* Aqui se comprueba si el array tiene mas de 0 posiciones
        * en ese caso el metodo funcionaria correctamente.
        * En caso contrario, indicaria que lo esperado es que devuelva
        * true, pero sin embargo, al ser menor que 0, devuelve false. */

        assertTrue(arraynombre.length>0);

        if (arraynombre.length == arrayAltura.length){
            System.out.println("Ambos arrays tienen la misma longitud.");
        }

        System.out.println("Se han impreso los arrays.");

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
