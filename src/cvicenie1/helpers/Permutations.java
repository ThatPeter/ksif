/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author illuSion
 */
public class Permutations {
    public static void rndPerm(Object input[])
    {
        Random rand = new Random();
        Object temp;
        int randnum;
        
        for (int i = 0; i < input.length; i++){
            randnum = rand.nextInt(input.length);
            temp = input[randnum];
            input[randnum] = input[i];
            input[i] = temp;
        }
    } 
    /*   {2,5,3,1,10,8,7,9,4,6};  */
    public static Integer[] inversePerm(Integer input[])
    {
        Integer tmp[] = input.clone();
        Integer output[] = input.clone();
        
        for(int i = 0; i < input.length; i++){
            output[tmp[i] - 1] = i + 1;   
        }
        
        return output;
    }
  
    public static Character[] inversePerm(Character input[])
    {
        Character tmp[] = input.clone();
        Character output[] = input.clone();
        
        for(int i = 0; i < input.length; i++){
            output[(int)(tmp[i] - 'a')] = (char)('a' + i);
        }
        
        return output;
    }
    
    /*Vytvorte statickú funkciu allPerm(Object input[]) v triede Permutations, ktorá vygeneruje všetky permutácie danej množiny.
Vstupom nech je pole typu Object, výstupom nech je zoznam List (referencovaný priamo pomocou rozhrania List).
Hint:
Postupne vymienajte všetky dvojice v P s využitím rekurzie.
Najprv zafixujete pozíciu a následne vykonajte všetky výmeny prvku na zafixovanej pozícii s prvkamy napravo od pozície.
Nové premenné môžete vytvoriť pomocou funkcie .clone() triedy Object. Treba kopírovať množinu P pri zmene!
Funkciu otestujte na množine {1,2,3,4,5} a na množine {‘a’,’b’,’c’,’d’}.
Napr.:
P = {1,2,3}.
Najprv zafixujem prvok na 1. pozícii a vyskúšam vsetky jeho výmeny {1,2,3} => {{2,1,3} a {3,2,1}}.
S pridaním pôvodnej množiny {1,2,3} => {{1,2,3}, {2,1,3}, {3,2,1}} získavame všetky možnosti prvkov na 1. pozícii.
Pre tieto množiny zafixujem prvok na 2. pozícii a vyskúšam všetky jeho výmeny, ktoré som ešte nevykonal {1,2,3}=>{1,3,2}; {2,1,3} => {2,3,1} a {3,2,1}=>{3,1,2}.
Čiže pri zafixovaní 2. pozície dostávam {{1,2,3},{1,3,2}, {2,1,3}, {2,3,1}, {3,1,2},{3,2,1}}.
Keď sa dostanem na poslednú pozíciu, výsledok môžem uložiť.*/
    
    public static ArrayList allPerm(Object input[]) {
        ArrayList<Object[]> retVal = new ArrayList(Math.factorial(input.length));
        allPerm(0, input, retVal);
        return retVal;
    }
 
    public static void allPerm(int fixed, Object input[], ArrayList output) {
        Object in[] = input.clone();
        if (fixed == input.length) {
            output.add(input);
        } else {
            for (int i = fixed; i < input.length; i++) {
                // swap
                Object tmp = in[i];
                in[i] = in[fixed];
                in[fixed] = tmp;
                 // recursion
                allPerm(fixed + 1, in, output);
            }
        }
    }
    /*
        USPORIADNAIE 1 2 3 4 5
        PERMUTACIA   3 4 1 5 2
        n = perm.length
        ? * 4! + ? * 3! + ? * 2! + ? * 1! + 1      2*24+2*6+1+1=48+12+2=62
        (3-1) * 4!  USP 1 2 4 5
        (3-1) * 3!  USP 1 2 5
        (1-1) * 2!  USP 2 5
        (2-1) * 1!  USP 2
            + 1
    */
    public static int permOrder(Object input[]) {
        ArrayList tmp = new ArrayList<>(Arrays.asList(input));
        Collections.sort(tmp);
        
        int ti[] = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int toRemove = tmp.indexOf(input[i]);
            ti[i] = toRemove;
            tmp.remove(toRemove); 
        }

