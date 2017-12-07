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

import cvicenie5.Cryptosystem;

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
        
        String OT_Eng = "The earliest forms of secret writing required little more than writing implements since most people could not read. More literacy, or literate opponents, required actual cryptography. The main classical cipher types are transposition ciphers, which rearrange the order of letters in a message (e.g., 'hello world' becomes 'ehlol owrdl' in a trivially simple rearrangement scheme), and substitution ciphers, which systematically replace letters or groups of letters with other letters or groups of letters (e.g., 'fly at once' becomes 'gmz bu podf' by replacing each letter with the one following it in the Latin alphabet). Simple versions of either have never offered much confidentiality from enterprising opponents. An early substitution cipher was the Caesar cipher, in which each letter in the plaintext was replaced by a letter some fixed number of positions further down the alphabet. Suetonius reports that Julius Caesar used it with a shift of three to communicate with his generals. Atbash is an example of an early Hebrew cipher. The earliest known use of cryptography is some carved ciphertext on stone in Egypt (ca 1900 BCE), but this may have been done for the amusement of literate observers rather than as a way of concealing information.The Greeks of Classical times are said to have known of ciphers (e.g., the scytale transposition cipher claimed to have been used by the Spartan military).[16] Steganography (i.e., hiding even the existence of a message so as to keep it confidential) was also first developed in ancient times. An early example, from Herodotus, was a message tattooed on a slave's shaved head and concealed under the regrown hair.[10] More modern examples of steganography include the use of invisible ink, microdots, and digital watermarks to conceal information.";
        String OT_Ger = "Da es moderne, computergestützte Verfahren jedem möglich machen, Informationen sicher zu verschlüsseln, besteht seitens der Regierungen ein Bedürfnis, diese Informationen entschlüsseln zu können. Die US-Regierung prüfte im Jahr 1996, ob ein Verfahren gegen den Erfinder von PGP, Phil Zimmermann, wegen illegalen Waffenexports eingeleitet werden könne. Sie stellte das Verfahren jedoch nach öffentlichen Protesten ein.[7] In den USA unterliegt Kryptographie, wie auch in vielen anderen Ländern, einem Exportbeschränkungsgesetz. In den USA regelt der Arms Export Control Act und die International Traffic in Arms Regulations den Export von Kryptographietechniken.Oft gelingt Untersuchungsbehörden die Entschlüsselung eines Beweisstücks nur mit Hilfe des privaten Schlüssels. Es gibt in verschieden Ländern Mitwirkungspflichten bei der Entschlüsselung von Beweismaterial.[8] Teilweise wird dabei auch vom Verdächtigten verlangt den Schlüssel preiszugeben. In Großbritannien wurden Zuwiderhandlungen schon mit langen Haftstrafen geahndet.[9] Nach Ansicht von Kritikern widerspricht dies dem Aussageverweigerungsrecht.In Frankreich gab es von 1990 bis 1996 ein Gesetz, das zum Deponieren dieses Schlüssels bei einer „vertrauenswürdigen Behörde“ verpflichtete. Damit verbunden war ein Verbot anderer Verfahren und Schlüssel. Einem Journalisten, der dies praktizieren wollte, ist es allerdings nicht gelungen, eine dafür zuständige Behörde zu finden. Nach einer Lockerung des Gesetzes 1996 ist die Verwendung bestimmter Kryptographieverfahren genehmigungspflichtig.[10] Auch in Deutschland und in der EU gibt es seit Jahren Debatten über gesetzliche Kontrolle der Kryptographie. Ein Verbot der Kryptographie ist nicht praktikabel, da die Algorithmen bekannt sind und jeder mit den notwendigen Programmierkenntnissen ein entsprechendes Programm selbst schreiben könnte. Web-Anwendungen wie z. B. elektronisches Banking oder Shopping sind ohne Kryptographie nicht denkbar.";
        String OT_Svk = "Ďalší významný rozvoj v kryptografii nastal začiatkom 20. storočia, keď došlo k vynájdeniu a zavedeniu telegrafu. V roku 1917 bol vynájdený prvý bezpečný kryptosystém Vernam, ktorý bol postavený na prúdovej šifre. Obdobie do konca 50-tych rokov je charakteristické hlavne používaním zložitých mechanických a elektromechanických šifrovacích strojov. Veľký pokrok v kryptografii nastal hlavne počas I. a II. svetovej vojny, keď sa šifrovanie stalo veľmi dôležitou disciplínou. Medzi najvýznamnejšie šifrovacie prístroje tej doby patrila Enigma, ktorá bola používaná Nemcami počas druhej svetovej vojny a dlhý čas predstavovala skutočne „tvrdý oriešok“. Nemci verili, že táto šifra je bez kľúča neprelomiteľná. Šifru však prelomili poľskí matematici Marian Rejewski, Henrik Zygalski a britský matematik Alan Turing. Kód bol prelomený predovšetkým vďaka práci poľských matematikov Mariana Rejewskiho a Henrika Zygalskiho. V roku 1932 Rejewski rozkódoval jeden z jednoduchších typov Enigmy. Bez jeho práce, by aj Alanovi Turingovi, trvalo rozkodovanie enigmy „priveľmi“ dlho a stalo by to mnoho spojeneckých životov. Novší typ Enigmy (tzv. ponorková Enigma) bola rozkódovaná aj vďaka šťastnej náhode, keď bola zajatá nemecká ponorka, ktorá mala na svojej palube jeden prístroj Enigma. Skôr, ako ju Nemci stihli zničiť sa dostala do rúk Angličanom a tí konečne rozlúštili „záhadu neprelomiteľného kódu“ šifrovacieho stroja Enigma.";
        String OT_Rnd = randomText(1000);
        
        OT_Svk = Text.convertToTSA(OT_Svk, false);
        OT_Ger = Text.convertToTSA(OT_Ger, false);
        OT_Eng = Text.convertToTSA(OT_Eng, false);
        OT_Rnd = Text.convertToTSA(OT_Rnd, false);
       
        
        Map<String, Double> ngramSvk = TextStatistics.readNgram(OT_Svk, 1, false);
        Map<String, Double> ngramGer = TextStatistics.readNgram(OT_Ger, 1, false);
        Map<String, Double> ngramEng = TextStatistics.readNgram(OT_Eng, 1, false);
        Map<String, Double> ngramRnd = TextStatistics.readNgram(OT_Rnd, 1, false);
        
        
        Double[] valSvk = new Double[ngramSvk.values().size()];        
        ngramSvk.values().toArray(valSvk);
        
        Double[] valGer = new Double[ngramGer.values().size()];        
        ngramGer.values().toArray(valGer);
        
        Double[] valEng = new Double[ngramEng.values().size()];        
        ngramEng.values().toArray(valEng);

        Double[] valRnd = new Double[ngramRnd.values().size()];        
        ngramRnd.values().toArray(valRnd);
        
        double IOCEng = TextStatistics.indexOfCoincidence(valEng, OT_Eng.length());
        double IOCSvk = TextStatistics.indexOfCoincidence(valSvk, OT_Svk.length());
        double IOCGer = TextStatistics.indexOfCoincidence(valGer, OT_Ger.length());
        double IOCRnd = TextStatistics.indexOfCoincidence(valRnd, OT_Rnd.length());
      
        System.out.println("Eng IOC: " + IOCEng);
        System.out.println("Svk IOC: " + IOCSvk);
        System.out.println("Ger IOC: " + IOCGer);
        System.out.println("Rnd IOC: " + IOCRnd);
        
        Map<String, Double> ngramSvkRel = TextStatistics.readNgram(OT_Svk, 1, true);
        Map<String, Double> ngramGerRel = TextStatistics.readNgram(OT_Ger, 1, true);
        Map<String, Double> ngramEngRel = TextStatistics.readNgram(OT_Eng, 1, true);
        Map<String, Double> ngramRndRel = TextStatistics.readNgram(OT_Rnd, 1, true);
        
        
        Double[] valSvkRel = new Double[ngramSvkRel.values().size()];        
        ngramSvkRel.values().toArray(valSvkRel);
        
        Double[] valGerRel = new Double[ngramGerRel.values().size()];        
        ngramGerRel.values().toArray(valGerRel);
        
        Double[] valEngRel = new Double[ngramEngRel.values().size()];        
        ngramEngRel.values().toArray(valEngRel);
        
        Double[] valRndRel = new Double[ngramRndRel.values().size()];        
        ngramRndRel.values().toArray(valRndRel);
        
        double EntropyEng = TextStatistics.entropy(valEngRel);
        double EntropySvk = TextStatistics.entropy(valSvkRel);
        double EntropyGer = TextStatistics.entropy(valGerRel);
        double EntropyRnd = TextStatistics.entropy(valRndRel);
        
        System.out.println("Eng entropy: " + EntropyEng);
        System.out.println("Svk entropy: " + EntropySvk);
        System.out.println("Ger entropy: " + EntropyGer);
        System.out.println("Rnd entropy: " + EntropyRnd);
        
        /*                        KEY DECLARATIONS                           */
        
        Character[] MonoAlphaPerm = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                        'o','p','q','r','s','t','u','v','w','x','y','z'};
        
        rndPerm(MonoAlphaPerm);
        
        char[] PolyAlphaPassword = {'n','e','v','i','e','m','a','h','o','j'};
        
        Integer[] TransPerm = {1,2,3,4,5,6,7,8,9,10};
        rndPerm(TransPerm);
        
        MonoAlphabeticKey MonoAlphaKey = new MonoAlphabeticKey(MonoAlphaPerm);
        PolyAlphabeticKey PolyAlphaKey = new PolyAlphabeticKey(PolyAlphaPassword);
        TranspozitionKey TransKey = new TranspozitionKey(TransPerm, TransPerm.length);
        
        MonoAlphabeticCipher MonoAlphaCipher = new MonoAlphabeticCipher();
        PolyAlphabeticCipher PolyAlphaCipher = new PolyAlphabeticCipher();
        TranspozitionCipher TransCipher = new TranspozitionCipher();
        
      
        /*                        CIPHER DECLARATIONS                         */
        
        String ZT_SvkMono = MonoAlphaCipher.encrypt(OT_Svk, MonoAlphaKey);
        String ZT_SvkPoly = PolyAlphaCipher.encrypt(OT_Svk, PolyAlphaKey);
        String ZT_SvkTrans = TransCipher.encrypt(OT_Svk, TransKey);
        
        String ZT_EngMono = MonoAlphaCipher.encrypt(OT_Eng, MonoAlphaKey);
        String ZT_EngPoly = PolyAlphaCipher.encrypt(OT_Eng, PolyAlphaKey);
        String ZT_EngTrans = TransCipher.encrypt(OT_Eng, TransKey);
        
        String ZT_GerMono = MonoAlphaCipher.encrypt(OT_Ger, MonoAlphaKey);
        String ZT_GerPoly = PolyAlphaCipher.encrypt(OT_Ger, PolyAlphaKey);
        String ZT_GerTrans = TransCipher.encrypt(OT_Ger, TransKey);
        
        String ZT_RndMono = MonoAlphaCipher.encrypt(OT_Rnd, MonoAlphaKey);
        String ZT_RndPoly = PolyAlphaCipher.encrypt(OT_Rnd, PolyAlphaKey);
        String ZT_RndTrans = TransCipher.encrypt(OT_Rnd, TransKey);
        
        
          
        Map<String, Double> ngramZTSvkMono = TextStatistics.readNgram(OT_Svk, 1, false);
        Map<String, Double> ngramZTSvkPoly = TextStatistics.readNgram(OT_Svk, 1, false);
        Map<String, Double> ngramZTSvkTrans = TextStatistics.readNgram(OT_Svk, 1, false);
        
        Map<String, Double> ngramZTEngMono = TextStatistics.readNgram(OT_Eng, 1, false);
        Map<String, Double> ngramZTEngPoly = TextStatistics.readNgram(OT_Eng, 1, false);
        Map<String, Double> ngramZTEngTrans = TextStatistics.readNgram(OT_Eng, 1, false);
        
        Map<String, Double> ngramZTGerMono = TextStatistics.readNgram(OT_Ger, 1, false);
        Map<String, Double> ngramZTGerPoly = TextStatistics.readNgram(OT_Ger, 1, false);
        Map<String, Double> ngramZTGerTrans = TextStatistics.readNgram(OT_Ger, 1, false);
        
        Map<String, Double> ngramZTRndMono = TextStatistics.readNgram(OT_Rnd, 1, false);
        Map<String, Double> ngramZTRndPoly = TextStatistics.readNgram(OT_Rnd, 1, false);
        Map<String, Double> ngramZTRndTrans = TextStatistics.readNgram(OT_Rnd, 1, false);
        /*NGRAM VALUES (DOUBLE ARRAY) FOR SVK OT TYPE OF ALL KINDS OF CIPHERS*/
        Double[] valZTSvkMono = new Double[ngramZTSvkMono.values().size()];        
        ngramZTSvkMono.values().toArray(valZTSvkMono);
      
        Double[] valZTSvkPoly = new Double[ngramZTSvkPoly.values().size()];        
        ngramZTSvkPoly.values().toArray(valZTSvkPoly);
        
        Double[] valZTSvkTrans = new Double[ngramZTSvkTrans.values().size()];        
        ngramZTSvkTrans.values().toArray(valZTSvkTrans);
       /*NGRAM VALUES (DOUBLE ARRAY) FOR ENG OT TYPE OF ALL KINDS OF CIPHERS*/
        Double[] valZTEngMono = new Double[ngramZTEngMono.values().size()];        
        ngramZTEngMono.values().toArray(valZTEngMono);
      
        Double[] valZTEngPoly = new Double[ngramZTEngPoly.values().size()];        
        ngramZTEngPoly.values().toArray(valZTEngPoly);
        
        Double[] valZTEngTrans = new Double[ngramZTEngTrans.values().size()];        
        ngramZTEngTrans.values().toArray(valZTEngTrans);
        /*NGRAM VALUES (DOUBLE ARRAY) FOR GER OT TYPE OF ALL KINDS OF CIPHERS*/
        Double[] valZTGerMono = new Double[ngramZTGerMono.values().size()];        
        ngramZTGerMono.values().toArray(valZTGerMono);
      
        Double[] valZTGerPoly = new Double[ngramZTGerPoly.values().size()];        
        ngramZTGerPoly.values().toArray(valZTGerPoly);
        
        Double[] valZTGerTrans = new Double[ngramZTGerTrans.values().size()];        
        ngramZTGerTrans.values().toArray(valZTGerTrans);
        /*NGRAM VALUES (DOUBLE ARRAY) FOR RANDOM OT TYPE OF ALL KINDS OF CIPHERS*/
        Double[] valZTRndMono = new Double[ngramZTRndMono.values().size()];        
        ngramZTRndMono.values().toArray(valZTRndMono);
      
        Double[] valZTRndPoly = new Double[ngramZTRndPoly.values().size()];        
        ngramZTRndPoly.values().toArray(valZTRndPoly);
        
        Double[] valZTRndTrans = new Double[ngramZTRndTrans.values().size()];        
        ngramZTRndTrans.values().toArray(valZTRndTrans);
        
        double IOCZTEngMono = TextStatistics.indexOfCoincidence(valZTEngMono, ZT_EngMono.length());
        double IOCZTEngPoly = TextStatistics.indexOfCoincidence(valZTEngPoly, ZT_EngPoly.length());
        double IOCZTEngTrans = TextStatistics.indexOfCoincidence(valZTEngTrans, ZT_EngTrans.length());
        
        double IOCZTSvkMono = TextStatistics.indexOfCoincidence(valZTSvkMono, ZT_SvkMono.length());
        double IOCZTSvkPoly = TextStatistics.indexOfCoincidence(valZTSvkPoly, ZT_SvkPoly.length());
        double IOCZTSvkTrans = TextStatistics.indexOfCoincidence(valZTSvkTrans, ZT_SvkTrans.length());
        
        double IOCZTGerMono = TextStatistics.indexOfCoincidence(valZTGerMono, ZT_GerMono.length());
        double IOCZTGerPoly = TextStatistics.indexOfCoincidence(valZTGerPoly, ZT_GerPoly.length());
        double IOCZTGerTrans = TextStatistics.indexOfCoincidence(valZTGerTrans, ZT_GerTrans.length());
        
        double IOCZTRndMono = TextStatistics.indexOfCoincidence(valZTRndMono, ZT_RndMono.length());
        double IOCZTRndPoly = TextStatistics.indexOfCoincidence(valZTRndPoly, ZT_RndPoly.length());
        double IOCZTRndTrans = TextStatistics.indexOfCoincidence(valZTRndTrans, ZT_RndTrans.length());
    
        System.out.println();
        System.out.println();
        
        System.out.println("Eng ZT IOC Mono : " + IOCZTEngMono);
        System.out.println("Eng ZT IOC Poly : " + IOCZTEngPoly);
        System.out.println("Eng ZT IOC Trans : " + IOCZTEngTrans);
        
        System.out.println();
        
        System.out.println("Svk ZT IOC Mono : " + IOCZTSvkMono);
        System.out.println("Svk ZT IOC Poly : " + IOCZTSvkPoly);
        System.out.println("Svk ZT IOC Trans : " + IOCZTSvkTrans);
        
        System.out.println();
        
        System.out.println("Ger ZT IOC Mono : " + IOCZTGerMono);
        System.out.println("Ger ZT IOC Poly : " + IOCZTGerPoly);
        System.out.println("Ger ZT IOC Trans : " + IOCZTGerTrans);
        
        System.out.println();
        
        System.out.println("Rnd ZT IOC Mono : " + IOCZTRndMono);
        System.out.println("Rnd ZT IOC Poly : " + IOCZTRndPoly);
        System.out.println("Rnd ZT IOC Trans : " + IOCZTRndTrans);
        
        Map<String, Double> ngramZTSvkRelMono = TextStatistics.readNgram(ZT_SvkMono, 1, true);
        Map<String, Double> ngramZTSvkRelPoly = TextStatistics.readNgram(ZT_SvkPoly, 1, true);
        Map<String, Double> ngramZTSvkRelTrans = TextStatistics.readNgram(ZT_SvkTrans, 1, true);
        
        Map<String, Double> ngramZTEngRelMono = TextStatistics.readNgram(ZT_EngMono, 1, true);
        Map<String, Double> ngramZTEngRelPoly = TextStatistics.readNgram(ZT_EngPoly, 1, true);
        Map<String, Double> ngramZTEngRelTrans = TextStatistics.readNgram(ZT_EngTrans, 1, true);
        
        Map<String, Double> ngramZTGerRelMono = TextStatistics.readNgram(ZT_GerMono, 1, true);
        Map<String, Double> ngramZTGerRelPoly = TextStatistics.readNgram(ZT_GerPoly, 1, true);
        Map<String, Double> ngramZTGerRelTrans = TextStatistics.readNgram(ZT_GerTrans, 1, true);
        
        Map<String, Double> ngramZTRndRelMono = TextStatistics.readNgram(ZT_RndMono, 1, true);
        Map<String, Double> ngramZTRndRelPoly = TextStatistics.readNgram(ZT_RndPoly, 1, true);
        Map<String, Double> ngramZTRndRelTrans = TextStatistics.readNgram(ZT_RndTrans, 1, true);
        
        Double[] valZTSvkRelMono = new Double[ngramZTSvkRelMono.values().size()];        
        ngramZTSvkRelMono.values().toArray(valZTSvkRelMono);
        
        Double[] valZTSvkRelPoly = new Double[ngramZTSvkRelPoly.values().size()];        
        ngramZTSvkRelPoly.values().toArray(valZTSvkRelPoly);
        
        Double[] valZTSvkRelTrans = new Double[ngramZTSvkRelTrans.values().size()];        
        ngramZTSvkRelTrans.values().toArray(valZTSvkRelTrans);
        
        Double[] valZTEngRelMono = new Double[ngramZTEngRelMono.values().size()];        
        ngramZTEngRelMono.values().toArray(valZTEngRelMono);
        
        Double[] valZTEngRelPoly = new Double[ngramZTEngRelPoly.values().size()];        
        ngramZTEngRelPoly.values().toArray(valZTEngRelPoly);
        
        Double[] valZTEngRelTrans = new Double[ngramZTEngRelTrans.values().size()];        
        ngramZTEngRelTrans.values().toArray(valZTEngRelTrans);;
        
        Double[] valZTGerRelMono = new Double[ngramZTGerRelMono.values().size()];        
        ngramZTGerRelMono.values().toArray(valZTGerRelMono);
        
        Double[] valZTGerRelPoly = new Double[ngramZTGerRelPoly.values().size()];        
        ngramZTGerRelPoly.values().toArray(valZTGerRelPoly);
        
        Double[] valZTGerRelTrans = new Double[ngramZTGerRelTrans.values().size()];        
        ngramZTGerRelTrans.values().toArray(valZTGerRelTrans);
        
        Double[] valZTRndRelMono = new Double[ngramZTRndRelMono.values().size()];        
        ngramZTRndRelMono.values().toArray(valZTRndRelMono);
        
        Double[] valZTRndRelPoly = new Double[ngramZTRndRelPoly.values().size()];        
        ngramZTRndRelPoly.values().toArray(valZTRndRelPoly);
        
        Double[] valZTRndRelTrans = new Double[ngramZTRndRelTrans.values().size()];        
        ngramZTRndRelTrans.values().toArray(valZTRndRelTrans);
        
        double EntropyZTEngMono = TextStatistics.entropy(valZTEngRelMono);
        double EntropyZTEngPoly = TextStatistics.entropy(valZTEngRelPoly);
        double EntropyZTEngTrans = TextStatistics.entropy(valZTEngRelTrans);
        
        double EntropyZTSvkMono = TextStatistics.entropy(valZTSvkRelMono);
        double EntropyZTSvkPoly = TextStatistics.entropy(valZTSvkRelPoly);
        double EntropyZTSvkTrans = TextStatistics.entropy(valZTSvkRelTrans);
        
        double EntropyZTGerMono = TextStatistics.entropy(valZTGerRelMono);
        double EntropyZTGerPoly = TextStatistics.entropy(valZTGerRelPoly);
        double EntropyZTGerTrans = TextStatistics.entropy(valZTGerRelTrans);
        
        double EntropyZTRndMono = TextStatistics.entropy(valZTRndRelMono);
        double EntropyZTRndPoly = TextStatistics.entropy(valZTRndRelPoly);
        double EntropyZTRndTrans = TextStatistics.entropy(valZTRndRelTrans);
        
        System.out.println();
        System.out.println();
        
        
        System.out.println("Eng ZT entropy Mono: " + EntropyZTEngMono);
        System.out.println("Eng ZT entropy Poly: " + EntropyZTEngPoly);
        System.out.println("Eng ZT entropy Trans: " + EntropyZTEngTrans);
        
        System.out.println();
        
        System.out.println("Svk ZT entropy Mono: " + EntropyZTSvkMono);
        System.out.println("Svk ZT entropy Poly: " + EntropyZTSvkPoly);
        System.out.println("Svk ZT entropy Trans: " + EntropyZTSvkTrans);
        
        System.out.println();
        
        System.out.println("Ger ZT entropy Mono: " + EntropyZTGerMono);
        System.out.println("Ger ZT entropy Poly: " + EntropyZTGerPoly);
        System.out.println("Ger ZT entropy Trans: " + EntropyZTGerTrans);
        
        System.out.println();
        
        System.out.println("Rnd ZT entropy Mono: " + EntropyZTRndMono);
        System.out.println("Rnd ZT entropy Poly: " + EntropyZTRndPoly);
        System.out.println("Rnd ZT entropy Trans: " + EntropyZTRndTrans);
        
        System.out.println();
        
       System.out.println(Cryptosystem.guess(ZT_GerMono));
        
        
    }
    
    static String randomText(int length)
    {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        int znak;
        for (int i = 0; i < length; i++)
        {
            znak = rand.nextInt(26) + 'a';
            sb.append((char)znak);
        }
        
        return sb.toString();
    }
}

