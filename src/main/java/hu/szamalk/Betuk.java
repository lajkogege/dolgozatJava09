package hu.szamalk;

public class Betuk {
    public String szoveg;
    public char betuTomb[] = new char[1];


    public Betuk() {
        this("gergő");

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

    public void kiir(String szoveg){
        System.out.print(szoveg);
    }

    public String getSzoveg() {
        return szoveg;
    }
}




