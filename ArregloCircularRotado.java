public class ArregloCircularRotado {

    /**
     * pre: Ingresar el arreglo circular ordenado y sin numeros repetidos que desea
     * analizar
     * <p>
     * post: Retorna la menor cantidad de rotaciones posibles para volver a
     * ordenarlo
     * 
     * @param array debe estar ordenado y no debe contener numeros repetidos
     * @return retorna un entero que representa la cantidad de rotaciones necesarias
     *         para obtener el arreglo ordenado naturalmente
     */
    public int cantidadDeRotaciones(Integer[] array) {

        return cantidadDeRotaciones(array, 0, array.length - 1);

    }

    /**
     * pre: Ingresar el arreglo circular ordenado y sin numeros repetidos. La
     * 'posicionInicial' y 'posicionFinal' se modifican dentro del metodo,
     * reduciendo su longitud en cada llamado recursivo.
     * <p>
     * post: Retorna la menor cantidad de rotaciones posibles para volver a
     * ordenarlo
     * 
     * @param array           debe estar ordenado y no debe contener numeros
     *                        repetidos
     * @param posicionInicial posicion inicial de analisis del arreglo
     * @param posicionFinal   posicion final de analisis del arreglo
     * @return retorna un entero que representa la cantidad de rotaciones necesarias
     *         para obtener el arreglo ordenado naturalmente
     */
    private int cantidadDeRotaciones(Integer[] array, int posicionInicial, int posicionFinal) {

        int rotaciones = 0;

        if ((array.length == 0 || array.length == 1) || posicionInicial >= posicionFinal) {
            return rotaciones;
        }

        int medio = (posicionFinal + posicionInicial) / 2;

        if (array[medio] > array[posicionFinal]) {
            rotaciones = cantidadDeRotaciones(array, posicionInicial + 1, posicionFinal - 1) + 1;
        }

        if (array[medio] < array[posicionInicial]) {
            rotaciones = cantidadDeRotaciones(array, posicionInicial + 1, posicionFinal - 1) - 1;
        }

        return rotaciones;

    }

}
