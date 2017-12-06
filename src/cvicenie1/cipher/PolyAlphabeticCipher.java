/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.cipher;
import cvicenie1.crypto.Cipher;
import cvicenie1.crypto.Key;
/**
 *
 * @author illuSion
 */
public class PolyAlphabeticCipher implements Cipher {
    public String encrypt(String pt, Key k){
        
        PolyAlphabeticKey mk = (PolyAlphabeticKey) k;
        char[] input = pt.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < input.length; i++) { 
            input[i] = (char)('a' + (((input[i] - 'a') + (mk.password[i % mk.password.length] - 'a')) % ((int)('z' - 'a') + 1)));
            sb.append(input[i]);
        }
     
        return sb.toString();
    }
    
    public String decrypt(String ct, Key k){
        PolyAlphabeticKey mk = (PolyAlphabeticKey) k;
        char[] input = ct.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        int add;
        
        for (int i = 0; i < input.length; i++) { // z + e == 25 + 4 % y ==3 

            if ((input[i] - mk.password[i % mk.password.length]) >= 0)
                add = (input[i] - 'a') - (mk.password[i % mk.password.length] - 'a');
            else
                add = 26 - (mk.password[i % mk.password.length] - 'a' ) + (input[i] - 'a');
            input[i] = (char) ('a' + add);
            
            sb.append(input[i]);
        }
     
        return sb.toString();
    }
}
