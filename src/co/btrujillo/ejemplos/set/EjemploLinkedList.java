package co.btrujillo.ejemplos.set;

import co.btrujillo.ejemplos.modelo.Alumno;

import java.util.LinkedList;
import java.util.List;


public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();


        System.out.println("esta vacia = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Daniel", 1));
        enlazada.add(new Alumno("Miguel", 7));
        enlazada.add(new Alumno("Juan", 6));

        enlazada.add(2,new Alumno("Pedro", 9));
        enlazada.add(new Alumno("Brandon", 3));

        enlazada.set(4, new Alumno("Brandon", 2));
        enlazada.addFirst(new Alumno("Angela", 1));
        enlazada.addLast(new Alumno("Afrodita", 11));
        System.out.println(enlazada + " size = " +enlazada.size() );

        enlazada.remove(new Alumno("Miguel", 7));

        System.out.println(enlazada + " size = " +enlazada.size() );
        System.out.println("esta vacia = " + enlazada.isEmpty());

        System.out.println("Primer dato: " + enlazada.getFirst());
        System.out.println("Ultimo dato: " + enlazada.getLast());
        System.out.println("Por indice: " + enlazada.get(2));
    }
}
