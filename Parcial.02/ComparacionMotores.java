public class ComparacionMotores {
    // Método estático para comparar dos motores
    public static void compararMotores(Vehiculo v1, Vehiculo v2) {
        if (v1.getMotor().getCilindrada() > v2.getMotor().getCilindrada()) {
            System.out.println("El vehículo con placa " + v1.getPlaca() + " tiene el mejor motor.");
        } else if (v1.getMotor().getCilindrada() < v2.getMotor().getCilindrada()) {
            System.out.println("El vehículo con placa " + v2.getPlaca() + " tiene el mejor motor.");
        } else {
            System.out.println("Ambos vehículos tienen motores con la misma cilindrada.");
        }
    }
}
