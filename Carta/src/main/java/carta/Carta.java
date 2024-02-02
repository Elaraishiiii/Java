package carta;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Carta {

    // Variabili
    private int n;
    private char s; //Seme Carta {'o' -> Ori, 'c' -> Coppe, 's' -> Spade, 'b' -> Bastoni}
    // Costruttore

    public Carta() {
        n = 1;
        s = 'b';
    }

    public Carta(int n, char s) {
        if ((n <= 10) && (n >= 1)) {
            this.n = n;
        } else {
            this.n = 1;
        }
        if ((s == '0') || (s == 'c') || (s == 's') || (s == 'b')) {
            this.s = s;
        } else {
            this.s = 'b';
        }
    }

    // Costruttore Copia
    public Carta(Carta due) {
        this.n = due.getN();
        this.s = due.getS();
    }

    public int getN() {
        return n;
    }

    public char getS() {
        return s;
    }

    public void setCarta(int n, char s) {
        if ((n <= 10) && (n >= 1)) {
            this.n = n;
        } else {
            this.n = 1;
        }
        if ((s == 'o') || (s == 'c') || (s == 's') || (s == 'b')) {
            this.s = s;
        } else {
            this.s = 'b';
        }
    }

    @Override
    public String toString() {
        String st = "";
        if (n == 1) {
            st = "Asso";
        } else {
            st = n + "";
        }
        switch (s) {
            case 'o':
                st += " di Ori";
                break;

            case 'c':
                st += " di Coppe";
                break;

            case 's':
                st += " di Spade";
                break;

            case 'b':
                st += " di Bastoni";
                break;

            default:
                st += " di Bastoni";
        };
        return st;
    }

    public Boolean Equals(Carta c) {
        if (n == c.getN() && s == c.getS()) {
            return true;
        } else {
            return false;
        }
    }

    public double getValore() {
        if (n < 8) {
            return n;
        } else {
            return 0.5;
        }
    }

    public void setCasuale() {
        n = (int) (Math.random() * 10 + 1);
        int seme = (int) (Math.random() * 4 + 1);
        switch (seme) {
            case 1:
                s = 'o';
                break;
            case 2:
                s = 'c';
                break;
            case 3:
                s = 's';
                break;
            case 4:
                s = 'b';
                break;
            default:
                s = 'o';
                break;
        }
    }

    public void Disegna(Graphics g, int x, int y) {
        BufferedImage img = null;
        String nome = "Carte/Carta" + n + s + ".jpg";
        try {
            img = ImageIO.read(new File(nome));
            g.drawImage(img, x, y, null);
            System.out.println(img.getHeight());
        } catch (IOException e) {
            System.out.println("");
        }
    }

}
