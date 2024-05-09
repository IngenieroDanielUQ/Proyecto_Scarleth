package co.edu.uniquindio.poo;

public class SmartTv extends Dispositivo implements Internet, Energia {
    private int pulgadas;

    public SmartTv(String nombre, String modelo, int pulgadas) {
        super(nombre, modelo);
    }

    public int getPulgadas() {
        System.out.println("Pulgadas de " + nombre + modelo + ": " + pulgadas);
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public void autenticacion() {
        System.out.println("Dispositivo conectado");
    }

    @Override
    public void dispositivoEnchufado() {
        System.out.println("Dispositivo " + nombre + modelo + " conectado, no lo desenchufe mientras esté en funcionamiento");
    }

}
