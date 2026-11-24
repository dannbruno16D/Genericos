// Definimos una clase genérica con el parámetro <T>
public class Caja<T> {
    private T contenido;

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T obtener() {
        return contenido;
    }

    public static void main(String[] args) {
        // 1. Usando la caja con un String
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Hola desde Java");
        System.out.println(cajaDeTexto.obtener()); // Salida: Hola desde Java

        // 2. Usando la caja con un Integer
        Caja<Integer> cajaDeNumero = new Caja<>();
        cajaDeNumero.guardar(500);
        System.out.println(cajaDeNumero.obtener()); // Salida: 500
    }
}