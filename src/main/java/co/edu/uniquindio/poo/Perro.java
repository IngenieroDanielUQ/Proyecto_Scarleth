package co.edu.uniquindio.poo;

public class Perro extends Informacion implements Animal{
    
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        // Implementacion del método emitirSonido para una clase perro
        System.out.println(nombre +" dice: ¡Guau, Guau! ");
    }

    @Override
    public void comer() {
        // Implementacion del método comer para una clase perro
        System.out.println(nombre + " es hervíboro" + "\n");
    }

}
