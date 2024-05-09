package co.edu.uniquindio.poo;

public class Pato implements Volador , Nadador{

    //Método de la interfaz volador
    @Override
    public void volar() {
        System.out.println("\n" +"los patos vuelan y son capaces de recorrer grandes distancias y alcanzar alturas sorprendentes con tal de llegar a su destino cada año.");
    }

    //Método de la interfaz nadador
    @Override
    public void nadar() {
        System.out.println("Los patos Tienen el cuerpo compacto, por lo que no se les dificulta nadar bajo el agua");
    }
    
}
