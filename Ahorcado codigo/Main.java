import java.util.Scanner;

public class Main {  // Cambia el nombre de la clase a 'Main'
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Profesor, ingrese una palabra: ");
        String palabraOriginal = scanner.nextLine().toLowerCase();

        System.out.println("\n\n\n\n\n\n\n\n\n");  // Limpiar la pantalla

        Palabra palabra = new Palabra(palabraOriginal);  // Crear objeto palabra
        Ahorcado ahorcado = new Ahorcado();  // Crear objeto ahorcado

        int intentosFallidos = 0;
        boolean palabraAdivinadaCompletamente = false;

        // Bucle del juego
        while (intentosFallidos < 6 && !palabraAdivinadaCompletamente) {
            palabra.mostrarPalabra();  // Mostrar progreso
            System.out.print("Estudiante, adivine una letra: ");
            char letra = scanner.nextLine().toLowerCase().charAt(0);  // Leer letra

            // Verificar la letra
            if (!palabra.verificarLetra(letra)) {
                intentosFallidos++;
                ahorcado.mostrarAhorcado(intentosFallidos);
            }

            palabraAdivinadaCompletamente = palabra.estaAdivinada();  // Verificar si ya se adivinó
        }

        // Mostrar resultado del juego
        if (palabraAdivinadaCompletamente) {
            System.out.println("¡Felicidades, adivinaste la palabra!");
        } else {
            System.out.println("La palabra era: " + palabra.getPalabraOriginal());
        }

        scanner.close();  // Cerrar el escáner
    }
}
