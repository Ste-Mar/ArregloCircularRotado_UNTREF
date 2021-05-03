import org.junit.Assert;
import org.junit.Test;

public class TestArregloCircularRotado {

    private ArregloCircularRotado analizador = new ArregloCircularRotado();

    @Test
    public void ingresarUnArregloVacioRetornaCeroRotaciones() {

        Integer[] arreglo = {};
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(0, rotaciones);

    }

    @Test
    public void ingresarUnArregloDeLongitudUnoRetornaCeroRotaciones() {

        Integer[] arreglo = { 1 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(0, rotaciones);

    }

    @Test
    public void ingresarUnArregloRotadoUnaSolaVezHoriaramenteRetornaUno() {

        Integer[] arreglo = { 2, 3, 4, 5, 6, 1 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(1, rotaciones);

    }

    @Test
    public void ingresarUnArregloRotadoTresVecesRetornaTres() {

        Integer[] arreglo = { 8, 9, 10, 2, 4, 6 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(3, rotaciones);

    }

    @Test
    public void ingresarUnArregloOrdenadoRetornaCeroRotaciones() {

        Integer[] arreglo = { 1, 2, 3, 4, 5, 6 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(0, rotaciones);

    }

    @Test
    public void ingresarUnArregloRotadoUnaVezAntihorariamenteRetornaMenosUno() {

        Integer[] arreglo = { 6, 1, 2, 3, 4, 5 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(-1, rotaciones);
    }

    @Test
    public void ingresarUnArregloRotadoDosVecesAntihorariamenteRetornaMenosDos() {

        Integer[] arreglo = { 8, 10, 0, 2, 4, 6, 7 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(-2, rotaciones);

    }

    @Test
    public void ingresarUnArregloRotadoTresVecesHorariamenteRetornaTres() {

        Integer[] arreglo = { 7, 8, 9, 10, 2, 4, 6 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(3, rotaciones);

    }

    @Test
    public void ingresarUnArregloOrdenadDeLongitudDosRetornaCero() {

        Integer[] arreglo = { 1, 2 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(0, rotaciones);

    }

    @Test

    public void ingresarUnArregloDeLongitudDosDesordenadoRetornaUno() {

        Integer[] arreglo = { 17, 1 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(1, rotaciones);

    }

    @Test
    public void ingresarUnArregloRotadoDosVecesRetornaDos() {

        Integer[] arreglo = { 8, 10, 6, 7 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(2, rotaciones);
    }

    @Test
    public void ingresarUnArregloRotadoTresVecesAntihorariamenteRetornaMenosTres() {

        Integer[] arreglo = { 9, 10, 12, 1, 2, 3, 4, 5, 6 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(-3, rotaciones);
    }

    @Test
    public void ingresarUnArregloConValoresNegativosRotadoDosVecesHorariamenteRetornaDos() {

        Integer[] arreglo = { 18, 30, 33, 40, 58, 70, 120, -12, 0 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(2, rotaciones);

    }

    @Test
    public void ingresarUnArregloRotadoSeisVecesAntihorariamenteRetornaMenosSeis() {

        Integer[] arreglo = { 20, 30, 40, 50, 60, 100, 0, 1, 2, 3, 4, 5, 7 };
        int rotaciones = analizador.cantidadDeRotaciones(arreglo);

        Assert.assertEquals(-6, rotaciones);
    }

}
