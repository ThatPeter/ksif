/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.cipher;
import cvicenie1.cipher.CaesarKey.*;
import cvicenie1.crypto.*;

/**
 *
 * @author illuSion
 */
public class CaesarCipher implements Cipher{
    @Override
    public String encrypt(String pt, Key k){
        
        if (!(k instanceof CaesarKey)) {
            throw new IllegalArgumentException("Vstupom musí byť inštancia CaesarKey");
        }
        
        StringBuilder ct = new StringBuilder();
        CaesarKey ck = new CaesarKey();
        for(char c : pt.toCharArray()){
            int toConvert = (c - 'a');
            
            toConvert += ck.getOffset();
            toConvert %= ck.getRange();
            
            char toInsert = (char)(toConvert + 'a');
            ct.append(toInsert);
        }
        
        return ct.toString();
    }
    @Override
    public String decrypt(String ct, Key k){
           if (!(k instanceof CaesarKey)) {
           throw new IllegalArgumentException("Vstupom musí byť inštancia CaesarKey");
       }
       StringBuilder pt = new StringBuilder();
       CaesarKey ck = (CaesarKey) k;
       for (char c : ct.toCharArray()) {
           int toConvert = (c - 'a');
           
           toConvert -= ck.getOffset();
           toConvert += ck.getRange();
           toConvert %= ck.getRange();
           
           char toInsert = (char) (toConvert + 'a');
           pt.append(toInsert);
       }
       
       return pt.toString();
   }
}

