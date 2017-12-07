/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.cipher;
import cvicenie1.helpers.Permutations;
import static cvicenie1.helpers.Permutations.*;
import cvicenie1.crypto.Key;
import java.util.Random;
/**
 *
 * @author illuSion
 */


public class MonoAlphabeticKey implements Key {                   
    double score;
    Character encKey[];
    Character decKey[];

    public MonoAlphabeticKey(Character[] encPerm) {
        this.encKey = encPerm;
        this.decKey = Permutations.inversePerm(encPerm);
    }

    public Character[] getEncPerm() {
        return encKey;
    }

    public Character[] getDecPerm() {
        return decKey;
    }

    
    public Key randomKey() {
        Character abc[] = new Character[26];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = (char) (i + 'a');
        }
        Permutations.rndPerm(abc);
        return new MonoAlphabeticKey(abc);
    }

    Random rnd = new Random(System.currentTimeMillis());

    
    public Key changeKey() {
        Character[] perm = this.getEncPerm().clone();
        int a = rnd.nextInt(26);
        int b = rnd.nextInt(26);
        // swap
        char tmp = perm[a];
        perm[a] = perm[b];
        perm[b] = tmp;
        return new MonoAlphabeticKey(perm);
    }

   
    public double getScore() {
        return score;
    }

   
    public void setScore(double score) {
        this.score = score;
    }
}
