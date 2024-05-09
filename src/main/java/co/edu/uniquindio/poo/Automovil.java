package co.edu.uniquindio.poo;

public class Automovil extends Dispositivo implements Bluetooth{
    private String traccion;


    public Automovil(String nombre, String modelo, String traccion) {
        super(nombre, modelo);
        this.traccion = traccion;
    }


    public String getTraccion() {
        System.out.println("Traccion del vehiculo " + traccion);
        return traccion;
    }


    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }


    @Override
    public void conectarDispositivo() {
        System.out.println("Dispositivo " + nombre + " vinculado");
    }

    @Override
    public void desconectarDispositivo() {
        System.out.println("Dispositivo " + nombre + " desvinculado" + "\n");
    }
    
}
