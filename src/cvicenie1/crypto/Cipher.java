/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.crypto;

/**
 *
 * @author illuSion
 */
public interface Cipher {
    public String encrypt(String pt, Key k);
    public String decrypt(String ct, Key k);
}
