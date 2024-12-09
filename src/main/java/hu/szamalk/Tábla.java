package hu.szamalk;

public class Tábla {
    private  char [][] T = new char[8][8];
    private char ÜresCella;


    public Tábla() {
        this('ß');
    }

    public Tábla(char üresCella) {
        this(üresCella, new char[üresCella][üresCella]);
    }

    public Tábla(char ÜresCella, char [][] T) {
        this(ÜresCella, char [][] );

    }

    public void feltölt(){
        for (int i = 0; i < T.length; i++) {
            T[i][i]= ÜresCella;
        }
    }


    public void Megjelenit(){
        System.out.println("4.feladat: Az üres tábla:");
        for (int i = 0; i <T.length ; i++) {
            System.out.print(T[i][i]);
        }
    }

}
