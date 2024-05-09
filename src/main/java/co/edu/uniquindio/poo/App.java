package co.edu.uniquindio.poo;

/*
 * Implementacion en App.java
 */

public class App {
    public static void main(String[] args) {

        Telefono miTelefono = new Telefono("Xiaomi", "Redmi Note 9S", true, false, true, true);
        Automovil miAutomovil = new Automovil("Rogelio", "Twingo", "2x2", false);
        Laptop miLaptop = new Laptop("Lenovo", "IdeaPad5", true, false, true, 6);
        SmartTv miSmartTv = new SmartTv("LGTV", "Oled 2023", false, false, false, false, 67);

        miTelefono.getNombre();
        miTelefono.getModelo();
        miTelefono.sincronizarDispositivo();
        miTelefono.conectarDispositivo();
        miTelefono.autenticacion();
        miTelefono.dispositivoEnchufado();

        miAutomovil.getNombre();
        miAutomovil.getModelo();
        miAutomovil.getTraccion();
        miAutomovil.conectarDispositivo();

        miLaptop.getNombre();
        miLaptop.getModelo();
        miLaptop.autenticacion();
        miLaptop.conectarDispositivo();
        miLaptop.dispositivoEnchufado();

        miSmartTv.getNombre();
        miSmartTv.getModelo();
        miSmartTv.getPulgadas();
        miSmartTv.dispositivoEnchufado();
        miSmartTv.autenticacion();
    }
}
