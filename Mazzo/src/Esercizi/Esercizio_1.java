package Esercizi;

public class Esercizio_1 {

    public static void main(String[] args) {
        // Creare un mazzo e mischiarlo poi Spostare tutte le carte che non sono figure 
        // in un mazzo vuoto e visualizzarlo

        Mazzo Mo = new Mazzo();
        Carta c;
        Mazzo Mf = new Mazzo();
        //Mf.Svuota();
        Mo.Mischia();
        Mf.Mischia();
        
        for (int i = 0; i < 40; i++) {
            c = Mo.EstraiAlto();
            if (c.getN() > 7) Mf.InserisciAlto(c);
            else Mo.InserisciBasso(c);   
        } 
        System.out.println(Mf);  
    }
}
