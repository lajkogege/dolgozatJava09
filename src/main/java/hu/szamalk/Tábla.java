package hu.szamalk;

public class Tábla {
    private  char [][] T;
    private char ÜresCella;

    public Tábla( char üresCella) {
        ÜresCella = üresCella;
        this('ß', new char[8][8]);
    }

    public Tábla( char ÜresCella, char[][] T) {
        this.ÜresCella = ÜresCella;
        this.T = [ÜresCella] [ÜresCella];

    }

}
