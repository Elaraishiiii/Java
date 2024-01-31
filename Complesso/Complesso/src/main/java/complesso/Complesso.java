package complesso;
public class Complesso {
    // Dichiarazione Variabili
    private int re,im;
    // Costruttori
    public Complesso () {
        re = 1;
        im = 1;
    }
    public Complesso (int re, int im) {
        this.re = re;
        this.im = im;
    }
    // Costruttore Copia
    public Complesso (Complesso due){
        this.re = due.getRe();
        this.im = due.getIm();
    }
    public int getRe(){
        return re;
    }
    public int getIm () {
        return im;
    }
    public Complesso (int im){
        re = 1;
        this.im = im;
    }
    public void setComplesso (int re, int im){
        this.re = re;
        this.im = im;
    }
    public String toString () {
        String s;
        if (im > 0) {
            s = "z = "+ re + " + " + im + "i";
        }
        else if (im == 0)
            s = "z = "+ re + " + "+"i";
        else 
            s = "z = "+ re + " - " + -im + "i";


        return s;
    }
    public Complesso somma (Complesso due){
        Complesso c;
        int r, imm;
        r = this.re + due.getRe();
        imm = this.im + due.getIm();
        c = new Complesso(r, imm);
        return c;
    }
    public Complesso sottrai (Complesso due){
        Complesso c;
        int r, imm;
        r = this.re - due.getRe();
        imm = this.im - due.getIm();
        c = new Complesso(r, imm);
        return c;
    }
}
