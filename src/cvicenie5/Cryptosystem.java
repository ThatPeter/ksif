/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie5;
import cvicenie1.helpers.Language;
import cvicenie1.helpers.Text;
import cvicenie1.helpers.TextStatistics;
import java.util.HashMap;
import java.util.Map;
import java.lang.Math.*;
/**
 *
 * @author illuSion
 */
public class Cryptosystem {
    
    
    public enum Type {
        monoalphabetic,
        transposition,
        polyalphabetic,
        unknown
    }

    public static Cryptosystem.Type guess(String txt) {
        Cryptosystem.Type retVal;
        Map<String, Double> ngrams = TextStatistics.readNgram(txt, 1, true);
        if (Language.guessLanguage(txt) == Language.LanguageEnum.Unknown) // cize IC najblizsie k nahodnemu textu
        {
            retVal = Type.polyalphabetic;
        } else {
            double[] ref = {0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228, 0.02015, 0.06094, 0.06966, 0.00153, 0.00772, 0.04025, 0.02406, 0.06749, 0.07507, 0.01929, 9.5E-4, 0.05987, 0.063269, 0.0905599, 0.02758, 0.00978, 0.0236, 0.0015, 0.01974, 7.4E-4};

            double distance = 0;
            for (Map.Entry<String, Double> entrySet : ngrams.entrySet()) {
                int idx = entrySet.getKey().charAt(0) - 'a';
                Double value = entrySet.getValue();
                distance += Math.abs(value - ref[idx]);
            }

            if (distance < 0.5) {
                retVal = Type.transposition;
            } else {
                retVal = Type.monoalphabetic;
            }
        }
        return retVal;
    }
}
