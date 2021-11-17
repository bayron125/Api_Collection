package co.btrujillo.ejemplos.set;

import co.btrujillo.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        System.out.println(alumnos + " size = " +alumnos.size() );
        System.out.println("esta vacia = " + alumnos.isEmpty());

        alumnos.add(new Alumno("Daniel", 1));
        alumnos.add(new Alumno("Miguel", 7));
        alumnos.add(new Alumno("Juan", 6));

        alumnos.add(2,new Alumno("Pedro", 9));
        alumnos.add(new Alumno("Brandon", 3));

        alumnos.set(4, new Alumno("Brandon", 2));
        alumnos.add(new Alumno("Angela", 1));


        System.out.println(alumnos);

        alumnos.remove(new Alumno("Miguel", 5));



        System.out.println(alumnos + " size = " +alumnos.size() );
        System.out.println("esta vacia = " + alumnos.isEmpty());


    }
}
