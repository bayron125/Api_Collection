package co.btrujillo.ejemplos.list;

import co.btrujillo.ejemplos.modelo.Alumno;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


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
        enlazada.addFirst(new Alumno("Poseidon", 1));
        enlazada.addLast(new Alumno("Afrodita", 11));
        System.out.println(enlazada + " size = " +enlazada.size() );

        enlazada.remove(new Alumno("Miguel", 7));

        System.out.println(enlazada + " size = " +enlazada.size() );
        System.out.println("esta vacia = " + enlazada.isEmpty());

        System.out.println("Primer dato: " + enlazada.getFirst());
        System.out.println("Ultimo dato: " + enlazada.getLast());
        System.out.println("Por indice 2: " + enlazada.get(2));

        Alumno primero =enlazada.removeFirst();
        enlazada.removeLast();

        System.out.println(enlazada);
        System.out.println("Primero eliminado: " + primero);

        Alumno a = new Alumno("Pascual",8);
        enlazada.addLast(a);
        System.out.println("indice Lucas: " + enlazada.indexOf(a));
        enlazada.remove(1);
        System.out.println("indice Lucas: " + enlazada.indexOf(a));
        System.out.println(enlazada);

        enlazada.set(enlazada.indexOf(a)-1, new Alumno("Valentino",5));
        System.out.println(enlazada);

        ListIterator<Alumno> li= enlazada.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }


    }
}
