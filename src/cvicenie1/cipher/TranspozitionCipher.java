/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.cipher;
import cvicenie1.crypto.Cipher;
import cvicenie1.crypto.Key;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
/**
 *
 * @author illuSion
 */
public class TranspozitionCipher implements Cipher {
    public String encrypt(String pt, Key k){
        TranspozitionKey mk = (TranspozitionKey) k;
        int missing;
        
        int rows = pt.length() / mk.blockSize; // pocet riadkov (dlzka stringu jedneho vstupu v mape
        String input = pt;
        
        if ((pt.length() % mk.blockSize) > 0) {
            missing = mk.blockSize - (pt.length() % mk.blockSize); 
            rows++;
            for (int i = 0; i < missing; i++) {
                input += 'x';
            }
        }
        
        Map<Integer, String> blocks = transformToMap(input, rows, mk.blockSize);    
        Map<Integer, String> newBlocks = applyPermutation(blocks, rows, mk.encPerm);
       
        return convertMapToString(newBlocks, rows);
    }
    
    public String decrypt(String ct, Key k){
        
        TranspozitionKey mk = (TranspozitionKey) k;
        
        int rows = ct.length() / mk.blockSize; // pocet riadkov (dlzka stringu jedneho vstupu v mape
        String input = ct;
        Map<Integer, String> blocks = transformToMap(input, rows, mk.blockSize);
        Map<Integer, String> newBlocks = applyPermutation(blocks, rows, mk.decPerm);
        
 
        return convertMapToString(newBlocks, rows);
    }
    
    Map<Integer, String> transformToMap(String input, int rows, int blockSize)
    {
        Map<Integer, String> blocks = new HashMap<>();// na kazdom vstupe je STLPEC
        int subindex;
        StringBuilder utilStr = new StringBuilder();

        for (Integer i = 0; i < blockSize; i++) {
            
            utilStr.delete(0, utilStr.length()); //vycisti builder
            subindex = (int) i; //indexy na ktorych sa budeme posuvat
            for (int j = 0; j < rows; j++, subindex += blockSize) {
               
                utilStr.append(input.charAt(subindex));
            }
            blocks.put(i, utilStr.toString()); //zapis stlpec do mapy
        }
        
        return blocks;
    }
    
    Map<Integer, String> applyPermutation(Map<Integer, String> blocks, int rows, Integer[] perm)
    {
        Map<Integer, String> newBlocks = new HashMap<>();
        int i = 0;
        for (Map.Entry e : blocks.entrySet()) 
        {
            newBlocks.put((Integer) e.getKey(), blocks.get((Integer)(perm[i] - 1)));
            i++;
        }
        
        return newBlocks;
    }
    
    String convertMapToString(Map<Integer, String> newBlocks, int rows)
    {
        StringBuilder utilStr = new StringBuilder();
        String output = "";
        
        for (int j = 0; j < rows; j++) {
            for(Map.Entry e : newBlocks.entrySet()) {

                output = e.getValue().toString();
                utilStr.append(output.charAt(j));
            }
        }
        
        return utilStr.toString();
    }
}
