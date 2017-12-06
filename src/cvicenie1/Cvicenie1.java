package cvicenie1;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import cvicenie1.helpers.*;
import java.io.File;
import java.util.Set;
import java.util.HashSet;
import cvicenie1.cipher.*;
import cvicenie1.crypto.*;
import static cvicenie1.helpers.Permutations.*;
import static cvicenie1.helpers.Math.*;
import static cvicenie1.helpers.Text.convertToTSA;
import cvicenie1.cipher.MonoAlphabeticKey.*;
import cvicenie1.cipher.MonoAlphabeticCipher.*;
import cvicenie1.cipher.TranspozitionKey.*;
import cvicenie1.cipher.TranspozitionCipher.*;
import cvicenie1.cipher.PolyAlphabeticKey.*;
import cvicenie1.cipher.PolyAlphabeticCipher.*;
import cvicenie1.helpers.TextStatistics.*;
import cvicenie1.helpers.Language.*;

import java.util.Map;
import java.util.HashMap;

public class Cvicenie1 {

    public static void main(String[] args) {
        /*
        int i;
        
        for(i = 1; i < 13; i++){
            if (i%2 == 1) {
                System.out.println(i);
            }
        }
        int p[] = new int[12];
        
        for(i = 0; i < p.length; i++){
            p[i] = i+1;
        }
        
        for(int pp: p){
            System.out.println(pp);
        }
        
        Random rng = new Random();
        
        do{
            i = rng.nextInt(100);
            System.out.println(i);
        } while(!isPrime(i));
        
        ArrayList<Double> z = new ArrayList<>();
        
        for(i = 0; i < 100; i++){
            z.add(rng.nextDouble());
        }
        
        Collections.sort(z);
        
        for(Double a : z){
            System.out.println(a);
        }
        
        Collections.reverse(z);
        
        for(Double a : z){
            System.out.println(a);
        }
        
        ArrayList<String> mena = new ArrayList(Arrays.asList("Peter, Michal, Petard, Medard"));
    
        String menaPole[] = new String[mena.size()];
        mena.toArray(menaPole);
        System.out.println(Arrays.toString(menaPole));   
        
        File input = Text.pickFromFileChooser();
        String text = Text.readText(input);
       
        Set<String> slovnik = new HashSet<String>();
        
        for (String s : text.split("\n")) {
            slovnik.add(s.toLowerCase());
        }
   
        Set<String> toRemove = new HashSet<String>();
        
        for(String s : slovnik){
            if (s.startsWith("m")) {
                toRemove.add(s);
            }
        }
    
        slovnik.removeAll(toRemove);
        
        for(String s: slovnik){
            System.out.println(s);
        }

        System.out.println();
        
        Key k = new CaesarKey();
        Cipher c = new CaesarCipher();
        String PlainText = "abcdefghijklmnopqrstuvxyz";
        String CipherText = c.encrypt(PlainText, k);
        System.out.println(CipherText);
        PlainText = c.decrypt(CipherText, k);
        System.out.println(PlainText);
        */  /*
        int i;
        HashSet<Integer> M = new HashSet<>(); 
        Random rand = new Random();
        
        for (i = 0; i < 10; i++){
            M.add(rand.nextInt(25) + 1);
        }
        for (int in : M){
            System.out.println(in);
        }
        ArrayList<Integer> Z = new ArrayList<>();
        Z.addAll(M);
        System.out.println();
        
        for (int in:Z){
            System.out.println(in);
        }
        
        for (i = 0; i < 5; i++){
            Collections.shuffle(Z);
        }
        
        System.out.println();
        
        for (int in:Z){
            System.out.println(in);
        }
        
        Integer P[] = M.toArray(new Integer[M.size()]);
       
        for (i = 0; i < 5; i++){
            rndPerm(P);
        }
        
        System.out.println();
        
        for (int in:P){
            System.out.println(in);
        }
        Integer intperm[] = {2,5,3,1,10,8,7,9,4,6};
        
        inversePerm(intperm);
        
        System.out.println();
        for (int in:intperm){
            System.out.println(in);
        }
        
        Character charperm[] = {'b', 'c', 'g', 'f', 'd', 'a', 'e', 'h', 'j', 'i'};
        
        inversePerm(charperm);
        
        System.out.println();
        for (char in:charperm){
            System.out.println(in);
        }*/
        /*                      1 2 3 4 5 6 7 8 9 10*/
       // Integer permutacia[] = {1};
       // System.out.println(permOrder(permutacia));
        
      //  ArrayList lel = permCycles(permutacia);
     //   int lel = radPerm(permutacia);
     //   System.out.println(lel);
       // for (Object s: lel){
       //    System.out.println(s);
       // }
    /*   Integer[] idk = createLexOrderPermutation(62,permutacia);
        for(Object k:idk){

           System.out.println(k);
        }*/
        // char znaky[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //String str = "Neviem. co je, toto xD.";
        //str = Text.convertToTSA(str, false);
        //System.out.println(str);
      /*  Character[] perm = {'a','b','c','d','e','f','g','h','i','j','k','l','m'
                            ,'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Character[] perm2 = {'z','y','a','w','v','u','t','f','p','q','r','o','n'
                            ,'m','l','k','j','q','h','g','i','e','d','c','b','x'};

        MonoAlphabeticKey key = new MonoAlphabeticKey(perm2);
        key.printEncKey();
        key.printDecKey();

        MonoAlphabeticCipher c = new MonoAlphabeticCipher();
        String ct = c.encrypt("mynameiswhomynameiswhyslimshady", key);
        String ot = c.decrypt(ct, key);

        System.out.println(ct);
        System.out.println(ot);*/
     /*   Integer[] key = {4,2,3,5,1,6};
        int blocksize = key.length;
        TranspozitionKey k = new TranspozitionKey(key, blocksize);
        k.printKey();
        TranspozitionCipher c = new TranspozitionCipher();
        System.out.println(c.encrypt("golotusmnfyibsmsbmbm", k));
        System.out.println(c.decrypt(c.encrypt("golotusmnfyibsmsbmbm", k), k));*/
       /*
        char[] pwd = {'h','e','s','l','o'};
        PolyAlphabeticKey key = new PolyAlphabeticKey(pwd);
        

        PolyAlphabeticCipher c = new PolyAlphabeticCipher();
        String ct = c.encrypt("testujemesifrovanie", key);
        System.out.println(ct);
        String ot = c.decrypt(ct, key);
        System.out.println(ot);*/
       /* Map<String, Double> ngram = TextStatistics.readNgram("ahojjjjjjj", 3, true);
        for(Map.Entry e: ngram.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }*/
       String OT_Svk = "Ďalší významný rozvoj v kryptografii nastal začiatkom 20. "
               + "storočia, keď došlo k vynájdeniu a zavedeniu telegrafu. V roku "
               + "1917 bol vynájdený prvý bezpečný kryptosystém Vernam, ktorý bol"
               + " postavený na prúdovej šifre. Obdobie do konca 50-tych rokov je "
               + "charakteristické hlavne používaním zložitých mechanických a "
               + "elektromechanických šifrovacích strojov. Veľký pokrok v kryptografii "
               + "nastal hlavne počas I. a II. svetovej vojny, keď sa šifrovanie "
               + "stalo veľmi dôležitou disciplínou. Medzi najvýznamnejšie "
               + "šifrovacie prístroje tej doby patrila Enigma, ktorá bola používaná"
               + " Nemcami počas druhej svetovej vojny a dlhý čas predstavovala skutočne"
               + " „tvrdý oriešok“. Nemci verili, že táto šifra je bez kľúča neprelomiteľná."
               + " Šifru však prelomili poľskí matematici Marian Rejewski, Henrik Zygalski a "
               + "britský matematik Alan Turing. Kód bol prelomený predovšetkým vďaka práci poľských "
               + "matematikov Mariana Rejewskiho a Henrika Zygalskiho. V roku 1932 Rejewski rozkódoval "
               + "jeden z jednoduchších typov Enigmy. Bez jeho práce, by aj Alanovi "
               + "Turingovi, trvalo rozkodovanie enigmy „priveľmi“ dlho a stalo by to "
               + "mnoho spojeneckých životov. Novší typ Enigmy (tzv. ponorková Enigma)"
               + " bola rozkódovaná aj vďaka šťastnej náhode, keď bola zajatá nemecká ponorka,"
               + " ktorá mala na svojej palube jeden prístroj Enigma. Skôr, ako ju Nemci stihli "
               + "zničiť sa dostala do rúk Angličanom a tí konečne rozlúštili "
               + "„záhadu neprelomiteľného kódu“ šifrovacieho stroja Enigma.";
       
        OT_Svk = Text.convertToTSA(OT_Svk, false);
        //System.out.println(OT_Svk);
      /*  Map<String, Double> ngram = TextStatistics.readNgram(OT_Svk, 1, false);
        Double[] freq = new Double[ngram.size()];
        int i = 0;
        
        for(Map.Entry e: ngram.entrySet())
        {
            freq[i] =(Double) e.getValue();
            //System.out.println(e.getKey() + " " + e.getValue());
            i++;
        }*/
        
        //System.out.println(TextStatistics.indexOfCoincidence(freq,OT_Svk.length()));
        //System.out.println(Language.guessLanguage(OT_Svk));
    }

}

