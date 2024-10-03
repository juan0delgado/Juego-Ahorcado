public class Main {
    public static void main(String[] args) {
        // Crear motores
        Motor motor1 = new Motor(1400, 240, 4, "Diesel");
        Motor motor2 = new Motor(1600, 260, 5, "Gasolina");

        // Crear vehículos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", motor1);
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Honda", motor2);

        // Imprimir información de los vehículos
        vehiculo1.imprimir();
        vehiculo2.imprimir();

        // Comparar motores
        Vehiculo.compararMotores(vehiculo1, vehiculo2);
    }
}
