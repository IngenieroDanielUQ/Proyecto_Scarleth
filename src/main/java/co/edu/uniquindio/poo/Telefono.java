package co.edu.uniquindio.poo;

public class Telefono extends Dispositivo implements Nfc, Bluetooth, Internet, Energia{

    public Telefono(String nombre, String modelo) {
        super(nombre, modelo);
    }

    @Override
    public void sincronizarDispositivo() {
        System.out.println("El dispositivo " + nombre + "" +modelo + " fué sincronizado Satisfactoriamente");
    }

    @Override
    public void conectarDispositivo() {
        System.out.println("Dispositivo " + modelo + " vinculado");
    }

    @Override
    public void desconectarDispositivo() {
        System.out.println("Dispositivo " + modelo + " desvinculado");
    }

    @Override
    public void autenticacion() {
        System.out.println("Dispositivo " + nombre + " autenticado, ya puede conectarse a la Red");
    }

    @Override
    public void dispositivoEnchufado() {
        System.out.println("Cargando..." + "\n");
    }
    
}
