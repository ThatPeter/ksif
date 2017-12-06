/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.cipher;
import cvicenie1.helpers.Permutations;
import static cvicenie1.helpers.Permutations.*;
import cvicenie1.crypto.Key;
/**
 *
 * @author illuSion
 */


public class MonoAlphabeticKey implements Key {                   
    public Character[] encKey;
    public Character[] decKey;
    
    public MonoAlphabeticKey(Character[] perm)
    {
        encKey = perm;
        decKey = Permutations.inversePerm(perm);
    }
    
    public Character[] getEncKey()
    {
        return encKey;
    }
    
    public Character[] getDecKey()
    {
        return decKey;
    }
  
    
    public void printEncKey()
    {
        for (Character i : encKey)
            System.out.print(i + ", ");
        System.out.println();
    }
    
    public void printDecKey()
    {
        for (Character i : decKey)
            System.out.print(i + ", ");
        System.out.println();
    }
}
