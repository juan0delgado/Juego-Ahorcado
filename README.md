# Read me: Juego-Ahorcado
+ Nicolas Martinez
+ Camila Ariza.
+  Juan David Delgado B.
## Codigo:
+ https://replit.com/@delgadojuandavi/aorcado
# Juego del Ahorcado

Este proyecto es una implementación del clásico juego del Ahorcado en **Java**. El juego está estructurado de forma modular, con cada componente del juego gestionado por una clase específica para asegurar un código limpio, organizado y fácil de mantener.

## Descripción del proyecto

El código sigue las especificaciones de modularización solicitadas:

1. **JuegoAhorcado**: Contiene la **lógica principal del juego**. Se encarga de interactuar con el usuario, manejar los turnos y comprobar si el jugador ha ganado o perdido.
2. **Palabra**: Gestiona las **palabras y las operaciones** sobre ellas. Controla el estado de la palabra que debe adivinarse, permite mostrarla y verificar si las letras ingresadas coinciden con las letras de la palabra original.
3. **Ahorcado**: Se encarga de **manejar el dibujo y el estado del ahorcado**. A medida que el jugador falla, se va mostrando progresivamente el dibujo del ahorcado hasta que se complete.

### Estructura del proyecto

El código está dividido en tres clases principales, cada una con una responsabilidad clara:

- **`Main.java` (antes `JuegoAhorcado.java`)**: Maneja el flujo principal del juego, la interacción con el usuario, los turnos y la verificación de aciertos y fallos.
- **`Palabra.java`**: Gestiona la palabra que se debe adivinar, mostrando el estado actual de la palabra oculta y verificando las letras adivinadas.
- **`Ahorcado.java`**: Dibuja el ahorcado de acuerdo con el número de intentos fallidos y muestra el mensaje de derrota cuando se completa el ahorcado.

## Especificaciones de modularización

Este proyecto cumple con las siguientes especificaciones de modularización solicitadas:

1. **Clase `JuegoAhorcado`**: La lógica principal del juego está separada en esta clase. Aquí es donde se controla la interacción con el jugador (entrada y salida), el manejo de turnos y la verificación del estado del juego.
   
2. **Clase `Palabra`**: Toda la gestión relacionada con la palabra a adivinar está encapsulada en esta clase. Esta separación facilita el manejo de operaciones sobre la palabra, como verificar si una letra está en la palabra, mostrar el progreso de la palabra oculta, y verificar si la palabra ha sido completamente adivinada.
   
3. **Clase `Ahorcado`**: Se encarga exclusivamente de manejar el estado del dibujo del ahorcado. Esto incluye mostrar diferentes partes del dibujo a medida que el jugador acumula errores y manejar el estado final cuando el jugador pierde.

## Cómo ejecutar el proyecto


### Instrucciones de ejecución

1. Clona el repositorio en tu máquina local:

  
