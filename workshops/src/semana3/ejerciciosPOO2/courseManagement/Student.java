package semana3.ejerciciosPOO2.courseManagement;

public class Student {
    private String name;
    private int id;
    private String email;

    public Student(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nStudent: " +
                "id = " + id +
                ", name = " + name +
                ", email = " + email +
                '\n';
    }
}
