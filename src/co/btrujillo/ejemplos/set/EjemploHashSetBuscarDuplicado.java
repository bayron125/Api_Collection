package co.btrujillo.ejemplos.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String [] peces = {
                "Laguado", "atun", "tiburon", "mantarraya", "atun", "sardinas"
        };

        Collection <String> unicos = new HashSet<>();

        for (String pez: peces){
            if(!unicos.add(pez)){
                System.out.println("Peces repetidos: " + pez);
            }
        }

        System.out.println(unicos.size() + " peces sin repetir: " + unicos);
    }

}

