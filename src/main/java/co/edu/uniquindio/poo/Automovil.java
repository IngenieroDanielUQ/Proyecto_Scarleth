package co.edu.uniquindio.poo;

public class Automovil extends Objeto implements Bluetooth{
    private String traccion;


    public Automovil(String nombre, String modelo, String traccion, boolean conexion) {
        super(nombre, modelo, conexion);
        this.traccion = traccion;
    }
    
    public String getTraccion() {
        System.out.println("Traccion del vehiculo: " + traccion);
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    @Override
    public void conectarDispositivo() {
        System.out.println("Estado de conexion Bluetooth para " + nombre + ": "+(conexion ? "Dispositivo conectado" : "Dispositivo desconectado" + "\n"));
    }

}
