# ArregloCircularRotado_UNTREF
## Ejercicio llevado a cabo durante la cursada de AyP2 (2021)

La eficiencia del algoritmo empleado debe ser igual a O(log(N)). Para ello es aplicado el paradigma **Divide and Conquer**.

1. El arreglo ingresado es dividido en sub-arreglos
2. Cada uno de ellos es resuelto aplicando **recursividad**
3. La resolución es obtenida combinando las soluciones de cada llamado recursivo

A partir de aplicar este paradigma, es posible utilizar el **Teorema Maestro**.

1. El algoritmo realiza un llamado recursivo --> a = 1 
2. Es dividido el arreglo en n/b --> b = 2 
3. El costo de dividir y agrupar es constante --> c = 0

De esta forma el algoritmo puede representarse como: **T(N) = T(n/2) + O(1)**

La eficiencia que lo caracteriza es la establecida como el caso número 2 del Teorema Maestro.

**Si logb(a) = c --> log2(1) = 0 = c ✅ => T(N) = O(log(N))**  
