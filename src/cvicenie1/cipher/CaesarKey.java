/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.cipher;
import cvicenie1.crypto.Key;
/**
 *
 * @author illuSion
 */
public class CaesarKey implements Key{
    private int offset = 3;
    private int range = 26;
    
    public char key(char input){
        return (char) (input + (input - 'a' + 3 % range));
    }
    
    public void setOffset(int offset){
        this.offset = offset;
    }
    
    public void setRange(int range){
        this.range = range;
    }
    
    public int getRange(){
        return range;
    }
    
    public int getOffset(){
        return offset;
    }
}
