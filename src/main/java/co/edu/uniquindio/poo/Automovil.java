package co.edu.uniquindio.poo;

public class Automovil extends Objeto implements Bluetooth{
    private String traccion;
    private boolean conexion;


    public Automovil(String nombre, String modelo, String traccion, boolean conexion) {
        super(nombre, modelo);
        this.traccion = traccion;
        this.conexion = conexion;
    }


    public String getTraccion() {
        System.out.println("Traccion del vehiculo: " + traccion);
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public boolean isConexion() {
        return conexion;
    }

    public void setConexion(boolean conexion) {
        this.conexion = conexion;
    }

    @Override
    public void conectarDispositivo() {
        System.out.println("Estado de conexion Bluetooth para " + nombre + ": "+(conexion ? "Dispositivo conectado" : "Dispositivo desconectado" + "\n"));
    }

}
