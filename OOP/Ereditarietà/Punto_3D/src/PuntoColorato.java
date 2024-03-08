import java.awt.Color;

public class PuntoColorato extends Punto{
    // Variabili
    private Color c;
    // Costruttori
    public PuntoColorato () {
        super();
        c = Color.BLACK;
    }
    
    public PuntoColorato(double x, double y, Color c){
        super(x, y);
        this.c = c;
    }
    
    public String toString(){
        String s;
        s = super.toString() + " Color: "+ c.toString();
        return s;
    }
}
