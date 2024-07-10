package semana2.arrays;

public class CalculadoraPromedios {
    public static void main(String[] args) {
        double[] calificaciones = {85.5, 90.0, 78.0, 92.5, 88.0, 76.5, 95.0, 89.5, 82.0, 87.0};

        double suma = 0.0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;

        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
