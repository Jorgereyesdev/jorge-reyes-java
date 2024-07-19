package semana3.ejerciciosPOO2.courseManagement;

import java.util.ArrayList;

public class CourseManagement {
    private final ArrayList<Course> courses;

    public CourseManagement() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(String code, Student student) {
        for (Course course : courses) {
            if (course.getCode() == Integer.parseInt(code)) {
                course.addStudent(student);
                return;
            }
        }
        System.out.println("Course not found");
    }

    public void listStudentsInCourse(String code) {
        for (Course course : courses) {
            if (course.getCode() == Integer.parseInt(code)) {
                System.out.println("Students in course " + course.getName() + ":");
                course.allStudents();
                return;
            }
        }
    }

    public void coursesList() {
        for (Course course : courses) {
            System.out.println(course.toString());
        }
    }

    public static void main(String[] args) {
    CourseManagement courseManagement = new CourseManagement();

    Course course1 = new Course("Math", 1234);
    Course course2 = new Course("Science", 5678);

    courseManagement.addCourse(course1);
    courseManagement.addCourse(course2);

    Student student1 = new Student("Jorge", 10, "jorgereyes2017@gmial.com");
    Student student2 = new Student("Maria", 11, "mariadelgado2018@gmail.com");
    Student student3 = new Student("Sofia", 12, "Sofia@gmail.com");

    courseManagement.enrollStudentInCourse("1234", student1);
    courseManagement.enrollStudentInCourse("5678", student2);
    courseManagement.enrollStudentInCourse("1234", student3);
    courseManagement.enrollStudentInCourse("5678", student1);

    courseManagement.listStudentsInCourse("1234");

    courseManagement.listStudentsInCourse("5678");

    System.out.println("\nAll courses:");
    courseManagement.coursesList();
    }
}
