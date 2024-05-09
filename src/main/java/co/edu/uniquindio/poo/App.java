package co.edu.uniquindio.poo;

/*
 * Implementacion en App.java
 */

public class App {
    public static void main(String[] args) {

    Telefono miTelefono = new Telefono("Xiaomi", "Redmi Note 9S");
    Automovil miAutomovil = new Automovil("Rogelio", "Twingo", "2x2");
    Laptop miLaptop = new Laptop("Lenovo", "IdeaPad5", 8, false);
    SmartTv miSmartTv = new SmartTv("LGTV", "Oled 2023", 67);

    miTelefono.getNombre();
    miTelefono.getModelo();
    miTelefono.autenticacion();
    miTelefono.conectarDispositivo();
    miTelefono.desconectarDispositivo();
    miTelefono.dispositivoEnchufado();

    miAutomovil.getNombre();
    miAutomovil.getModelo();
    miAutomovil.getTraccion();
    miAutomovil.conectarDispositivo();
    miAutomovil.desconectarDispositivo();

    miLaptop.getNombre();
    miLaptop.getModelo();
    miLaptop.autenticacion();
    miLaptop.conectarDispositivo();
    miLaptop.desconectarDispositivo();
    miLaptop.dispositivoEnchufado();

    miSmartTv.getNombre();
    miSmartTv.getModelo();
    miSmartTv.dispositivoEnchufado();
    miSmartTv.autenticacion();


    }
}
