package co.edu.uniquindio.poo;

public class Laptop extends Dispositivo implements Bluetooth, Internet, Energia {
    private int duracionBateria;

    public Laptop(String nombre, String modelo, boolean sincronizacion, boolean conexion, boolean autenticacion,boolean enchufado, int duracionBateria) {
        super(nombre, modelo, sincronizacion, conexion, autenticacion, enchufado);
        this.duracionBateria = duracionBateria;
    }

    public int getDuracionBateria() {
        System.out.println("Duracion de la batería " + duracionBateria + " hrs");
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    @Override
    public void conectarDispositivo() {
        System.out.println("Estado de conexion bluetooth: "
                + (conexion ? "Dispositivo vinculado" : "Dispositivo desvinculado"));
    }

    @Override
    public void autenticacion() {
        System.out.println("Estado de autenticación de red: "
                + (autenticacion ? "Dispositivo aceptado" : "Dispositivo rechazado"));
    }

    @Override
    public void dispositivoEnchufado() {
        System.out.println("Estado de la batería:: "
                + (enchufado ? "81% restante - 6H 3min" + "\n" : "Cargando..." + "\n"));
    }

}