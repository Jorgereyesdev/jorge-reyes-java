package semana3.ejerciciosPOO;


import java.util.ArrayList;

public class Students {
    String holi = "holi";
    private String name;
    private ArrayList <Float> grades = new ArrayList<Float>();

    public Students(String name) {
        this.name = name;
    }
    public void addGrade(float grade) {
        grades.add(grade);
    }

    public float calculateAverage(ArrayList<Float> grades) {
        float sum = 0.0f;
        for (float grade : grades) {
            sum += grade;
        }
        float average = sum / grades.size();
        return average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Float> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Float> grades) {
        this.grades = grades;
    }

    public static void main(String[] args) {
        Students student1 = new Students("Jorge");
        student1.addGrade(9.5f);
        student1.addGrade(8.5f);
        student1.addGrade(7.5f);

        float average = student1.calculateAverage(student1.getGrades());

        System.out.println("Average grade for " + student1.getName() + ": " + average);
    }
}
