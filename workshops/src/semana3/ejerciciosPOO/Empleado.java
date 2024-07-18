package semana3.ejerciciosPOO;

public class Empleado {
    private String nombre;
    private String posicion;
    private double salario;
    private int id;

    public Empleado(String nombre, String posicion, double salario, int id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * porcentaje / 100;
        } else {
            System.out.println("El porcentaje debe ser positivo.");
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Salario: " + salario);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jorge", "Desarrollador", 1500, 1);

        empleado1.mostrarInfo();
        // Aumento de salario
        empleado1.aumentarSalario(10);

        // Nuevo salario
        empleado1.mostrarInfo();

        empleado1.setNombre("Juan Reyes");
        empleado1.setPosicion("Senior Developer");

        // Nueva info
        empleado1.mostrarInfo();
    }
}
