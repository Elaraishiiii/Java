package main;
import java.util.Scanner;
import rettangolo.Rettangolo;

public class main {
    public static void main(String[] args) {
        // Esercizio Rettangolo: H = 2 || B = 4
        Rettangolo v[] = new Rettangolo[100];
        Rettangolo P = new Rettangolo (2,4);
        int cont = 0;
            
        // Inizializzazione Vettore
        for (int i = 0; i < v.length; i++) {
            v[i] = new Rettangolo(Math.random()*10, Math.random()*10);
            if (v[i].minore(P)){
                cont++;
                System.out.println(v[i].toString());
            }
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            double h,b; 
            System.out.println("Inserisci H e B");
            h = sc.nextDouble();
            b = sc.nextDouble();
            v[i] = new Rettangolo(h, b);
            System.out.println(v[i].toString());
            
        }
        System.out.println("Cont = " + cont);    } 
}
