import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {   
        Map<String, Integer> notas = new HashMap<>();
        notas.put("marcus",10);
        notas.put("diego",8); 

        var nota = notas.get("marcus");
        System.out.println(nota);

        for(Map.Entry<String,Integer> entry: notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("A chave é "+key+"como o valor de "+value);
        }
    }
}
