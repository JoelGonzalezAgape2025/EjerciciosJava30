package Ejercicios02;

public class Alumno {

    private int codigo;
    private String nombre;
    private String carnet;

    public Alumno(){
        
    }

    public Alumno(int codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

}
