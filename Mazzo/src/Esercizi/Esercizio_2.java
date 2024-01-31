package Esercizi;
public class Esercizio_2 {
    public static void main(String[] args) {
        // Creare un mazzo estrarre 10 carte a caso del mazzo e sostutirle con 10 assi di bastoni visualizzare il mazzo
        Mazzo m = new Mazzo ();
        m.Mischia();
        Carta b = new Carta(1, 'b');
        for (int i = 0; i < 10; i++) {
            
            m.InserisciBasso(b);
        }
        System.out.println(m);
    }
}
