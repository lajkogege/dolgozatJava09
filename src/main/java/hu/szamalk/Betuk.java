package hu.szamalk;

public class Betuk {
    public String nevem = "Gergő";
    public char betuTomb[] = new char[1];

    public Betuk() {

    }


    public Betuk(String nevem, char[] betuTomb) {
        this.nevem = nevem;
        this.betuTomb = betuTomb;

    }


    public char[] feltolt() {
        for (int i = 0; i < betuTomb.length; i++) {
            this.betuTomb = getNevem().toCharArray();
        }

        return betuTomb;
    }

    public void megjelenitVesszovel(){
        for (int i = 0; i < betuTomb.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print("" + getNevem());
        }

    }
    public void kiir(String szoveg){
        System.out.print(szoveg);
    }


    public String getNevem() {
        return nevem;
    }

}




