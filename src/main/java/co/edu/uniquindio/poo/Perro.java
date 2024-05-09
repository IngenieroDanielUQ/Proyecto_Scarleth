package co.edu.uniquindio.poo;

public class Perro implements Animal{
    String nombre;
    int edad;

    //Constructor de la clase perro (nombre y edad)
    public Perro(String nombre, int edad) {
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
        // Implementacion del método emitirSonido para una clase perro
        System.out.println("\n" + "Los perros dicen: ¡Guau, Guau! ");
    }

    @Override
    public void comer() {
        // Implementacion del método comer para una clase perro
        System.out.println("Los perros son hervíboros");
    }

}
