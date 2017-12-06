package cvicenie1.helpers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Language {

    public enum LanguageEnum {
        English,
        German,
        Slovak,
        Unknown
    }

    public static double ICEnglish = 0.0665;
    public static double ICGerman = 0.076;
    public static double ICSlovak = 0.0603;
    public static double ICRnd = 0.039;

    private static final Map<LanguageEnum, Double> icRef = new HashMap<>();

    static {
        icRef.put(LanguageEnum.English, ICEnglish);
        icRef.put(LanguageEnum.German, ICGerman);
        icRef.put(LanguageEnum.Slovak, ICSlovak);
        icRef.put(LanguageEnum.Unknown, ICRnd);

    }

    public static LanguageEnum guessLanguage(String txt) {
        Collection<Double> values = TextStatistics.readNgram(txt, 1, false).values();
        Double stat[] = new Double[values.size()];
        values.toArray(stat);
        double ic = TextStatistics.indexOfCoincidence(stat, txt.length());

        LanguageEnum bestLang = LanguageEnum.Unknown;
        double minDistance = 1;
        for (Map.Entry<LanguageEnum, Double> entrySet : icRef.entrySet()) {
            Language.LanguageEnum key = entrySet.getKey();
            Double value = entrySet.getValue();
            double dist = java.lang.Math.abs(ic - value);
            if (dist < minDistance) {
                minDistance = dist;
                bestLang = key;
            }
        }
        return bestLang;
    }
}
