'''
Main.java
'''

// Clase principal para probar el patrón Builder
public class Main {
    public static void main(String[] args) {
        // Usando el Builder para construir una instancia de Casa
        Casa casa = new Casa.CasaBuilder()
                .setParedes("Ladrillo")
                .setTecho("Teja")
                .setPiso("Mármol")
                .setPiscina(true)
                .setGaraje(true)
                .build();

        // Imprimiendo los detalles de la casa construida
        System.out.println(casa);
    }
}


'''
Casa.java
'''

// Clase Casa que representa el producto final
public class Casa {
    private String paredes;
    private String techo;
    private String piso;
    private boolean piscina;
    private boolean garaje;

    // Constructor privado que recibe un objeto CasaBuilder
    private Casa(CasaBuilder builder) {
        this.paredes = builder.paredes;
        this.techo = builder.techo;
        this.piso = builder.piso;
        this.piscina = builder.piscina;
        this.garaje = builder.garaje;
    }

    // Método toString para imprimir los detalles de la casa
    @Override
    public String toString() {
        return "Casa [paredes=" + paredes + ", techo=" + techo + ", piso=" + piso + 
               ", piscina=" + piscina + ", garaje=" + garaje + "]";
    }

    // Clase estática interna CasaBuilder que sigue el patrón Builder
    public static class CasaBuilder {
        private String paredes;
        private String techo;
        private String piso;
        private boolean piscina;
        private boolean garaje;

        // Métodos para establecer cada atributo de la casa
        public CasaBuilder setParedes(String paredes) {
            this.paredes = paredes;
            return this;
        }

        public CasaBuilder setTecho(String techo) {
            this.techo = techo;
            return this;
        }

        public CasaBuilder setPiso(String piso) {
            this.piso = piso;
            return this;
        }

        public CasaBuilder setPiscina(boolean piscina) {
            this.piscina = piscina;
            return this;
        }

        public CasaBuilder setGaraje(boolean garaje) {
            this.garaje = garaje;
            return this;
        }

        // Método build que devuelve una instancia de Casa
        public Casa build() {
            return new Casa(this);
        }
    }
}
