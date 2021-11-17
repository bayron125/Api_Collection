package co.btrujillo.ejemplos.set;

import co.btrujillo.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();

        alumnos.add(new Alumno("Daniel", 1));
        alumnos.add(new Alumno("Miguel", 7));
        alumnos.add(new Alumno("Juan", 6));
        alumnos.add(new Alumno("Pedro", 9));
        alumnos.add(new Alumno("Brandon", 3));
        alumnos.add(new Alumno("Brandon", 2));
        alumnos.add(new Alumno("Angela", 1));


        //Formas de iterar HashSet

        //System.out.println(alumnos);

       /* for(Alumno a: alumnos){
            System.out.println(a);
        }*/

        System.out.println("Iterando HashSet con Iterator y while");
        Iterator<Alumno> iterator= alumnos.iterator();
        while(iterator.hasNext()){
            Alumno alumno = iterator.next();
            System.out.println(alumno);
        }

        System.out.println("Iterando utilizando stream foreach");
        alumnos.forEach(System.out::println);

        System.out.println("Iterando usando foreach");
        for (Alumno a: alumnos){
            System.out.println(a);
        }

    }
}
