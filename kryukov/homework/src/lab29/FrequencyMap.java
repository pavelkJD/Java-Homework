package lab29;

import java.util.HashMap;
import java.util.Map;

/*
Имеется текст. Следует составить для него частотный словарь.
 */

public class FrequencyMap {
    public static void main(String[] args) {

        String str = "I am studying maps studying maps I maps";

        String words[] = str.split(" +");

        Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                Integer frequency = frequencyMap.get(word);
                frequency++;
            } else {
                frequencyMap.put(word, 1);
            }
        }
        System.out.println(frequencyMap);
    }
}
