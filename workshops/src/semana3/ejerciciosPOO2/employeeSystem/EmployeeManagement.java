package semana3.ejerciciosPOO2.employeeSystem;

import java.util.ArrayList;

public class EmployeeManagement {
    private ArrayList<Employee> employees;

    public EmployeeManagement(){
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(int idEmployee) {
        employees.removeIf(employee -> employee.getId() == idEmployee);
    }

    public void employeeList() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getSalary() + ", " + employee.getId());
        }
    }


    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();

        TemporaryEmployee temporaryEmployee1 = new TemporaryEmployee("Sofia", 26, 1000.0, 2, 120);
        TemporaryEmployee temporaryEmployee2 = new TemporaryEmployee("Jorge", 23, 3000.0, 1, 30);
        PermanentEmployee permanentEmployee1 = new PermanentEmployee("Jeffrin", 27, 5000.0, 5, "Driver");
        PermanentEmployee permanentEmployee2 = new PermanentEmployee("Blanca", 21, 4000.0, 6, "Nurse");

        employeeManagement.addEmployee(temporaryEmployee1);
        employeeManagement.addEmployee(temporaryEmployee2);
        employeeManagement.addEmployee(permanentEmployee1);
        employeeManagement.addEmployee(permanentEmployee2);

        System.out.println("List of employees");
        employeeManagement.employeeList();

        employeeManagement.removeEmployee(1);

        System.out.println("\nNew list of employees");

        employeeManagement.employeeList();
    }
}
