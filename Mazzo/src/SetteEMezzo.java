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
        System.out.println(M);
        do {
            Pg = 0;
            int r = 0;
            do {
                c = M.EstraiAlto();
                if (c == null) {
                    Mazzo m = new Mazzo();
                    m.Mischia();
                    c = m.EstraiAlto();
                }
                else {
                    Pg += c.getValore();
                    if (Pg < 7.5) {
                        System.out.println("Hai " + Pg + " Punti, Vuoi Continuare ? (0/1)");
                        r = sc.nextInt();
                    }
                    else if (Pg > 7.5) {
                        System.out.println("Hai Sballato !!");
                    }
                    else {
                        System.out.println("Hai " + Pg + "Punti");
                    }
                }
            } while ((Pg < 7.5) && (r == 1));

            Pc = 0;
            r = 1;
            do {
                c = M.EstraiAlto();
                Pc += c.getValore();
                if (Pc < 7.5) {
                    System.out.println("il Pc ha " + Pc + " Punti");
                    if (Pc < So) {
                        r = 0;
                    }
                }
                else if (Pc > 7.5) {
                    System.out.println("Il PC Ha Sballato !!");
                }
                else {
                    System.out.println("Hai " + Pg + "Punti");
                }
            } while ((Pc < 7.5) && (r == 1));
            if (/*Condizione Vince G, Vince Pc, Pareggio, Sforano Entrambi, Sfora G, Sfora PC*/true) {
                // IF Pareggio
                if ((Pg == Pc) || ((Pc > 7.5) && (Pg > 7.5))) {
                    System.out.println("Pareggio");
                    NPP ++;
                }
                // If Vittoria Pg
                if ((Pg > Pc)&& (Pg <= 7.5)) {
                    if (Pc > 7.5) {
                        So -= 0.1;
                    }
                    else So += 0.1;
                    NVG++;
                }
                // IF Perdita
                if ((Pc > Pg)&& (Pc > 7.5)) {
                    NVC++;
                }
            }
        } while (NVG == 3);
    }
}
