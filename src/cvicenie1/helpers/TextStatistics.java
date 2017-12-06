/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;
import java.util.Map;
import java.util.HashMap;
import java.lang.Math;
/**
 *
 * @author illuSion
 */
public class TextStatistics {
    public static Map<String, Double> readNgram(String input, int nGramSize, boolean relativeFreq) {
        Map<String, Double> map= new HashMap<>();
        String nGram[] = new String[input.length() - (nGramSize - 1)];
        //System.out.println(input.substring(0, nGramSize-1));
        for (int i = 0; i <= input.length() - nGramSize; i++) {
            //System.out.println(i);
            nGram[i] = input.substring(i, i + nGramSize);
            map.put(nGram[i], 0.0);
        }
      
        //for(String s : nGram) System.out.println(s);
        for (int i = 0; i < nGram.length; i++) {
            map.put(nGram[i], map.get(nGram[i]) + 1);
        }
      
        if(relativeFreq) {
            double count = input.length() - (nGramSize + 1);
           
            for(Map.Entry e: map.entrySet())
            {
                map.put(e.getKey().toString(), map.get(e.getKey().toString()) / count);
            }
        }
        return map;
    }
    public static double indexOfCoincidence(Double[] absoluteFreq, int textLength)
    {
        Double IOC = 0.0;
        for(int i = 0; i < absoluteFreq.length; i++) 
        {
            IOC += (absoluteFreq[i]/textLength) * ((absoluteFreq[i]- 1)/(textLength - 1));
        }
        
        return IOC;
    }
    
    public static double entropy(Double[] p)
    {
       
        double res = 0;
        
        for (double pi : p) {
            res += pi * log2(pi);
        }
        
        return -res;
    }  
    
    public static double log2(double x) {
        return java.lang.Math.log(x) / java.lang.Math.log(2);
    }
}
