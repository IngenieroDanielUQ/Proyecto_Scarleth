package co.edu.uniquindio.poo;

public class Laptop extends Dispositivo implements Bluetooth, Internet, Energia{

    private int duracionBateria;
    private boolean conexion;

    public Laptop(String nombre, String modelo,int duracionBateria, boolean conexion) {
        super(nombre, modelo);
        this.duracionBateria = duracionBateria;
        this.conexion = conexion;
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
        System.out.println(modelo + " Conectado");
    }

    @Override
    public void desconectarDispositivo() {
        System.out.println(modelo + " desconectado");
    }

    @Override
    public void autenticacion(){
        System.out.println("Estado de conexion: " + (conexion ? "Dispositivo aceptado" : "Dispositivo rechazado"));
    }

    @Override
    public void dispositivoEnchufado() {
        System.out.println("Estado de la batería: 81% restante - 6H 3min" + "\n");
    }

    public boolean isConexion() {
        return conexion;
    }

    public void setConexion(boolean conexion) {
        this.conexion = conexion;
    }
    
}
