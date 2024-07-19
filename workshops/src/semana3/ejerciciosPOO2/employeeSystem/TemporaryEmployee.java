package semana3.ejerciciosPOO2.employeeSystem;

public class TemporaryEmployee extends Employee {
    private int daysWorked;

    public TemporaryEmployee(String name, int age, double salary, int id, int daysWorked) {
        super(name, age, salary, id);
        this.daysWorked = daysWorked;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }
}
