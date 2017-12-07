/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.cipher;
import cvicenie1.helpers.Permutations;
import static cvicenie1.helpers.Permutations.*;
import java.util.Random;
import cvicenie1.crypto.Key;
/**
 *
 * @author illuSion
 */
public class PolyAlphabeticKey implements Key {
    public char[] password;
    double score;
    private int testedsize = 1;
    
    public PolyAlphabeticKey(char[] password) 
    {
        this.password = password;
    }
    
    public Key randomKey() 
    {
        char[] newpass = new char[password.length];
        Random rand = new Random();
        int rn;
        for (int i = 0; i < newpass.length; i++)
        {
            rn = 'a' + rand.nextInt(26);
            newpass[i] = (char) rn;
        }
        
        return new PolyAlphabeticKey(newpass);
    }
    public Key changeKey()
    {
        Random rand = new Random();
        int rnd1 = rand.nextInt(password.length);
        int rnd2 = 'a' + rand.nextInt(26);
        
        password[rnd1] = (char)rnd2;
        
        return new PolyAlphabeticKey(password);
    }
    
    public double getScore(){
        return score;
    }
    public void setScore(double score){ 
        this.score = score;
    }
}
