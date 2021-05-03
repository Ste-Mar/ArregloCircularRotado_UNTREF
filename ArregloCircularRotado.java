public class ArregloCircularRotado {

    public int cantidadDeRotaciones(Integer[] array) {

        return cantidadDeRotaciones(array, 0, array.length - 1);

    }

    public int cantidadDeRotaciones(Integer[] array, int posicionInicial, int posicionFinal) {

        int rotaciones = 0;

        if (array.length == 0 || array.length == 1) {
            return rotaciones;
        }

        if (posicionInicial >= posicionFinal) {
            return rotaciones;
        }

        int medio = (posicionFinal + posicionInicial) / 2;

        if (array[medio] > array[posicionFinal]) {

            rotaciones = cantidadDeRotaciones(array, posicionInicial + 1, posicionFinal - 1);

            return ++rotaciones;

        }

        if (array[medio] < array[posicionInicial]) {

            rotaciones = cantidadDeRotaciones(array, posicionInicial + 1, posicionFinal - 1);

            return --rotaciones;

        }

        return rotaciones;

    }

}
