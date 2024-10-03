public class Motor {
    private int cilindrada;
    private double velocidadMax;
    private int caballosFuerza;
    private String tipoCombustible;

    // Constructor
    public Motor(int cilindrada, double velocidadMax, int caballosFuerza, String tipoCombustible) {
        this.cilindrada = cilindrada;
        this.velocidadMax = velocidadMax;
        this.caballosFuerza = caballosFuerza;
        this.tipoCombustible = tipoCombustible;
    }

    // Método para imprimir los detalles del motor
    public void imprimir() {
        System.out.println("Motor [Cilindrada: " + cilindrada + 
                           ", Velocidad Máxima: " + velocidadMax + 
                           ", Caballos de Fuerza: " + caballosFuerza + 
                           ", Tipo de Combustible: " + tipoCombustible + "]");
    }

    // Getter para obtener la cilindrada
    public int getCilindrada() {
        return cilindrada;
    }
}
