'''
Main.java
'''
public class Main {
    public static void main(String[] args) {
        // Obtener la única instancia del Carro
        Carro miCarro = Carro.obtenerInstancia();
        
        // Usar el método de la instancia
        miCarro.mostrarDetalles();
    }
}

'''
Carro.java
'''
public class Carro {
    // 1. Crear una instancia estática de la clase Carro
    private static Carro instanciaUnica;

    // 2. Hacer el constructor privado para que no se pueda instanciar desde fuera
    private Carro() {
        // Código de inicialización, por ejemplo:
        System.out.println("Carro creado.");
    }

    // 3. Proporcionar un método estático para obtener la instancia única
    public static Carro obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Carro();
        }
        return instanciaUnica;
    }

    // Otros métodos de la clase
    public void mostrarDetalles() {
        System.out.println("Detalles del carro.");
    }
}
