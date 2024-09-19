package Posizione;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Posizione v[] = new Posizione[5];
        int cont = 0;
        int uguale = 0;
        
        for (int i = 0; i < v.length; i++) {
            System.out.println("Inserire LA; LO; AL");
            v[i] = new Posizione(sc.nextInt(), sc.nextInt(), sc.nextInt());    
        }
        
        for (int i = 0; i < v.length; i++) {
            if (!(v[i].SoppraLivelloMare())) cont++;
        }
        
        System.out.println(cont +" Sotto Al Livello Del Mare");
        
        Posizione Z = new Posizione(123, 82, 71);
        for (int i = 0; i < v.length; i++) {
            if(v[i].Equals(Z)) uguale++;
        }
        System.out.println(uguale +" Vettori uguali al vettore Z");
        
        
    }
}
