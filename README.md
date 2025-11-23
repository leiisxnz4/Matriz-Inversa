# Matriz-Inversa

¿Cómo funciona el programa para obtener la inversa de una matriz?

Este programa lee una matriz de tamaño 2×2 desde un archivo de entrada, calcula su determinante y, si es posible, obtiene la matriz inversa usando la fórmula correspondiente. Finalmente, guarda el resultado en un archivo de salida.

1. Lectura del archivo y carga de la matriz

Lo primero que hace el programa es pedir el nombre del archivo donde viene la matriz.

Luego:

Abre el archivo
Lee los cuatro valores que forman la matriz 2×2
Los muestra en pantalla

El resultado queda guardado en una matriz A de la forma:

a  b
c  d

Esto permite trabajar fácilmente con los valores después.

2. Cálculo del determinante

Para saber si una matriz tiene inversa, primero se calcula su determinante, usando la fórmula de una matriz 2×2:

det = (a * d) – (b * c)

En el código de java aparece como:

double det = A[0][0] * A[1][1] - A[0][1] * A[1][0];

Si el determinante es 0, la matriz no tiene inversa, así que el programa termina ahí.

3. Obtención de la matriz inversa

Si el determinante es distinto de cero, entonces sí es posible calcular la inversa.
La fórmula para invertir una matriz 2×2 es:

1/det *   d   -b
         -c    a

El programa aplica esa misma fórmula, dividiendo cada componente entre el determinante.

En el código:

inv[0][0] =  A[1][1] / det;
inv[0][1] = -A[0][1] / det;
inv[1][0] = -A[1][0] / det;
inv[1][1] =  A[0][0] / det;

4. Escritura del archivo de salida

Se imprime en pantalla y se escribe también en el archivo línea por línea:

inv[0][0]   inv[0][1]
inv[1][0]   inv[1][1]

- Ventaja principal

El método usado es muy rápido porque la fórmula para la inversa de una matriz 2×2 es directa: no necesita métodos más largos como Gauss–Jordan. Solo requiere calcular el determinante y aplicar la fórmula correspondiente.
