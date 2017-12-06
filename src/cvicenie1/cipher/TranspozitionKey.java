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
public class TranspozitionKey implements Key {
    public Integer[] encPerm;
    public Integer[] decPerm;
    public int blockSize;
    
    public TranspozitionKey(Integer[] perm, int blockSize)
    {
        encPerm = perm;
        decPerm = Permutations.inversePerm(perm);
        this.blockSize = blockSize;
    }
    
    public void printKey()
    {
        for (Integer i : encPerm)
            System.out.print(i + ", ");
        System.out.println();
        for (Integer i : decPerm)
            System.out.print(i + ", ");
        System.out.println();
    }
}
