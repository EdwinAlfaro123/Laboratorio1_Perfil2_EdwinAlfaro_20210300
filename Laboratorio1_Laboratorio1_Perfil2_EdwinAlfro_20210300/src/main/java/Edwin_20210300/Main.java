package Edwin_20210300;

import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Estudiante{
    public static void main(String[] args) {
        Estudiante Estudiantes = new Estudiante();
        TreeMap<Integer, Estudiante> estudiantes = new TreeMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("(1) Agregar un estudiante");
        System.out.println("(2) Mostrar todos los estudiantes");
        System.out.println("(3) Actualizar datos del estudiante");
        System.out.println("(4) Eliminar a un estudiante");
        System.out.println("(5) Salir del programa");
        System.out.print("Escoja una opcion: ");
        int respuesta = scan.nextInt();

        estudiantes.put(1, "Edwin", 17, 8.9)
        estudiantes.put(2, "Liss", 17, 9)
        estudiantes.put(3, "Diego", 17, 7.5)
        estudiantes.put(4, "Joshua", 17, 6)

        do {
            switch (respuesta){
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String NewNombre= scan.next();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int NewEdad= scan.nextInt();
                    System.out.print("Ingrese el promedio del estudiante: ");
                    Double NewPromedio= scan.nextDouble();

                    if (NewEdad < 0){
                        System.out.println("Ingrese una edad valida");
                    }
                    if(NewPromedio < 0 ){
                        System.out.println("El promedio debe ser mayor que 0");
                    }
                    estudiantes.put(1, new Estudiante());
                    break;
                case 2:{
                    System.out.println("Ingrese el id del usuario que quier busacar: ");
                    System.out.println(estudiantes);
                }

                case 3:{
                    System.out.println("Ingrese cual estudiante quiere eliminar: ");
                    int IdEliminado = scan.nextInt();
                    break;
                }

                case 4:{
                    System.out.println("Ingrese el id del estudiante al que quire buscar: ");
                    int NewId = scan.nextInt();
                    System.out.println(estudiantes);
                    break;
                }

                case 5:{
                    break;
                }
            }
        } while(respuesta != 0);
         System.out.println("El sistema se ha cerrado");
    }
}