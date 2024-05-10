package co.edu.uniquindio.poo;

public class Gato extends Informacion implements Animal{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        // Implementacion del método emitirSonido para una clase gato
        System.out.println(nombre +" dice: ¡Miau! ");
    }

    @Override
    public void comer() {
        // Implementacion del método comer para una clase gato
        System.out.println(nombre + " es carnívoro" + "\n");
    }
    
}
