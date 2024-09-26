package disco;
import java.awt.Color;

public class Disco extends Cerchio{
    //Attributi
    Color C;
    // Costruttori
    public Disco(){
        super(5,5,1);
        this.C = Color.RED;
    }
    public Disco(int x, int y, int r, Color c){
        super(x, y, r);
        this.C = c;
        this.Prova();
    }
    public Disco (Disco due){
        super(due.getX(),due.getY(), due.getR());
        this.C = due.getColor();
    }
    // Metodi
    public void setDisco (int x, int y, int r, Color c){
        super.setXYR(x, y, r);
        this.C = getColor();
    }
    public Color getColor(){
        return this.C;
    }
    public String toString (){
        String s = "Disco "+ super.toString()+ " Colore "+ C.toString();
        return s;
    }
}
