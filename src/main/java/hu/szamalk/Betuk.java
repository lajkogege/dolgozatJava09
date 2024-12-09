package hu.szamalk;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Betuk {
    public String szoveg;
    public char betuTomb[] = new char[1];
    public Random rnd = new Random();


    public Betuk() {
        this("LajkóGergő");

    }

    public Betuk(String szoveg) {
        this.szoveg = String.valueOf(szoveg);

    }



    public char[] feltolt() {
        for (int i = 0; i < betuTomb.length; i++) {
            this.betuTomb = getSzoveg().toCharArray();
        }
        return betuTomb;
    }



    public  void veszovelMegjelenit() {
        for (int i = 0; i < betuTomb.length; i++) {
            if (i > 0) {
                kiir(",");
            }
            kiir("" + betuTomb[i]);
        }
    }

    public Set<Character> betukKiOlvasasa() {
        Set<Character> egyediBetuk = new HashSet<>();
        for (char c : betuTomb) {
            if (Character.isLetter(c))
                egyediBetuk.add(c);
            kiir(""+c);
        }
        return egyediBetuk;
    }

    public void randomAbc(){
         char random []= new char[10] ;
        for (int i = 0; i < random.length; i++) {

        }
    }

    public void kiir(String szoveg){
        System.out.print(szoveg);
    }

    public String getSzoveg() {
        return szoveg;
    }
}




