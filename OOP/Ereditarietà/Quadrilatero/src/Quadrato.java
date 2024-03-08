import java.awt.Color;

public class Quadrato extends Rettangolo {
    // Costruttori
    public Quadrato(int i) {
        super(i, i);
    }

    public Quadrato(int i, Color c) {
        super(i, i);
        colore = c;
    }

    public String toString() {
        String s;
        s = "Quadrato"+ " \"(" + this.latoA + " , " + this.latoB + " , " + this.latoC + " , " + this.latoD +")\"";
        return s;
    }

}
