import java.util.Scanner;
public class Main {

    // ---------------------- Forza Quattro ---------------------- */
    /* Funzioni:
        -- Azzera(int m[][])) 👍
        -- Visualizza(int m[][])) 👍
        -- Inserisci(int m[][]), int g, int c) 👍
        -- Controlla(int m[][]))
    // ----------------------------------------------------------- */
    public static void Azzerra (int m[][]){
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = 0;
            }
        }
    }
    public static void Visualizza (int m[][]){
        System.out.println("   0   1   2   3   4   5   6");
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < 7; j++) {
                if (m[i][j]==0) {
                    if (j == 0)
                        System.out.print(" | " + " "+ " | ");
                    else
                        System.out.print(" " + " | ");
                }
                if (m[i][j]==1){
                    if (j == 0)
                        System.out.print(" | " + "X"+ " | ");
                    else
                        System.out.print("X" + " | ");
                }
                if (m[i][j]==2){
                    if (j == 0)
                        System.out.print(" | " + "O"+ " | ");
                    else
                        System.out.print("O" + " | ");
                }
            }
            System.out.println();
        }
        System.out.println(" -----------------------------");
    }
    public static void Inserisci (int m[][], int g, int c){
        for (int i = (m.length)-1; i > -1; i--) {
            if (m[i][c]==0) {
                m[i][c] = g;
                break;
            }
        }
    }
    public static int Controlla(int m[][]) {
        int stato = 0;

        // Controllo Orizzontale X
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length - 3; j++) {
                if (m[i][j] == m[i][j + 1] && m[i][j] == m[i][j + 2] && m[i][j] == m[i][j + 3] && m[i][j] == 1) {
                    stato = 1;
                }
            }
        }

        // Controllo verticale X
        for (int i = 0; i < m.length - 3; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == m[i + 1][j] && m[i][j] == m[i + 2][j] && m[i][j] == m[i + 3][j] && m[i][j] == 1) {
                    stato = 1;
                }
            }
        }

        // Controllo diagonale destra X
        for (int i = 0; i < m.length - 3; i++) {
            for (int j = 0; j < m[i].length - 3; j++) {
                if (m[i][j] == m[i + 1][j + 1] && m[i][j] == m[i + 2][j + 2] && m[i][j] == m[i + 3][j + 3] && m[i][j] == 1) {
                    stato = 1;
                }
            }
        }

        // Controllo diagonale sinistra X
        for (int i = 0; i < m.length - 3; i++) {
            for (int j = 3; j < m[i].length; j++) {
                if (m[i][j] == m[i + 1][j - 1] && m[i][j] == m[i + 2][j - 2] && m[i][j] == m[i + 3][j - 3] && m[i][j] == 1) {
                    stato = 1;
                }
            }
        }
        // -------------------------------------------------------------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------------
        // Controllo Orizzontale O
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length - 3; j++) {
                if (m[i][j] == m[i][j + 1] && m[i][j] == m[i][j + 2] && m[i][j] == m[i][j + 3] && m[i][j] == 2) {
                    stato = 2;
                }
            }
        }

        // Controllo verticale O
        for (int i = 0; i < m.length - 3; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == m[i + 1][j] && m[i][j] == m[i + 2][j] && m[i][j] == m[i + 3][j] && m[i][j] == 2) {
                    stato = 2;
                }
            }
        }

        // Controllo diagonale destra O
        for (int i = 0; i < m.length - 3; i++) {
            for (int j = 0; j < m[i].length - 3; j++) {
                if (m[i][j] == m[i + 1][j + 1] && m[i][j] == m[i + 2][j + 2] && m[i][j] == m[i + 3][j + 3] && m[i][j] == 2) {
                    stato = 2;
                }
            }
        }

        // Controllo diagonale sinistra O
        for (int i = 0; i < m.length - 3; i++) {
            for (int j = 3; j < m[i].length; j++) {
                if (m[i][j] == m[i + 1][j - 1] && m[i][j] == m[i + 2][j - 2] && m[i][j] == m[i + 3][j - 3] && m[i][j] == 2) {
                    stato = 2;
                }
            }
        }
        // -------------------------------------------------------------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------------

        if (stato == 1) {
            System.out.println("Vittoria X");
            return 1;
        }
        else if (stato == 2) {
            System.out.println("Vittoria O");
            return 2;
        }
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[][] = new int[6][7];
        int c;
        int g = 1;
        // GX = 1 || G0 = 2
        Azzerra(m);
        Visualizza(m);
        do {
            System.out.println("Giocatore: "+g);
            System.out.println("Scegli Colonna:");
            c = sc.nextInt();
            Inserisci(m, g, c);
            Visualizza(m);
            if (g==1)
                g=2;
            else
                g=1;
        }
        while (Controlla(m) == 0);

    }
}