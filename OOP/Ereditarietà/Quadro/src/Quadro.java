public class Quadro extends Rettangolo {
    // Variabili
    private int l;
    private String autore, modello;
    // Costruttori
    public Quadro (){
        super(50, 50);
        l = 2;
        autore = "-";
        modello = "AK345";
    }
    
    public Quadro (int a, int b){
        super(a, b);
        l = 2;
        autore = "-";
        modello = "AK345";
    }
    public Quadro (int a, int b, int l, String autore, String modello) {
        super(a, b);
        this.l = l;
        this.autore = autore;
        this.modello = modello;
    }
    
    public Quadro (Quadro due){
        super(due.getA(), due.getB());
        this.l = due.getL();
        this.autore = due.getAutore();
        this.modello = due.getModello();
    }
    
    public int getL(){
        return l;
    }
    
    
    public String getAutore(){
        return autore;
    }
    
    public String getModello(){
        return modello;
    }
    
    public void setL (int l){
        this.l = l;
    }
    
    public void setAutore (String a){
        this.autore = a;
    }
    
    public void setModello (String m){
        this.modello = m;
    }
    
    public int getAreaCornice (){
        int area;
        area = ((super.getA()+(l*2))*(super.getB()+(l*2))) - super.getArea();
        return area;
    }
    
    public String toString (){
        String s;
        s = "Quadro ("+super.getA()+" X "+super.getB()+")"+ " Autore: "+autore+ " Cornice: "+modello+" "+ getL()+"cm";
        return s;
    }
}
