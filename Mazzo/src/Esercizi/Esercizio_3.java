package Esercizi;
public class Esercizio_3 {
    public static void main(String[] args) {
        Mazzo M = new Mazzo ();
        int nc = M.Conta();
        Carta c;
        int cont = 0;
        for (int i = 0; i < nc; i++) {
            c = M.EstraiAlto();
            if (c.getS() != 'b') {
                c.setCarta(c.getN(), 'b');
                cont++;
                M.InserisciBasso(c);
            }
        }
        System.out.println(M);
        System.out.println("Carte Modificate: "+cont);
    }
}
