package co.btrujillo.ejemplos.map;



import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));

        persona.put("nombre","Bayron");
        persona.put("apellidoPaterno", "Trujillo");
        persona.put("apellidoMaterno", "Rico");
        persona.put("edad", "26");
        persona.put("email", "bayron125@hotmail.com");

        Map<String, String> direccion = new TreeMap<>();

        direccion.put("pais","Colombia");
        direccion.put("departamento", "Cundinamarca");
        direccion.put("ciudad", "Bogotá");
        direccion.put("direccion", "cra 1 ae #49c 16 sur");

        persona.put("direccion",direccion);
        System.out.println(persona);



    }
}
