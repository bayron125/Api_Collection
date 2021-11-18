package co.btrujillo.ejemplos.map;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        System.out.println("Contiene elementos : " + !persona.isEmpty());

        persona.put("nombre","Bayron");
        persona.put("apellidoPaterno", "Trujillo");
        persona.put("apellidoMaterno", "Rico");
        persona.put("edad", "26");
        persona.put("email", "bayron125@hotmail.com");

        System.out.println("persona" + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre :" + nombre);

        String apellido = persona.get("apellidoMaterno");
        System.out.println(apellido);

        System.out.println("=======================");

        System.out.println("eliminado : " + persona.remove("apellidoPaterno"));
        System.out.println(persona);
        //se elimina con el metodo get, enviando por argumento la llave y retorna el valor eliminado
        System.out.println(persona.get("apellidoPaterno"));
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
        Collection<String> valores = persona.values();

        for(String v: valores ){
            System.out.println(v);
        }
        System.out.println("===========Set===========");
        //keySet: metodo para guardar valores en variable tipo Set
        Set<String> llaves = persona.keySet();

        System.out.println(llaves);
        System.out.println("===========entrySet===========");
        for(Map.Entry<String, String> par : persona.entrySet()){
            System.out.println(par.getKey() + " -> " + par.getValue());
        }
        System.out.println("==========keySet==========");
        for( String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " ==> " + valor);
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
