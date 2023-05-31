# Testing de la clase Dado

Aquí haremos las pruebas unitarias de la clase Dado.

## Tareas

1. Añadir las dependencias de JUnit al ``pom.xml``.
2. Crear el paquete `com.inserta` en la carpeta `/test/java`.
3. Crear la clase ``DadoTest`` en el paquete anterior.

## Pruebas Unitarias

- Testear el constructor que recibe por parámetros el número de caras. Para ello, creamos un dado de 6 caras. Dar por válida la prueba si se crea correctamente un Dado de 6 caras (usando el método ``.getCaras()``).
- Testear el constructor por defecto. Debería crear un dado de 6 caras.
- Testear el método lanzar(). Debería retornar un número entre 1 y el número de caras.
- Testear el acumulador del dado. 
