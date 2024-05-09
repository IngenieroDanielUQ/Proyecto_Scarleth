package co.edu.uniquindio.poo;

//Clase padre Dispositivo
public class Objeto {
    protected  String nombre;
    protected  String modelo;

    public Objeto(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        System.out.println("Nombre del Vehiculo: " + nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        System.out.println("Modelo del Vehiculo: " + modelo);
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
    
