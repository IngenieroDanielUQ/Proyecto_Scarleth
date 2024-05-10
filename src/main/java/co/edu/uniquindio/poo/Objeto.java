package co.edu.uniquindio.poo;

//Clase padre objeto
public class Objeto {
    protected  String nombre;
    protected  String modelo;
    protected boolean conexion;

    public Objeto(String nombre, String modelo, boolean conexion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.conexion = conexion;
    }
    public boolean isConexion() {
        return conexion;
    }
    public void setConexion(boolean conexion) {
        this.conexion = conexion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
    
