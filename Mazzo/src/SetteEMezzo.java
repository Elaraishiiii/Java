
import java.util.Scanner;

public class SetteEMezzo {

    public static void main(String[] args) {
        // Gioco Sette e Mezzo //

        // Variabili
        Scanner sc = new Scanner(System.in);
        Mazzo M = new Mazzo();
        Carta c;
        int NVG = 0, NVC = 0, NPP = 0;
        double Pg, Pc, So = 5;

        // Funzioni
        M.Mischia();
        do {
            Pg = 0;
            int r = 0;
            do {
                c = M.EstraiAlto();
                // If Carta c è null
                if (c == null) {
                    Mazzo m = new Mazzo();
                    m.Mischia();
                    c = m.EstraiAlto();
                    Pg += c.getValore();
                } else {
                    Pg += c.getValore();
                    if (Pg < 7.5) {
                        System.out.println("");
                        System.out.println("Carta Giocatore " + c);
                        System.out.println("Hai " + Pg + " Punti, Vuoi Continuare ? (0/1)");
                        r = sc.nextInt();
                    } else if (Pg > 7.5) {
                        System.out.println(c);
                        System.out.println("Hai Sballato !!");
                        // Giocatore ha Sballato
                    } else {
                        System.out.println("Hai " + Pg + " Punti");
                    }
                }
            } while ((Pg < 7.5) && (r == 1));

            System.out.println("\n-------------------------------------\n");
            // Mano Pc
            Pc = 0;
            int rp = 0;

            do {
                c = M.EstraiAlto();
                if (c == null) {
                    Mazzo m = new Mazzo();
                    m.Mischia();
                    c = m.EstraiAlto();
                    Pg += c.getValore();
                } else {
                    Pc += c.getValore();
                    System.out.println("Carta PC " + c);
                    System.out.println("il Pc ha " + Pc + " Punti");
                    System.out.println(So + " Soglia");

                    if (Pc < 7.5) {
                        if (Pc < So) {
                            rp = 1;
                        } else {
                            rp = 0;
                        }
                    } else {
                        System.out.println("Il PC Ha Sballato !!");
                    }
                }
            } while ((Pc < 7.5) && (rp == 1));

            // Condizioni di Vitroria
            // IF Pareggio
            if ((Pg == Pc) || ((Pc > 7.5) && (Pg > 7.5))) {
                System.out.println("Pareggio");
                NPP++;
                System.out.println(NPP + " Pareggio");
                System.out.println(NVG + " Giocatore");
                System.out.println(NVC + " Computer\n\n==========================================\nNuova Partita\n==========================================");
                continue;
            }
            // If Vittoria Pg
            // Punteggio G Minore && Punteggio PC > 7.5
            // Punteggio G Maggiore && Punteggio Giocatore <= 7.5 || Pc > 7.5
            if ((Pg < Pc && Pc > 7.5) || (Pg > Pc && Pg <= 7.5) || Pc > 7.5) {
                System.out.println("Vittoria del Giocatore");
                NVG++;
                if (Pc > 7.5) {
                    So -= 0.1;
                } else {
                    So += 0.1;
                }
                System.out.println(NPP + " Pareggio");
                System.out.println(NVG + " Giocatore");
                System.out.println(NVC + " Computer\n\n==========================================\nNuova Partita\n==========================================");
                continue;
            }
            // IF Perdita
            // Punteggio Pc Minore && Punteggio G > 7.5
            // Punteggio Pc Maggiore && Punteggio Pc <= 7.5 || Pg > 7.5
            if ((Pc < Pg && Pg > 7.5) || (Pc > Pg && Pc < 7.5) || Pg > 7.5) {
                System.out.println("Vittoria del Pc");
                NVC++;
                System.out.println(NPP + " Pareggio");
                System.out.println(NVG + " Giocatore");
                System.out.println(NVC + " Computer\n\n==========================================\nNuova Partita\n==========================================");
                continue;
            }
        } while (true /*Chi Arriva Prima a 3 Punti*/);
    }
}
