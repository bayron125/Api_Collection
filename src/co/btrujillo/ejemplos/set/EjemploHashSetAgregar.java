package co.btrujillo.ejemplos.set;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Collection<String> numeros = new HashSet<>();

        numeros.add("uno");
        numeros.add("dos");
        numeros.add("tres");
        numeros.add("cuatro");
        numeros.add("cinco");

        System.out.println(numeros);

        boolean repetir = numeros.add("dos");

        System.out.println("Permite valores duplicados: " + repetir);

        System.out.println(numeros);
    }
}
