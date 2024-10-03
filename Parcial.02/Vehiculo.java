public class Vehiculo {
    private String placa;
    private String marca;
    private Motor motor;

    // Constructor
    public Vehiculo(String placa, String marca, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.motor = motor;
    }

    // Métodos Get
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }

    // Métodos Set
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Método para imprimir la información del vehículo
    public void imprimir() {
        System.out.println("Vehículo [Placa: " + placa + ", Marca: " + marca + "]");
        motor.imprimir();
    }
}
