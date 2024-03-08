package esercizio.pkg1;

import java.util.Scanner;


public class Esercizio1 {
    public static int risutlato(int x) {
        int r;
        r= (int) Math.sqrt((Math.pow(x, 2)+3)/2);
        r= (int) (3*Math.pow(x, 3)-r);
        return r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,r;
        System.out.println("Inserisci il valore di X");
        x = sc.nextInt();
        r = risutlato(x);
        System.out.println("Risultato = "+r);
    }
}
