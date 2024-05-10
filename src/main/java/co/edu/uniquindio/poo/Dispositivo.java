package co.edu.uniquindio.poo;

//Clase padre Dispositivo
public class Dispositivo {
    protected  String nombre;
    protected  String modelo;
    protected boolean sincronizacion;
    protected boolean conexion;
    protected boolean autenticacion;
    protected boolean enchufado;

    

    public Dispositivo(String nombre, String modelo, boolean sincronizacion, boolean conexion, boolean autenticacion,
            boolean enchufado) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.sincronizacion = sincronizacion;
        this.conexion = conexion;
        this.autenticacion = autenticacion;
        this.enchufado = enchufado;
    }

    public Dispositivo(String nombre2, String modelo2, boolean conexion2, boolean autenticacion2, boolean enchufado2) {
        //TODO Auto-generated constructor stub
    }

    public String getNombre() {
        System.out.println("Nombre del dispositivo: " + nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        System.out.println("Modelo del dispositivo: " + modelo);
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public boolean isAutenticacion() {
        return autenticacion;
    }

    public void setAutenticacion(boolean autenticacion) {
        this.autenticacion = autenticacion;
    }

    public boolean isSincronizacion() {
        return sincronizacion;
    }

    public void setSincronizacion(boolean sincronizacion) {
        this.sincronizacion = sincronizacion;
    }

    public boolean isConexion() {
        return conexion;
    }

    public void setConexion(boolean conexion) {
        this.conexion = conexion;
    }
    
    public boolean isEnchufado() {
        return enchufado;
    }

    public void setEnchufado(boolean enchufado) {
        this.enchufado = enchufado;
    }

}
