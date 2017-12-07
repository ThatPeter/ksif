/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie5;
import cvicenie1.crypto.Cipher;
import cvicenie1.crypto.Key;
import cvicenie1.helpers.Text;
/**
 *
 * @author illuSion
 */

public class BigramFitness {
    private double ref[][];
    public BigramFitness() {
        ref = (double[][]) Text.readFromFile("_bigrams");
    }

    public double evaluate(Key k, Cipher c, String ct) {
        String decrypted = c.decrypt(ct, k);
        return evaluate(decrypted);
    }

    public double evaluate(String decrypted) {

        double m[][] = new double[26][26];
        for (int i = 0; i < decrypted.length() - 1; i++) {
            char a = decrypted.charAt(i);
            char b = decrypted.charAt(i + 1);
            m[a - 'a'][b - 'a']++;
        }
        double sum = 0;
        double div = decrypted.length() - 1;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                double nv = ref[i][j] - (m[i][j] / div);
                sum += Math.abs(nv);
            }
        }
        return sum;
    }
}