        int order = 0;
        for (int i = 0, k = ti.length - 1; i < ti.length - 1; i++, k--) {
            order += ti[i] * Math.factorial(k);
        }
        order++;
        
        return order;
    }  
    
    public static ArrayList permCycles(Object input[]) {
        ArrayList cycles = new ArrayList();
        
        if (input.length == 0) { return cycles; }
        
        ArrayList tmpList = new ArrayList<>(Arrays.asList(input));
        ArrayList workList = new ArrayList<>(Arrays.asList(input));
        
        while(!tmpList.isEmpty()){
            String toAdd = "";
            
            Integer begin = (Integer) tmpList.get(0); 
            ArrayList toRemove = new ArrayList(); 
            Integer end = begin;
          
            do{
                toAdd += end + ",";
                toRemove.add(end);
                end = (Integer) workList.get(new Integer(end - 1));
            } while (begin != end);
            
            if(tmpList.size() > 1) {
                toAdd = toAdd.substring(0, toAdd.length()-1);
                toAdd = toAdd.charAt(toAdd.length() - 1) + ","+ toAdd;
                toAdd = toAdd.substring(0, toAdd.length()-2);           
            }
            
            cycles.add(toAdd);
            tmpList.removeAll(toRemove);
        }
        return cycles;
    }
    
 

    
    private static int gcd(int a, int b)
    {
        while (b > 0)
        {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input)
    {
        int result = input[0];
        for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
        return result;
    }
    
    private static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input)
    {
        int result = input[0];
        for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }
    
    public static int radPerm(Object input[]){
        
        if(input.length == 0) {
            return -1;
        }
        
        ArrayList counts = new ArrayList<>();
        int counter;
        ArrayList tmpList = new ArrayList<>(Arrays.asList(input));
        ArrayList workList = new ArrayList<>(Arrays.asList(input));
        
        while(!tmpList.isEmpty()){
            counter = 0;
            Integer begin = (Integer) tmpList.get(0); 
            ArrayList toRemove = new ArrayList(); 
            Integer end = begin;
          
            do{
                counter++;
                toRemove.add(end);
                end = (Integer) workList.get(new Integer(end - 1));
            } while (begin != end);
            
            counts.add(counter);
            
            tmpList.removeAll(toRemove);
        }
        
        int convert[] = new int[counts.size()];
        
        for(int i = 0; i < convert.length; i++){
            convert[i] = (int) counts.get(i);
        }
        
        
        return lcm(convert);
    }
    /*Domáca úloha 3: Vytvorte statickú funkciu v triede Permutations, ktorá vráti permutáciu P na množine M s poradovým číslom C pri lexikografickom usporiadaní.*/
        /*
        USPORIADNAIE 1 2 3 4 5
        PERMUTACIA   3 4 1 5 2
        n = perm.length
        ? * 4! + ? * 3! + ? * 2! + ? * 1! + 1      2*24+2*6+1+1=48+12+2=62
        (3-1) * 4!  USP 1 2 4 5
        (3-1) * 3!  USP 1 2 5
        (1-1) * 2!  USP 2 5
        (2-1) * 1!  USP 2
            + 1
    */
    public static Integer[] createLexOrderPermutation(int suma, Object[] mnozina) {
        Integer[] permutation= new Integer[mnozina.length];
        
        if(mnozina.length < 1) { return permutation; }
        
        ArrayList tmpList = new ArrayList<>(Arrays.asList(mnozina));
        
        int n = mnozina.length;
        int poradie;
        int i = 0;
        
        suma--;
        
        while(n > 1) {
            poradie = suma / Math.factorial(n - 1);
            permutation[i] = (Integer)tmpList.get(poradie); 
            tmpList.remove(poradie);
        
            suma -= poradie * Math.factorial(n - 1);
            n--;
            i++;
        }
        
        permutation[permutation.length - 1] = (Integer) tmpList.get(0);
        tmpList.remove(0);
        
        return permutation;
    }
}
