package linea;

public class Linea {
    // Assegnazioni Variabili
    private Punto a,b;
    // Metodi
    public Linea () {
        a = new Punto ();
        b = new Punto (1,1);
    }
    
    public Linea (Punto a, Punto b){
        this.a = new Punto(a);
        this.b = new Punto(b);
    }
    
    public Punto getA () {
        return new Punto(a);
    }
    
    public Punto getB () {
        return new Punto(b);
    }
    
    public Linea (Linea due) {
        a = new Punto(due.getA());
        b = new Punto(due.getB());
    }
    
    public void setLinea (Punto a, Punto b){
        this.a.setXY(a.getX(),a.getY());
        this.b.setXY(a.getX(),a.getY());
    }
    
    @Override
    public String toString(){
        String s;
        s = a.toString()+" - "+b.toString();
        return s;
    }
    
    public double getLunghezza (){
        double l;
        l = a.getDistanza(b);
        return l;
    }
}
