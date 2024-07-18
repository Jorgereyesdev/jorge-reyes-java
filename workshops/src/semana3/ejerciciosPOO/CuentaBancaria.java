package semana3.ejerciciosPOO;

public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("Error: No puede depositar negativos, CV.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("Error: Saldo insuficiente o cantidad a retirar negativa, CV.");
        }
    }

    public void mostrarBalance() {
        System.out.println("El balance actual es: $" + saldo);
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Jorge Reyes", 5200);

        cuenta1.mostrarBalance();

        cuenta1.depositar(500);

        cuenta1.mostrarBalance();

        cuenta1.retirar(300);

        cuenta1.mostrarBalance();

        cuenta1.retirar(1500);

        cuenta1.mostrarBalance();
    }
}
