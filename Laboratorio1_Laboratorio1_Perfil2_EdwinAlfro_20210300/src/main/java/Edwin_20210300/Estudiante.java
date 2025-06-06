package Edwin_20210300;

import java.util.TreeMap;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public void Estudiantes (String nombre, int edad, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public Double getPromedio(){
        return promedio;
    }

    @Override
    public String toString(){
        return "[" + nombre + "]" + edad + "(" + promedio + ")";
    }
}
