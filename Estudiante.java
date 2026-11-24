public class Estudiante<K, V> {

    private K matricula;
    private V nombre;

    public Estudiante(K matricula, V nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public K getMatricula() {
        return matricula;
    }

    public V getNombre() {
        return nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + nombre);
    }

    public static void main(String[] args) {

        Estudiante<Integer, String> alumno1 =
                new Estudiante<>(202630, "Carlos");

        Estudiante<String, String> alumno2 =
                new Estudiante<>("ICO030", "Mariana");

        alumno1.mostrarInformacion();

        System.out.println("----------------");

        alumno2.mostrarInformacion();
    }
}