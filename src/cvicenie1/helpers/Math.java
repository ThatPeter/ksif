/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;
/**
 *
 * @author illuSion
 */
public class Math {
    
    public static boolean isPrime(int input){
        int i;
        for (i = 2; i <= java.lang.Math.sqrt(input); i++){
            if(input % i == 0) return false;
        }
        
        return true;
    }
    
    public static int factorial(int toFactor) {
        if (toFactor <= 1){
            return toFactor;
        }
        return toFactor * factorial(toFactor - 1);
    }
    
}
