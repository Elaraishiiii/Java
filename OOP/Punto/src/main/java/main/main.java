package main;
import java.util.Scanner;
import punto.Punto;

public class main {
    public static void main(String[] args) {
        Punto p1 = new Punto ();
        Punto p2 = new Punto (7,2);
        
        p1.setXY(3, 2);
        p2.sety(14);
        System.out.println(p2.getY());
        p1.setx(p1.getX()*2);
        double a = p1.getX();
        System.out.println(a);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
//      p2.setXY(6, 2);
        if (p1.Equals(p2)== true) {
            System.out.println("Sono Uguali");
        }
        else{
            System.out.println("Non sono Uguali");
        }
        p1.setCasuale();
        
//      Es. Creazione di 2 punti
        Scanner sc = new Scanner (System.in);
        double x, y; 
        Punto A = new Punto();
        A.setCasuale();
        System.out.println("Inserire X e Y");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Punto B = new Punto(x,y);
        if (B.Equals(A)== true) {
            A.setXY(A.getX()*2 , A.getY()*2);
            System.out.println(A.toString());
        }
        else
            System.out.println("Distanza Uguale = "+A.getDistanza(B));
        Punto M;
        M = p1.getMedio(p2);
        System.out.println(M.toString());
        System.out.println("------------------------------------");
        
//      Esercizio
        Punto pA = new Punto (3,2);
        Punto pB = new Punto();
        Punto O = new Punto();
        Punto pM;
        int cont = 0 ;
        double X,Y;
        do {
            System.out.print("X = ");
            X = sc.nextDouble();
            System.out.print("Y = ");
            Y = sc.nextDouble();
            pB.setXY(X, Y);
            pM = pB.getMedio(pA);
            System.out.println("Punto Medio = " + pM.toString());
            if (pB.getDistanza()<2) {
                cont++;
                System.out.println("Punto all interno del Cerchio");
            }
        }
        while (!(pB.Equals(O)));
        System.out.println("Risultato del conteggio = "+ cont);
        
        // Array di Oggetti
        int vO[] = new int[10];
        vO[0]=3;
        Punto vP [] = new Punto[10]; // Array di 10 punti
//      vP[0].setXY(3, 2); Null Pointer Exeption
        for (int i = 0; i < vP.length; i++) {
            vP[i] = new Punto(); 
            System.out.println(vP[i].toString());
        }
        System.out.println("Somma Polilinea");
//     Esercizio Somma Polilinea
        double xP,yP,l=0;
        Punto vPol [] = new Punto[10]; 
        for (int i = 0; i < vPol.length; i++) {
            xP = (int)(Math.random()*100+1);
            yP = (int)(Math.random()*100+1);
            vPol[i] = new Punto(xP,yP);
            System.out.println(vPol[i].toString());
        }
        for (int i = 0; i < vPol.length-1; i++) {
            l = l + vPol[i].getDistanza(vPol[i+1]);
        }
        System.out.println("Lunghezza Polilinea = "+l);
        System.out.println("Somma Quanti Punti Nel triangolo");
//      Esercizio punti nel Triangolo
        int conto = 0;
        for (int i = 0; i < vPol.length; i++) {
            if (vPol[i].getY() < vPol[i].getX()) {
                conto++;
            }
        }
        System.out.println("I punti dentro l'area selezionata sono : "+conto);
       
    }
}

