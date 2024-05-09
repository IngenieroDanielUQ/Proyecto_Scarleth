package co.edu.uniquindio.poo;

public class Informacion {

    protected String nombre;
    protected int edad;
    
    public Informacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        System.out.println("Nombre de la mascota: " + nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        System.out.println("La edad de " + nombre + " es: " + edad + " años");
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
