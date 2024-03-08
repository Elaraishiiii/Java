import java.awt.Color;

public class Rettangolo extends Quadrilatero{
    // Attributi
    protected Color colore;
 
    // Costruttori
    public Rettangolo() {
        super();
    }
    
    public Rettangolo(int a, int b) {
        super(a, b, a, b);
    }
    
    public Rettangolo(int a, int b, Color c) {
        super(a, b, a, b);
        colore = c;
    }
    
    public int area() {
        int area;
        area = latoA * latoB;
        return area;
    }
    
 
    public Color getColore() {
        return colore;
    }
    
    public void setColore(Color c) {
        colore = c;
    }
    
    public String toString() {
        String s;
        s = "Rettangolo " + super.toString();
        return s;
    }
}
