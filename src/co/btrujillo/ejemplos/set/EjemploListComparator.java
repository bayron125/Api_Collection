package co.btrujillo.ejemplos.set;

import co.btrujillo.ejemplos.modelo.Alumno;

import java.util.*;


public class EjemploListComparator {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Daniel", 1));
        alumnos.add(new Alumno("Miguel", 7));
        alumnos.add(new Alumno("Juan", 6));
        alumnos.add(new Alumno("Pedro", 9));
        alumnos.add(new Alumno("Brandon", 3));
        alumnos.add(new Alumno("Brandon", 2));
        alumnos.add(new Alumno("Angela", 1));

        System.out.println("Ordenamiento con clase Collections");
        Collections.sort(alumnos);
        alumnos.forEach(System.out::println);
        System.out.println("Ordenamiento por metodo 'sort' de la clase List");
        alumnos.sort(Comparator.comparing(Alumno::getNota));
        alumnos.forEach(System.out::println);

    }
}
