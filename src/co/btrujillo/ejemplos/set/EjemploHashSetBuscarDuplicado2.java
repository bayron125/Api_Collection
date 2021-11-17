package co.btrujillo.ejemplos.set;

import java.util.Collection;
import java.util.HashSet;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String [] peces = {
                "Lenguado", "atun", "tiburon", "mantarraya", "atun", "sardinas", "atun", "mojarra", "tiburon"
        };

        Collection <String> unicos = new HashSet<>();
        Collection <String> repetidos = new HashSet<>();

        for (String pez: peces){
            if(!unicos.add(pez)){
               repetidos.add(pez);
            }
        }
        unicos.removeAll(repetidos);

        System.out.println(unicos.size() + " peces sin repetir: " + unicos);
        System.out.println(repetidos.size() + " peces repetidos: " + repetidos);
    }

}

