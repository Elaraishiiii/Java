package esercizio.pkg5;

import java.util.Scanner;

public class Esercizio5 {
    public static void riempi (int v[],int n){
        int c;
        for (int i = 0; i < v.length; i++) {
            c=(int)(Math.random()*n+1);
            v[i]=c;
        }
    }
    public static void visualizza (int v[]){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        int v [] = new int [10];
        System.out.println("Inserisci il numero");
        n=sc.nextInt();
        riempi(v, n);
        visualizza(v);
    }
    
}
