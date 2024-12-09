package hu.szamalk;

import java.util.Random;

public class Tábla {
    private  char [][] T = new char[8][8];
    private char ÜresCella;
    public static Random rnd = new Random();


    public Tábla() {
        this('ß');
    }

    public Tábla(char üresCella) {
        this(üresCella, new char[üresCella][üresCella]);
    }

    public Tábla(char ÜresCella, char[] [] T) {
        this(ÜresCella, T [ÜresCella] [null]);

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

    public void Elhelyez(int N){
        int random= rnd.nextInt(0,1);
        char jel='K';
        for (int i = 0; i < N; i++) {
            if(this.T[i][i] == this.ÜresCella){
               if (random==1){
                   this.T[i][i]= [jel] [jel];
               }
            }
        }
    }

}
