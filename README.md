# invgate

Requisitos:

- Tener `Maven` instalado. 
- Tener jdk 8+ isntalado.

Ejecutar ejemplos y resultados

- `mvn clean test`

Los resultados aparecerán en pantalla.


## Ejercicio 1 - Algoritmia

Se creó algoritmo orientado a objetos. Dos clases, `Arbol` y `Nodo`. El árbol simplemente contiene la raiz del árbol n-ario y sabe imprimirse con formato pedido.

Se ejecutaron los tests con los ejemplos dados. Encontré 2 errores, el primero es que el primer ejemplo tiene el output como input y viceversa. El segundo fue para el tercer ejemplo, el cual el output no es el correcto. Faltó el valor `2500` (ver solución)

## Ejercicio 2 - Design

Si bien se está diseñando una solución OO, traté de no sobrediseñar. La interfaz `Tamagochi` declara lo que se puede hacer con una mascota y a esa interfaz se le pueden agregar métodos para mayores funcionalidades, que la `Especie` específica debería implementar en caso de que se agreguen. Se podría haber hecho un patrón de *Command*, para poder ejecutar comandos con las especies pero para el enunciado, esto parecía suficiente. Crear una clase `Mascota` también podría haber sido el caso, pero solo para contener el nombre e información que no cambiaba la funcionalidad principal.

La `Especie` funciona en conjunto con la interfaz `Estado`, las cuales denotan una especie de patrón *Visitor* y *State*, el estado cambia y llama a otra funcion de la `Especie`, según su estado, al momento de ejecutar un comando de la mascota. Así de esta forma, la Mascota va accionando de manera calculada dinámicamente según su estado.

En el ejemplo solo se hizo la `Tortuga`, que tiene un test para el caso.
