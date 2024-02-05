package rettangolo;
public class Rettangolo {
    // Variabili
    private double a , b;
    // Costruttori
    
    public Rettangolo (){
        a = 1;
        b = 1;
    }
    
    public Rettangolo (double a, double b){
        if (a<=0) this.a = 1;
        else this.a = a;
        
        if (b<=0) this.b = 1;
        else this.b = b;
    }
    
    public double getA (){
        return a;
    }
    
    public double getB (){
        return b;
    }
    
    public double getArea (){
        double area;
        area = a*b;
        return area;
    }   
    
    @Override
    public String toString (){
        String s;
        s = "Rettangolo: \n   H = " + a + "\n   B = " + b;
        return s;
    }
    
    public boolean Equals (Rettangolo due) {
        return a == due.getA() && b == getB();
    }
    
    public boolean maggiore (Rettangolo due) {
        return getArea() > due.getArea();
    }
    
    public boolean minore (Rettangolo due) {
        return getArea() < due.getArea();
    }
}
