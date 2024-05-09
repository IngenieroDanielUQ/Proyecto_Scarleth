package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {

        Perro miPerro = new Perro("Firulais", 7);
        miPerro.getNombre();
        miPerro.getEdad();
        miPerro.emitirSonido();
        miPerro.comer();

        Gato miGato = new Gato("Misirili", 3);
        miGato.getNombre();
        miGato.getEdad();
        miGato.emitirSonido();
        miGato.comer();

        Pato miPato = new Pato();
        miPato.volar();
        miPato.nadar();

    }
}
