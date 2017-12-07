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
    
    
    public String encrypt(String pt, Key k) {
        
        if (!(k instanceof MonoAlphabeticKey)) {
            throw new IllegalArgumentException("Vstupom musí byť inštancia MonoalphabeticKey");
        }
       
        MonoAlphabeticKey mk = (MonoAlphabeticKey) k;

        StringBuilder ct = new StringBuilder();
            for (char c : pt.toCharArray()) {
               ct.append(mk.encKey[c - 'a']);
            }
            return ct.toString();
        }


    public String decrypt(String ct, Key k) {
        if (!(k instanceof MonoAlphabeticKey)) {
            throw new IllegalArgumentException("Vstupom musí byť inštancia MonoalphabeticKey");
        }
        MonoAlphabeticKey mk = (MonoAlphabeticKey) k;

        StringBuilder pt = new StringBuilder();
        for (char c : ct.toCharArray()) {
            pt.append(mk.decKey[c - 'a']);
        }
        return pt.toString();
    } 
}
