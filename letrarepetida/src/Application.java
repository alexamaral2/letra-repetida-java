import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args){
        String palavra = "Abacate".toLowerCase();
        Map<String, Integer> letrasRepetidas = new HashMap<>();

        for (int i = 0; i < palavra.length(); i++){
            String letra = String.valueOf(palavra.charAt(i));
            if (letrasRepetidas.containsKey(letra)){
                letrasRepetidas.put(letra, letrasRepetidas.get(letra) + 1);
            } else {
                letrasRepetidas.put(String.valueOf(palavra.charAt(i)), 1);
            }
        }
        System.out.println(letrasRepetidas);
    }
}
