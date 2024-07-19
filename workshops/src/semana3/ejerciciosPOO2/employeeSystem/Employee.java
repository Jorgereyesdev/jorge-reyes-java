package semana3.ejerciciosPOO2.employeeSystem;

public class Employee extends Person {

    private double salary;
    private int id;

    public Employee(String name, int age, double salary, int id) {
        super(name, age);
        this.salary = salary;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
