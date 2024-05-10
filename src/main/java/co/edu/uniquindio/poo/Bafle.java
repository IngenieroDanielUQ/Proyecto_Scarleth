package co.edu.uniquindio.poo;

public class Bafle extends Objeto implements Bluetooth{

    public Bafle(String nombre, String modelo, boolean conexion) {
        super(nombre, modelo, conexion);
    }

    @Override
    public String getNombre() {
        System.out.println("Nombre del bafle: " + nombre);
        return modelo;
    }

    @Override
    public String getModelo() {
        System.out.println("Modelo del bafle: " + modelo);
        return modelo;
    }

    @Override
    public void conectarDispositivo() {
        System.out.println("Estado de conexion Bluetooth para " + nombre + " " + modelo + ": "+(conexion ? "Dispositivo Vinculado" : "Dispositivo desvinculado" + "\n"));
    }

}
