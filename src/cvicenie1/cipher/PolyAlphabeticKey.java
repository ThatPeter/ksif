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
public class PolyAlphabeticKey implements Key {
    public char[] password;
    
    public PolyAlphabeticKey(char[] password) 
    {
        this.password = password;
    }
}
