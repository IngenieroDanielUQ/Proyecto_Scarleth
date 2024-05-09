package co.edu.uniquindio.poo;

public class Gato implements Animal{
    String nombre;
    int edad;

    //Constructor de la clase gato (nombre y edad)
    public Gato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y Setters
    public String getNombre() {
        System.out.println(nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        System.out.println(edad);
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void emitirSonido() {
        // Implementacion del método emitirSonido para una clase Gato
        System.out.println("\n" + "Los gatos dicen: ¡Miau, miau! ");
    }

    @Override
    public void comer() {
        // Implementacion del método comer para una clase Gato
        System.out.println("Los gatos son carnivoros");
    }
    
}
