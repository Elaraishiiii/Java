public class Rettangolo {
    // Variabili
    private int a , b;
    // Costruttori
    
    public Rettangolo (){
        a = 50;
        b = 50;
    }
    
    public Rettangolo (int a, int b){
        if (a<=0) this.a = 50;
        else this.a = a;
        
        if (b<=0) this.b = 50;
        else this.b = b;
    }
    
    public int getA (){
        return a;
    }
    
    public int getB (){
        return b;
    }
    
    public void setAB (int a, int b){
        if (a<=0) this.a = 50;
        else this.a = a;
        
        if (b<=0) this.b = 50;
        else this.b = b;
    }
    
    public int getArea (){
        int area;
        area = a*b;
        return area;
    }   
    
    public int getPerimetro (){
        int perimetro;
        perimetro = (a+b)*2;
        return perimetro;
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
