package esercizio.pkg6;

import java.util.Scanner;

public class Esercizio6 {
    public static void riempi (int v[]){
    int c;
    for (int i = 0; i < v.length; i++) {
        c=(int)(Math.random()*20+1);
        v[i]=c;
    }
    }
    
    public static void azzerramento (int v[]){
        for (int i = 0; i < v.length; i++) {
            if (i%2 == 0) {
                v[i]=0;
            }
        }
    }
    
    public static void visualizza (int v[]){
        for (int i = 0; i < v.length; i++) {
            System.out.println("v["+i+"] = "+ v[i]);          
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("Inserisci il numero");
        n=sc.nextInt();
        int v[] = new int [n];
        riempi(v);
        azzerramento(v);
        visualizza(v);
    }
    
}
    
