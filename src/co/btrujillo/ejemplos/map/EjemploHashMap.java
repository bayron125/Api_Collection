package co.btrujillo.ejemplos.map;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos : " + !persona.isEmpty());

        persona.put("nombre","Bayron");
        persona.put("apellidoPaterno", "Trujillo");
        persona.put("apellidoMaterno", "Rico");
        persona.put("edad", "26");
        persona.put("email", "bayron125@hotmail.com");
        System.out.println("persona" + persona);

        Map<String, String> direccion = new HashMap<>();

        direccion.put("pais","Colombia");
        direccion.put("departamento", "Cundinamarca");
        direccion.put("ciudad", "Bogotá");
        direccion.put("direccion", "cra 1 ae #49c 16 sur");

        persona.put("direccion",direccion);

        Object nombre = persona.get("nombre");
        System.out.println("nombre :" + nombre);

        Object apellido = persona.get("apellidoMaterno");
        System.out.println(apellido);

        System.out.println("=======================");

        System.out.println("eliminado : " + persona.remove("apellidoPaterno"));
        System.out.println(persona);
        //se elimina con el metodo get, enviando por argumento la llave y retorna el valor eliminado
        System.out.println(persona.get("apellidoPaterno"));

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String barrio = direccionPersona.getOrDefault("barrio","Palermo Sur");

        System.out.println("el pais de " + persona.get("nombre")+" es " + pais + " y el barrio " + barrio );

        //enviando la llave y el valor retorna un boolean indicando si se elimino.
        System.out.println("==============================");
        boolean b = persona.remove("apellidoMaterno","Rincon");
        System.out.println("eliminado : " + b);
        System.out.println(persona);

        //containsKey: permite validar si la llave ingresada como argumento existe
        boolean validacion = persona.containsKey("edad");
        System.out.println("la llave edad existe : " + validacion);
        validacion = persona.containsValue("bayron125@hotmail.com");
        System.out.println("el correo existe = " + validacion);

        System.out.println("Imprimiendo valores (Collection)");
        Collection<Object> valores = persona.values();

        for(Object v: valores ){
            System.out.println(v);
        }
        System.out.println("===========Set===========");
        //keySet: metodo para guardar valores en variable tipo Set
        Set<String> llaves = persona.keySet();

        System.out.println(llaves);
        System.out.println("===========entrySet===========");
        for(Map.Entry<String, Object> par : persona.entrySet()) {

            Object valor = par.getValue();
            if (par.getValue() instanceof Map) {
                String nom = (String) persona.get("nombre");
                System.out.println("el pais de  " + nom + ": " + direccion.get("pais"));
                System.out.println("la ciudad de " + nom + ": x" + direccion.get("ciudad"));
                System.out.println("el departamento de " + nom + ": " + direccion.get("departamento"));
                System.out.println("la direccion de " + nom + ": " + direccion.get("direccion"));
            } else {
                System.out.println(par.getKey() + " -> " + valor);
            }
        }
        System.out.println("==========keySet==========");

        for( String llave: persona.keySet()) {
            Object valor = persona.get(llave);
            String nom = (String)persona.get("nombre");
            if (valor instanceof Map) {
                System.out.println("el pais de  " + nom + ": " + direccion.get("pais"));
                System.out.println("la ciudad de " + nom + ": " +direccion.get("ciudad"));
                System.out.println("el departamento de " + nom + ": " +direccion.get("departamento"));
                System.out.println("la direccion de " + nom + ": " +direccion.get("direccion"));


            } else {
                System.out.println(llave + " ==> " + valor);
            }
        }
        System.out.println("=======forEach===========");

        persona.forEach((llave,valor)->{
            System.out.println(llave + " -> " + valor);
        });

        System.out.println("============================");

        System.out.println("Total : " + persona.size());
        System.out.println("Contiene elementos : " + !persona.isEmpty());

        persona.replace("edad", "30");
        persona.replace("nombre", "Bayron","Steve" );

        System.out.println(persona);


    }
}
