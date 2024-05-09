package co.edu.uniquindio.poo;

public class Telefono extends Dispositivo implements Nfc, Bluetooth, Internet, Energia {

    public Telefono(String nombre, String modelo, boolean sincronizacion, boolean conexion, boolean autenticacion,
            boolean enchufado) {
        super(nombre, modelo, sincronizacion, conexion, autenticacion, enchufado);
    }

    @Override
    public void sincronizarDispositivo() {
        System.out.println("Estado de sincronizacion NFC: "
                + (sincronizacion ? "Dispositivo sincronizado" : "Dispositivo no sincronizado"));
    }

    @Override
    public void conectarDispositivo() {
        System.out.println("Estado de conexion bluetooth: "
                + (conexion ? "Dispositivo conectado" : "Dispositivo desconectado"));
    }

    @Override
    public void autenticacion() {
        System.out.println("Estado de autenticación de red: "
                + (autenticacion ? "Dispositivo aceptado" : "Dispositivo rechazado"));
    }

    @Override
    public void dispositivoEnchufado() {
        System.out.println("Estado de carga: "
                + (enchufado ? "Dispositivo cargado" + "\n" : "Cargando..." + "\n"));
    }

}
