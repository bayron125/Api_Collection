package co.btrujillo.ejemplos.set;

import co.btrujillo.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new TreeSet<>(Comparator.comparing(Alumno::getNombre));

        alumnos.add(new Alumno("Daniel", 1));
        alumnos.add(new Alumno("Miguel", 7));
        alumnos.add(new Alumno("Juan", 6));
        alumnos.add(new Alumno("Pedro", 9));
        alumnos.add(new Alumno("Brandon", 3));
        alumnos.add(new Alumno("Brandon", 3));

        //Formas de iterar un TreeSet
        System.out.println("Iteracion e impresion con metodo toString");
        System.out.println(alumnos);

        System.out.println("Iteracion con foreach");
        for(Alumno alumno : alumnos){
            System.out.println(alumno);
        }

        System.out.println("Iterando con 'Iterator' y 'While'");
        Iterator<Alumno> iterator = alumnos.iterator();

        while(iterator.hasNext()){
            Alumno alumno = iterator.next();

            System.out.println(alumno.toString());
        }

        System.out.println("Iterando usando Stream con foreach");

        alumnos.forEach(a-> System.out.println(a));

    }
}
