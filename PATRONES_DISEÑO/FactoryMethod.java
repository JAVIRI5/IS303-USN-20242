'''
Main.java
'''

  // Clase principal para probar el patrón Factory Method
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de CreadorSedan y llamar al método operacion
        CreadorCarro creadorSedan = new CreadorSedan();
        creadorSedan.operacion();

        // Crear una instancia de CreadorSUV y llamar al método operacion
        CreadorCarro creadorSUV = new CreadorSUV();
        creadorSUV.operacion();
    }
}

'''
CreadorSUV.java
'''

 // Clase concreta CreadorSUV que implementa el método factoryMethod
public class CreadorSUV extends CreadorCarro {
    @Override
    public Carro factoryMethod() {
        return new SUV();
    }
}

'''
CreadorSedan.java
'''

// Clase concreta CreadorSedan que implementa el método factoryMethod
public class CreadorSedan extends CreadorCarro {
    @Override
    public Carro factoryMethod() {
        return new Sedan();
    }
}

'''
CreadorCarro.java
'''
// Clase abstracta CreadorCarro que declara el método factoryMethod
public abstract class CreadorCarro {
    // Método factoryMethod que las subclases deben implementar
    public abstract Carro factoryMethod();

    // Método operacion que utiliza el producto creado
    public void operacion() {
        Carro carro = factoryMethod();
        carro.conducir();
    }
}

'''
SUV.java
'''

// Clase concreta SUV que implementa la interfaz Carro
public class SUV implements Carro {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un SUV");
    }
} 

'''
Sedan.java
'''
// Clase concreta Sedan que implementa la interfaz Carro
public class Sedan implements Carro {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un Sedan");
    }
}

'''
Carro.java
'''
// Interfaz Carro que define el método conducir
public interface Carro {
    void conducir();
}


  
