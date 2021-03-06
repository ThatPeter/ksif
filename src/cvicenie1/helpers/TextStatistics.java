/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author illuSion
 */
public class TextStatistics {
    public static Map<String, Double> readNgram(String input, int nGramSize, boolean relativeFreq) {
        Map<String, Double> map= new HashMap<>();
        String nGram[] = new String[input.length() - (nGramSize - 1)];
        System.out.println(input.substring(0, nGramSize-1));
        for (int i = 0; i <= input.length() - nGramSize; i++) {
            nGram[i] = input.substring(i, nGramSize - 1);
            map.put(nGram[i], 0.0);
        }
        
        for (int i = 0; i < nGram.length; i++) {
            map.put(nGram[i], map.get(nGram[i]) + 1);
        }
        
        if(relativeFreq) {
            double count = input.length() - (nGramSize - 1);
            for(int i = 0; i < nGram.length; i++) {
                map.put(nGram[i], map.get(nGram[i]) / count);
            }
        }
        return map;
    }
}
