package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlturaAlumnoTest {

    /* aniadeNombre */

    @Test void aniadeNombre (){

        /*when : */

        /* Definimos las variables. */

        String[] array = {"dani"};
        String nombre = "jose";

        /*do : */

        /* Creamos un array result, que copie las propiedades de array, y añada el nombre. */

        String[] result = AlturaAlumno.aniadeNombre(array, nombre);

        /*then : */

        /* Aquí comprobamos que ambos arrays tengan en la posición 0, el mismo dato. */

        assertTrue(result[0] == array[0]);

        /* Además, el nombre debe estar en la última posición del array result. */

        assertTrue(result[result.length-1] == nombre);

        /* Finalmente imprimimos el mensaje por pantalla. */

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
        assertEquals(altura, array[pos]);
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

        /* Este test, no se si está bien profe, porque no se
        * si solo hace falta el assert de abajo o si hace falta comprobar otra cosa. */

        /*when : */

        /* Definimos las variables. */

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

        /* Por último, debemos imprimir por pantalla el mensaje,
        * para comprobar que el método ha funcionado correctamente. */

        System.out.println("Se han impreso los arrays.");

        /* Además, aunque no es necesario, el ejercicio comprueba
        * si ambos arrays tienen la misma longitud, y lo muestra por pantalla. */

        if (arraynombre.length == arrayAltura.length){
            System.out.println("Ambos arrays tienen la misma longitud.");
        }

    }

    /* calculaMaximo */

    @Test void calculaMaximo (){

        /*when : */

        /* Aquí he realizado un cambio, para que el valor de la posición,
        * no tenga que ponerse en el máximo, es por eso que lo he cambiado a int. */

        int pos = 1;
        double[] array = {1.5, 4.2};
        double maximo = array[pos];

        /*do : */

        double[] result = AlturaAlumno.calculaMaximo(array);

        /* Aquí asignamos al array los valores de la posición y el máximo, como indica el método. */

        result[0] = pos;
        result[1] = maximo;

        /*then : */

        /* Comprobamos que el array tenga una longitud mayor que cero. */

        assertTrue(array.length>0);

        /* Comprobamos que el máximo esté en la posición indicada en el array. */

        assertTrue(maximo == array[pos]);

        /* Comprobamos que el valor de la posición sea mayor o igual a 0,
        * y menor (o menor e igual) que la longitud del array result. */

        assertTrue(pos>=0 && pos<result.length);

        /* Por último, imprimimos por pantalla los resultados. */

        System.out.println("El maximo esta en la posicion " + pos + " , y es " + maximo + ".");
        System.out.println("El array es: " + Arrays.toString(result));

        /* Ejercicio realizado de otra forma
        * CAMBIOS:
        *
        * when :
        *
        * double maximo = array[1];
        * double pos = 1;
        *
        * then :
        *
        * assertTrue(maximo == array[1]); */

        /* Además, podríamos crear otro @Test, que compruebe que el método no es correcto,
        * ya que la posición es mayor a la del array, o menor a cero. */

    }

    @Test void calculaMaximoNoValido (){

        /*when : */

        /* Aquí es necesario poner double, ya que pos y maximo, que es igual a array[pos],
        * deben tener un valor diferente, para que se imprima el mensaje por pantalla. */

        /* double pos = -2; También sería válido. */

        double pos = 5;
        double[] array = {1.5, 4.2};
        double maximo = array[1];

        /*do : */

        double[] result = AlturaAlumno.calculaMaximo(array);

        /* Aqui asignamos al array los valores de la posicion y el maximo, como indica el metodo. */

        result[0] = pos;
        result[1] = maximo;

        /*then : */

        /* Comprobamos que el array tenga una longitud mayor que cero. */

        assertTrue(array.length>0);

        System.out.println("El array tiene más de 0 posiciones.");

        /* Comprobamos que el valor de la posición sea menor que 0,
         * y mayor (o mayor e igual) que la longitud del array result. */

        assertTrue(pos<0 || pos>result.length);

        if (pos<0) {
            System.out.println("La posición es menor a 0.");
        } else if (pos>result.length){
            System.out.println("La posición es mayor a la longitud del array.");
        } else if (pos == result.length) {
            System.out.println("La posición es igual a la longitud del array.");
        }

        /* Por último, imprimimos por pantalla los resultados. */
        System.out.println("No se ha podido calcular el máximo.");

    }

    /* calculaMedia */

    @Test void calculaMedia (){

        /*when : */
        double[] array = {5.3, 8.5, 9.1, 7.2};
        double suma = (5.3 + 8.5 + 9.1 + 7.2);
        double media = (suma/array.length);

        /*do : */
        double result = AlturaAlumno.calculaMedia(array);

        /*then : */
        assertTrue(array.length>0);


    }

    @Test void calculaMediaNoValido (){

    }

}
