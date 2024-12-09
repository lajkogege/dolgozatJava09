package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        //F1Kezdes
    //Tábla tb = new Tábla('#');
    //tb.Megjelenit();
    
    //F3Kezdes
        Betuk b = new Betuk();
        b.feltolt();
        b.kiir("Név és 10 betű:\n");
        b.veszovelMegjelenit();
        b.kiir("\n");
        b.betukKiOlvasasa();
    }


}