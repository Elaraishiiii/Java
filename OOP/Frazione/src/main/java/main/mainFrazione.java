package main;
import frazione.Frazione;
import java.util.Scanner;

public class mainFrazione {
    public static void main(String[] args) {
        
        // Caricare una Frazione e Riempire un Vettore di 10 Frazioni con il quadrato
        // Della Frazione Inserita. Visualizzare infine il vettore
        
        Scanner sc = new Scanner (System.in);
//        String s;
//        Frazione F;
//        Frazione v[] = new Frazione [10]; 
//        
//        System.out.println("Inserire Numeratore:");
//        int n = sc.nextInt();
//        System.out.println("Inserire Denominatore:");
//        int d = sc.nextInt();
//        F = new Frazione(n, d);
//        System.out.println(F.toString());
//        for (int i = 0; i < v.length; i++) {
//            v[i] = F.Moltiplica(F);
//            System.out.println("v["+(i+1)+"]= "+v[i].toString());
//        }
        
        // Riempire un vettore di 50 Frazioni casuali (Tra 0 e 100) poi:
        // - Contare quante Frazioni sono > della prima
        // - Aumentare di uno il denominatore di quelle con il numeratore pari
//        
//        int cont = 0;
//        Frazione v[] = new Frazione [50];
//        Frazione F;
//        
//        for (int i = 0; i < v.length; i++) {
//            v[i] = new Frazione(Math.random()*100);
//        }
//        
//        for (int i = 1; i < v.length; i++) {
//            if (v[i].Maggiore(v[0])) {
//                cont ++;
//            }  
//        }
//        
//        for (int i = 0; i < v.length; i++) {
//            if (v[i].getN()%2 == 0) {
//                v[i].setFrazione(v[i].getN(), v[i].getD()+1);
//                System.out.println(v[i]);
//            }
//        }
//        
//        System.out.println("Il Numero di Frazioni Maggiori della Prima = "+cont);

        String s = "7/7";
        Frazione f1 = new Frazione(1,2);
        Frazione f2 = new Frazione(3,4);
        System.out.println(Frazione.parseFrazione(s));
        Frazione somma = f1.Somma(f2);
        System.out.println(somma);
    }
}
