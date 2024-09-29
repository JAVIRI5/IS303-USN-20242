'''
Main.java
'''
// Clase principal para probar el patrón Abstract Factory
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de FabricaVehiculoCiudad y usarla para crear un Sedan y un Scooter
        FabricaVehiculo fabricaCiudad = new FabricaVehiculoCiudad();
        Carro carroCiudad = fabricaCiudad.crearCarro();
        Moto motoCiudad = fabricaCiudad.crearMoto();
        carroCiudad.conducir();
        motoCiudad.conducir();

        // Crear una instancia de FabricaVehiculoTodoTerreno y usarla para crear un SUV y una Motocicleta
        FabricaVehiculo fabricaTodoTerreno = new FabricaVehiculoTodoTerreno();
        Carro carroTodoTerreno = fabricaTodoTerreno.crearCarro();
        Moto motoTodoTerreno = fabricaTodoTerreno.crearMoto();
        carroTodoTerreno.conducir();
        motoTodoTerreno.conducir();
    }
}


'''
FabricaVehiculoTodoTerreno.java
'''

// Clase concreta FabricaVehiculoTodoTerreno que implementa la interfaz FabricaVehiculo
public class FabricaVehiculoTodoTerreno implements FabricaVehiculo {
    @Override
    public Carro crearCarro() {
        return new SUV();
    }

    @Override
    public Moto crearMoto() {
        return new Motocicleta();
    }
}


'''
FabricaVehiculoCiudad.java
'''

// Clase concreta FabricaVehiculoCiudad que implementa la interfaz FabricaVehiculo
public class FabricaVehiculoCiudad implements FabricaVehiculo {
    @Override
    public Carro crearCarro() {
        return new Sedan();
    }

    @Override
    public Moto crearMoto() {
        return new Scooter();
    }
}


'''
FabricaVehiculo.java
'''

// Interfaz FabricaVehiculo que declara métodos para crear Carro y Moto
public interface FabricaVehiculo {
    Carro crearCarro();
    Moto crearMoto();
}


'''
Motocicleta.java
'''
  
// Clase concreta Motocicleta que implementa la interfaz Moto
public class Motocicleta implements Moto {
    @Override
    public void conducir() {
        System.out.println("Conduciendo una Motocicleta");
    }
}


'''
Scooter.java
'''
  
// Clase concreta Scooter que implementa la interfaz Moto
public class Scooter implements Moto {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un Scooter");
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
Moto.java
'''

// Interfaz Moto que define el método conducir
public interface Moto {
    void conducir();
}


'''
Carro.java
'''
  
// Interfaz Carro que define el método conducir
public interface Carro {
    void conducir();
}
