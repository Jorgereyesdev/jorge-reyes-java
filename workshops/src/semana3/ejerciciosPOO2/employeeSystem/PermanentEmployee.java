package semana3.ejerciciosPOO2.employeeSystem;

public class PermanentEmployee  extends Employee {
    private String position;

    public PermanentEmployee(String name, int age, double salary, int id, String position) {
        super(name, age, salary, id);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
