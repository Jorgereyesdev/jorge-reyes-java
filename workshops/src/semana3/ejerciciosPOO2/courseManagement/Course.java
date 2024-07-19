package semana3.ejerciciosPOO2.courseManagement;

import java.util.ArrayList;

public class Course {
    private String name;
    private int code;

    private ArrayList<Student> studentsList;

    public Course(String name, int code) {
        this.name = name;
        this.code = code;
        this.studentsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void allStudents() {
        for (Student student : studentsList) {
            System.out.println(student.getName());
        }
    }

    @Override
    public String toString() {
        return "Course: " +
                "name = " + name + '\n' +
                "code = " + code + '\n' +
                "studentsList = " + studentsList.toString() +
                '\n';
    }
}
