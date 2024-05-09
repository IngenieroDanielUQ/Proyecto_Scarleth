package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {

        Perro miPerro = new Perro("Albeiro", 7);
        miPerro.emitirSonido();
        miPerro.comer();

        Gato miGato = new Gato("Misirili", 3);
        miGato.emitirSonido();
        miGato.comer();

        Pato miPato = new Pato();
        miPato.volar();
        miPato.nadar();

    }
}
