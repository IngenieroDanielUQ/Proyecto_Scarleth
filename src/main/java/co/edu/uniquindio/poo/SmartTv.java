package co.edu.uniquindio.poo;

public class SmartTv extends Dispositivo implements Internet, Energia {
    private int pulgadas;

    public SmartTv(String nombre, String modelo, boolean sincronizacion, boolean conexion, boolean autenticacion,
            boolean enchufado, int pulgadas) {
        super(nombre, modelo, sincronizacion, conexion, autenticacion, enchufado);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        System.out.println("Pulgadas de " + nombre +" "+ modelo + ": " + pulgadas);
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public void autenticacion() {
        System.out.println("Estado de autenticación de red: "
                + (autenticacion ? "Dispositivo aceptado" : "Dispositivo rechazado"));
    }

    @Override
    public void dispositivoEnchufado() {
        System.out.println("Estado de enchufado: "
                + (enchufado ? "El dispositivo está listo para usarse": ""));
    }

}
