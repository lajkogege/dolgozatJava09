package hu.szamalk;

public class Tábla {
    private  char [][] T = new char[8][8];
    private char ÜresCella;


    public Tábla( char ÜresCella, char [][] t {
        this.ÜresCella = ÜresCella;
        this.T = t;

    }

    public void feltölt(){
        for (int i = 0; i < T.length; i++) {
            T[i][i]= ÜresCella;
        }
    }

    
}
