package semana3.ejerciciosPOO;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.prestado = false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya esta prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no esta prestado.");
        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954);
        libro1.prestar();
        libro1.devolver();

        Libro libro2 = new Libro("La Divina Comedia", "Miguel de Cervantes", 1605);
        libro2.prestar();
        libro2.prestar();
    }
}

