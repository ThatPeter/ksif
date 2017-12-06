/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.cipher;
import cvicenie1.crypto.Cipher;
import cvicenie1.crypto.Key;
//import java.lang.StringBuilder;
//import cvicenie1.cipher.MonoAlphabeticKey.*;
/**
 *
 * @author illuSion
 */
public class MonoAlphabeticCipher implements Cipher {
    
    public String encrypt(String pt, Key k){
        pt = pt.toLowerCase();
 
        StringBuilder str = new StringBuilder();
        MonoAlphabeticKey key = (MonoAlphabeticKey) k;
        int i = 0;
        for (char c : pt.toCharArray()) {
            str.append(key.encKey[c - 'a']);
        }
        
        return str.toString();
    }
    
    public String decrypt(String ct, Key k){
        StringBuilder str = new StringBuilder();
        MonoAlphabeticKey key = (MonoAlphabeticKey) k;
        
        for (char c : ct.toCharArray())
            str.append(key.decKey[c - 'a']);
        
        return str.toString();
    }
    
}
